package services

import javax.inject.Inject

import models.caseclasses.TmUserCC
import models.jooq.Tables._
import models.pojos._
import utils.DB

import scala.collection.JavaConversions._
import scala.concurrent.Future

/**
  * Created by davidsantiago on 15/1/17.
  */
class UserService @Inject()(db: DB) {


  def findAllUsers: Future[Seq[TmUser]] = {

    db.query { db =>

      db.selectFrom(TM_USER)
        .fetchInto(classOf[TmUser])
        .toList

    }

  }


  def findUserById(id: Int): Future[TmUser] = {

    db.query { db =>

      db.selectFrom(TM_USER)
        .where(TM_USER.ID.eq(id))
        .fetchOneInto(classOf[TmUser])

    }

  }

  def addUser(tmUserCC: TmUserCC): Future[Int] = {

    db.query { db =>

      db.insertInto(TM_USER)
        .set(TM_USER.NAME, tmUserCC.name)
        .set(TM_USER.EMAIL, tmUserCC.email)
        .set(TM_USER.NIF, tmUserCC.nif)
        .set(TM_USER.AFILIATION_NO, tmUserCC.afiliationNo)
        .set(TM_USER.LOGIN_NAME, tmUserCC.loginName)
        .set(TM_USER.PASSWORD, tmUserCC.password)
        .execute()

    }

  }

  def updateUser(tmUserCC: TmUserCC): Future[Int] = {
    db.query { db =>

      db.update(TM_USER)
        .set(TM_USER.NAME, tmUserCC.name)
        .set(TM_USER.EMAIL, tmUserCC.email)
        .set(TM_USER.NIF, tmUserCC.nif)
        .set(TM_USER.AFILIATION_NO, tmUserCC.afiliationNo)
        .set(TM_USER.LOGIN_NAME, tmUserCC.loginName)
        .set(TM_USER.PASSWORD, tmUserCC.password)
        .where(TM_USER.ID.equal(tmUserCC.id))
        .execute()

    }
  }

  def deleteUser(id: Int): Future[Int] = {

    db.query { db =>

      db.delete(TM_USER)
        .where(TM_USER.ID.equal(id))
        .execute();

    }

  }

}
