
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
    <title>S3 Browser</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</head>


<body class="container">

"""),_display_(/*18.2*/helper/*18.8*/.form(action = routes.Application.uploadFile())/*18.55*/{_display_(Seq[Any](format.raw/*18.56*/("""
    """),format.raw/*19.5*/("""<form>
        <div class="form-group">
            <label>Upload a file</label>
            <input type="file" name="uploadfile">
        </div>

        <button type="submit" class="btn btn-default">Submit</button>
    </form>
""")))}),format.raw/*27.2*/("""

"""),format.raw/*29.1*/("""<table class="table">
    <thead>
        <tr class="row">
            <th>
                File Path
            </th>
        </tr>
    </thead>
        """),_display_(/*37.10*/for((name) <- (names)) yield /*37.32*/{_display_(Seq[Any](format.raw/*37.33*/("""
            """),format.raw/*38.13*/("""<tr class="row">
                    <td>"""),_display_(/*39.26*/name),format.raw/*39.30*/("""</td>
            </tr>
        """)))}),format.raw/*41.10*/("""

"""),format.raw/*43.1*/("""</table>

</body>
</html>"""))}
  }

  def render(names:ArrayList[String]): play.twirl.api.HtmlFormat.Appendable = apply(names)

  def f:((ArrayList[String]) => play.twirl.api.HtmlFormat.Appendable) = (names) => apply(names)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jan 15 13:29:57 IST 2015
                  SOURCE: /home/rupesh/Downloads/foobar/app/views/showDir.scala.html
                  HASH: c3396f628a84cdc53911559531b2f82712e18f7e
                  MATRIX: 736->1|851->28|879->30|1406->531|1420->537|1476->584|1515->585|1547->590|1807->820|1836->822|2019->978|2057->1000|2096->1001|2137->1014|2206->1056|2231->1060|2295->1093|2324->1095
                  LINES: 26->1|29->1|31->3|46->18|46->18|46->18|46->18|47->19|55->27|57->29|65->37|65->37|65->37|66->38|67->39|67->39|69->41|71->43
                  -- GENERATED --
              */
          