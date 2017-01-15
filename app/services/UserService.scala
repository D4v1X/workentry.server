package services

import javax.inject.Inject

import models.jooq.Tables._
import models.pojos._

import utils.DB

/**
  * Created by davidsantiago on 15/1/17.
  */
class UserService @Inject()(db: DB) {

  def getAllUsers = {

    db.query { db =>

        db.selectFrom(TM_USER).fetchInto(classOf[TmUser])

    }

  }
}
