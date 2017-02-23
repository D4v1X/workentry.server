package models.caseclasses

import models.pojos.TmUser
import models.jooq.tables.records.TmUserRecord
import play.api.libs.json._

import scala.collection.mutable.ListBuffer

/**
  * Created by davidsantiago on 15/1/17.
  */
case class TmUserCC(id: Option[Int],
                    name: String,
                    email: String,
                    nif: String,
                    afiliationNo: String,
                    loginName: String,
                    password: String)

object TmUserCC {

  implicit val tmUserWrites: OWrites[TmUserCC] = Json.writes[TmUserCC]
  implicit val tmUserRead: Reads[TmUserCC] = Json.reads[TmUserCC]

  def fromPojoList(tmUserList: Seq[TmUser]): List[TmUserCC] = {

    val tmUserCCList = ListBuffer[TmUserCC]()

    tmUserList foreach { tmUser =>
      tmUserCCList += fromPojo(tmUser)
    }

    tmUserCCList.toList

  }

  def fromPojo(tmUser: TmUser): TmUserCC = {

    TmUserCC(
      Some(tmUser.getId),
      tmUser.getName,
      tmUser.getEmail,
      tmUser.getNif,
      tmUser.getAfiliationNo,
      tmUser.getLoginName,
      tmUser.getPassword
    )

  }

  def fromTmUserRecord(tmUserRecord: TmUserRecord): TmUserCC = {

    tmUserRecord.valuesRow.asInstanceOf[TmUserCC]
  }

}
