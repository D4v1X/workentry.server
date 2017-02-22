package controllers

import javax.inject.Inject

import models.caseclasses.TmUserCC
import play.api.libs.json.Json
import play.api.mvc.{Action, Controller}
import services.UserService

import scala.concurrent.ExecutionContext.Implicits.global


class UserController @Inject() (userService: UserService) extends Controller {


  def findAll = Action.async {

    userService.findAll.map { tmUserList =>

      Ok(Json.toJson(TmUserCC.fromPojoList(tmUserList)))

    }.recover {

      case err => InternalServerError(s"Error retrieving the find All Users: ${err.getMessage}")

    }

  }

  def findById(id: Int) = Action.async {

    userService.findById(id).map { tmUser =>

      Ok(Json.toJson(TmUserCC.fromPojo(tmUser)))

    }.recover {

      case err => InternalServerError(s"Error retrieving the find user with id: $id -> msg: ${err.getMessage}")

    }

  }

  def add() = Action.async(parse.json) { request =>

    val tmUserCC = request.body.validate[TmUserCC].get

    userService.add(tmUserCC).map { _ =>

      Ok("")

    }.recover {

      case err => InternalServerError(s"Error retrieving the add user with $tmUserCC -> msg: ${err.getMessage}")

    }

  }

  def update() = Action.async(parse.json) { request =>

    val tmUserCC = request.body.validate[TmUserCC].get

    userService.update(tmUserCC).map { _ =>

      Ok("")

    }.recover {

      case err => InternalServerError(s"Error retrieving the update user with $tmUserCC -> msg: ${err.getMessage}")

    }

  }

  def delete(id: Int) = Action.async {

    userService.delete(id).map { _ =>

      Ok("")

    }.recover {

      case err => InternalServerError(s"Error retrieving the delete user with id: $id -> msg ${err.getMessage}")

    }

  }
}
