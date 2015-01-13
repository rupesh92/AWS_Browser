
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[models.Bar],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm:play.data.Form[models.Bar]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.39*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<header>
    <h1> Welcome to S3 Browser </h1>
</header>

<body>

"""),_display_(/*10.2*/helper/*10.8*/.form(action = routes.Application.check())/*10.50*/{_display_(Seq[Any](format.raw/*10.51*/("""
     """),format.raw/*11.6*/("""<label>Access ID:</label>
    <input name="access"></br>
    <label>Secret Key:</label>
    <input name="secret"></br>
    <input type="submit">
""")))}),format.raw/*16.2*/("""



"""),format.raw/*20.1*/("""</body>


"""))}
  }

  def render(userForm:play.data.Form[models.Bar]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((play.data.Form[models.Bar]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 13 16:37:40 IST 2015
                  SOURCE: /home/rupesh/Downloads/foobar/app/views/index.scala.html
                  HASH: 4e312571e0a5048cf54a7a7241430cf8a982ec07
                  MATRIX: 743->1|868->38|896->40|1004->122|1018->128|1069->170|1108->171|1141->177|1317->323|1348->327
                  LINES: 26->1|29->1|31->3|38->10|38->10|38->10|38->10|39->11|44->16|48->20
                  -- GENERATED --
              */
          