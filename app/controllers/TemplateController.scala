package controllers

import play.api._
import play.api.mvc._
import models._

import org.squeryl.PrimitiveTypeMode._
import org.squeryl.Schema
import org.squeryl.annotations.Column

object TemplateController extends Controller {
  def show = Action {
    inTransaction {
      val userList = CoreSchema.users.map(u => u.name).toList
      Ok(views.html.list("show user list", userList))
    }
  }

  def showDetail(id: Long) = Action {
    var userList = List[String]("mollifier", "user2", "user3")
    inTransaction {
      val user = CoreSchema.users.where(u => u.id === id).single
      Ok(views.html.list("show list detail " + user.name, userList))
    }

    //Ok(views.html.list("show list detail " + id, userList))
  }
}

