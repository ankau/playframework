package controllers

import play.api.mvc._
import javax.inject._
import models.Product
import play.api.i18n.{I18nSupport, Messages, MessagesApi}

class Products @Inject() (cc: ControllerComponents) extends AbstractController(cc) with I18nSupport {

  def list = Action {implicit request =>

    val products = Product.findAll

    Ok(views.html.products.list(products))

  }

}
