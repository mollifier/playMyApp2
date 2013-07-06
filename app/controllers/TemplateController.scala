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
      val userList = CoreSchema.users.toList
      Ok(views.html.list("show user list", userList))
    }
  }

  def showDetail(id: Long) = Action {
    inTransaction {
      val user = CoreSchema.users.where(u => u.id === id).single
      Ok(views.html.userDetail("show detail", user))
    }
  }
}

