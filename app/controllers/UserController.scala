package controllers

import javax.inject.Inject

import scala.collection.JavaConversions._

import models.caseclasses.TmUserCC
import play.api.libs.json.Json
import play.api.mvc.{Action, Controller}
import services.UserService

import scala.concurrent.ExecutionContext

/**
  * Created by davidsantiago on 15/1/17.
  */
class UserController @Inject() (userService: UserService) (implicit ec: ExecutionContext) extends Controller {

  implicit val tmUserWrites = Json.writes[TmUserCC]

  def getAllUsers = Action.async {

    userService.getAllUsers.map { tmUserList =>

      Ok(Json.toJson(TmUserCC.fromPojoList(tmUserList)))

    }

  }
}
