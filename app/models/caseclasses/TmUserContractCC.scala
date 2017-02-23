package models.caseclasses

import java.time.LocalDate

import play.api.libs.json.{Json, OWrites, Reads}

/**
  * Created by davidsantiago on 16/2/17.
  */
case class TmUserContractCC(id: Option[Int],
                            daysPerWeek: Int,
                            description: String,
                            endDate: LocalDate,
                            hoursPerWeek: Int,
                            startDate: LocalDate,
                            userId: Int)

object TmUserContractCC {

  implicit val tmUserWrites: OWrites[TmUserContractCC] = Json.writes[TmUserContractCC]
  implicit val tmUserRead: Reads[TmUserContractCC] = Json.reads[TmUserContractCC]

}