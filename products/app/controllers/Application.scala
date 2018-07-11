package controllers

import javax.inject.Inject
import play.api.i18n.I18nSupport
import play.api.mvc._

class Application @Inject() (cc: ControllerComponents) extends AbstractController(cc) with I18nSupport {

  def index = Action {
    Redirect(routes.Products.list())
  }


}
