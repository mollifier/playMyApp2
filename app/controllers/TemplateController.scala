package controllers

import play.api._
import play.api.mvc._

object TemplateController extends Controller {
  def show = Action {
    var userList = List[String]("mollifier", "user2", "user3")
    Ok(views.html.list("show list", userList))
  }


  def showDetail = Action {
    var userList = List[String]("mollifier", "user2", "user3")
    Ok(views.html.list("show list detail", userList))
  }
}

