
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
object showDir extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[ArrayList[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(names : ArrayList[String]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.29*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>Displaying Contents</title>
</head>
<body>
<table>
    <tr>
        <th>
            File Path
        </th>
    </tr>
        """),_display_(/*17.10*/for((name) <- (names)) yield /*17.32*/{_display_(Seq[Any](format.raw/*17.33*/("""
            """),format.raw/*18.13*/("""<tr>
                    <td>"""),_display_(/*19.26*/name),format.raw/*19.30*/("""</td>
            </tr>
        """)))}),format.raw/*21.10*/("""
    """),format.raw/*22.5*/("""<tr>

</tr>
</table>

</body>
</html>"""))}
  }

  def render(names:ArrayList[String]): play.twirl.api.HtmlFormat.Appendable = apply(names)

  def f:((ArrayList[String]) => play.twirl.api.HtmlFormat.Appendable) = (names) => apply(names)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 13 17:31:30 IST 2015
                  SOURCE: /home/rupesh/Downloads/foobar/app/views/showDir.scala.html
                  HASH: 71a0d263d8db7064c512388b254bbe24a4c73c27
                  MATRIX: 736->1|851->28|879->30|1113->237|1151->259|1190->260|1231->273|1288->303|1313->307|1377->340|1409->345
                  LINES: 26->1|29->1|31->3|45->17|45->17|45->17|46->18|47->19|47->19|49->21|50->22
                  -- GENERATED --
              */
          