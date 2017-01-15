package models.caseclasses

import java.util

import models.pojos.TmUser

import scala.collection.mutable.ListBuffer

/**
  * Created by davidsantiago on 15/1/17.
  */
case class TmUserCC(id: Int,
                    name: String,
                    email: String,
                    nif: String,
                    afiliationNo: String,
                    loginName: String,
                    password: String)

object TmUserCC {

  def fromPojoList(tmUserList: Seq[TmUser]): List[TmUserCC] = {

    val tmUserCCList = ListBuffer[TmUserCC]()

    tmUserList foreach { tmUser =>
      tmUserCCList += fromPojo(tmUser)
    }

    tmUserCCList.toList

  }

  def fromPojo(tmUser: TmUser): TmUserCC = {

    TmUserCC(
      tmUser.getId,
      tmUser.getName,
      tmUser.getEmail,
      tmUser.getNif,
      tmUser.getAfiliationNo,
      tmUser.getLoginName,
      tmUser.getPassword
    )

  }

}
