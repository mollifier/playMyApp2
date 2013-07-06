package controllers

import play.api._
import play.api.mvc._

object TemplateController extends Controller {
  def show = Action {
    Ok(views.html.list("show list"))
  }
}

