package services.impl

import javax.inject.Inject

import models.caseclasses.TmUserContractCC
import models.jooq.Tables._
import models.pojos.TmUserContract
import services.UserContract
import utils.DB

import scala.collection.JavaConversions._
import scala.concurrent.Future

/**
  * Created by davidsantiago on 16/2/17.
  */
class UserContractImpl @Inject()(db: DB) extends UserContract {

  /** Find all contract in our application.
    *
    * @return List of the TmUsers
    */
  override def findAll(): Future[Seq[TmUserContract]] = {

    db.query { db =>

      db.selectFrom(TM_USER_CONTRACT)
        .fetchInto(classOf[TmUserContract])
        .toList

    }

  }

  /** Find a contract by id.
    *
    * @param contractId id of the user.
    * @return a TmUser
    */
  override def findById(contractId: Int): Future[TmUserContract] = {

    db.query { db =>

      db.selectFrom(TM_USER_CONTRACT)
        .where(TM_USER_CONTRACT.ID.eq(contractId))
        .fetchOneInto(classOf[TmUserContract])

    }

  }

  /** Create a contract with TmUserContractCC information.
    *
    * @param tmUserContractCC user information.
    * @return a TmUser
    */
  override def add(tmUserContractCC: TmUserContractCC): Future[Int] = {

    db.query { db =>

      db.insertInto(TM_USER_CONTRACT,
        TM_USER_CONTRACT.DAYS_PER_WEEK,
        TM_USER_CONTRACT.DESCRIPTION,
        TM_USER_CONTRACT.END_DATE,
        TM_USER_CONTRACT.HOURS_PER_WEEK,
        TM_USER_CONTRACT.START_DATE,
        TM_USER_CONTRACT.USER_ID)
        .values(
          tmUserContractCC.daysPerWeek,
          tmUserContractCC.description,
          tmUserContractCC.endDate,
          tmUserContractCC.hoursPerWeek,
          tmUserContractCC.startDate,
          tmUserContractCC.userId)
        .execute();


    }

  }

  /** Create a contract with TmUserContractCC information.
    *
    * @param tmUserContractCC user information.
    * @return a TmUser
    */
  override def update(tmUserContractCC: TmUserContractCC): Future[Int] = {

    db.query { db =>

      //TODO
//      db.update(TM_USER_CONTRACT)
//        .set(TM_USER_CONTRACT.DAYS_PER_WEEK, tmUserContractCC.daysPerWeek)
//        .set(TM_USER_CONTRACT.DESCRIPTION, tmUserContractCC.description)
//        .set(TM_USER_CONTRACT.END_DATE, tmUserContractCC.endDate)
//        .set(TM_USER_CONTRACT.HOURS_PER_WEEK, tmUserContractCC.hoursPerWeek)
//        .set(TM_USER_CONTRACT.START_DATE, tmUserContractCC.startDate)
//        .set(TM_USER_CONTRACT.USER_ID, tmUserContractCC.userId)
//        .where(TM_USER_CONTRACT.ID.equal(tmUserContractCC.id.get))
//        .execute()
      1

    }

  }

  /** Delete a contract by contract id.
    *
    * @param contractId user id.
    * @return a TmUser
    */
  override def delete(contractId: Int): Future[Int] = {

    db.query { db =>

      db.delete(TM_USER_CONTRACT)
        .where(TM_USER_CONTRACT.ID.equal(contractId))
        .execute()

    }

  }
}
