package controllers

import javax.inject.Inject

import models.caseclasses.TmUserCC
import play.api.libs.json.Json
import play.api.mvc.{Action, Controller}
import services.UserService

import scala.concurrent.ExecutionContext.Implicits.global


class UserController @Inject() (userService: UserService) extends Controller {


  def findAllUsers = Action.async {

    userService.findAllUsers.map { tmUserList =>

      Ok(Json.toJson(TmUserCC.fromPojoList(tmUserList)))

    }.recover {

      case err => InternalServerError(s"Error retrieving the find All Users: ${err.getMessage}")

    }

  }

  def findUserById(id: Int) = Action.async {

    userService.findUserById(id).map { tmUser =>

      Ok(Json.toJson(TmUserCC.fromPojo(tmUser)))

    }.recover {

      case err => InternalServerError(s"Error retrieving the find user with id: $id -> msg: ${err.getMessage}")

    }

  }

  def addUser() = Action.async(parse.json) { request =>

    val tmUserCC = request.body.validate[TmUserCC].get

    userService.addUser(tmUserCC).map { _ =>

      Ok("")

    }.recover {

      case err => InternalServerError(s"Error retrieving the add user with $tmUserCC -> msg: ${err.getMessage}")

    }

  }

  def updateUser() = Action.async(parse.json) { request =>

    val tmUserCC = request.body.validate[TmUserCC].get

    userService.updateUser(tmUserCC).map { _ =>

      Ok("")

    }.recover {

      case err => InternalServerError(s"Error retrieving the update user with $tmUserCC -> msg: ${err.getMessage}")

    }

  }

  def deleteUser(id: Int) = Action.async {

    userService.deleteUser(id).map { _ =>

      Ok("")

    }.recover {

      case err => InternalServerError(s"Error retrieving the delete user with id: $id -> msg ${err.getMessage}")

    }

  }
}
