package utils

import javax.inject.Inject

import akka.actor.ActorSystem
import org.jooq.impl.DSL
import org.jooq.{DSLContext, SQLDialect}
import play.api.db.Database

import scala.concurrent.{ExecutionContext, Future}

class DB @Inject()(db: Database, system: ActorSystem) {


  implicit val databaseContext: ExecutionContext = system.dispatchers.lookup("contexts.database")


  def query[A](queryFn: DSLContext => A): Future[A] = Future {
    db.withConnection { connection =>

      val dSLContext = DSL.using(connection, SQLDialect.POSTGRES)

      queryFn apply dSLContext

    }
  }


  def withTransaction[A](queryFn: DSLContext => A): Future[A] = Future {
    db.withTransaction { connection =>

      val dSLContext = DSL.using(connection, SQLDialect.POSTGRES)

      queryFn apply dSLContext

    }
  }

}
