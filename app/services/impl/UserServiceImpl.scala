package services.impl

import javax.inject.Inject

import models.caseclasses.TmUserCC
import models.jooq.Tables._
import models.pojos.TmUser
import services.UserService
import utils.DB

import scala.collection.JavaConversions._
import scala.concurrent.Future

/**
  * Created by davidsantiago on 15/1/17.
  */
class UserServiceImpl @Inject()(db: DB) extends UserService {

  /** A person who uses our application.
    *
    * @return List of the TmUsers
    */
  override def findAll: Future[Seq[TmUser]] = {

    db.query { db =>

      db.selectFrom(TM_USER)
        .fetchInto(classOf[TmUser])
        .toList

    }

  }

  /** Find a user by id.
    *
    * @param userId id of the user.
    * @return a TmUser
    */
  override def findById(userId: Int): Future[TmUser] = {

    db.query { db =>

      db.selectFrom(TM_USER)
        .where(TM_USER.ID.eq(userId))
        .fetchOneInto(classOf[TmUser])

    }

  }

  /** Create a user with TmUserCC information.
    *
    * @param tmUserCC user information.
    * @return a TmUser
    */
  override def add(tmUserCC: TmUserCC): Future[Int] = {

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

  /** Create a user with TmUserCC information.
    *
    * @param tmUserCC user information.
    * @return a TmUser
    */
  override def update(tmUserCC: TmUserCC): Future[Int] = {

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

  /** Delete a user by user id.
    *
    * @param userId user id.
    * @return a TmUser
    */
  override def delete(userId: Int): Future[Int] = {

    db.query { db =>

      db.delete(TM_USER)
        .where(TM_USER.ID.equal(userId))
        .execute()

    }

  }

}
