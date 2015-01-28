
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
object ShowDir2 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[ArrayList[String],play.twirl.api.HtmlFormat.Appendable] {

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
"""),format.raw/*19.1*/("""<form>
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
    """),_display_(/*37.6*/for((name) <- (names)) yield /*37.28*/{_display_(Seq[Any](format.raw/*37.29*/("""
    """),format.raw/*38.5*/("""<tr class="row">
        <td>"""),_display_(/*39.14*/name),format.raw/*39.18*/("""</td>
    </tr>
    """)))}),format.raw/*41.6*/("""

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
                  DATE: Thu Jan 29 02:04:21 IST 2015
                  SOURCE: /home/rupesh/AWSBrowser/app/views/ShowDir2.scala.html
                  HASH: 3035a46ee4dca1ad571c4965415d88ab2692f59d
                  MATRIX: 737->1|852->28|880->30|1407->531|1421->537|1477->584|1516->585|1544->586|1780->792|1809->794|1967->926|2005->948|2044->949|2076->954|2133->984|2158->988|2209->1009|2238->1011
                  LINES: 26->1|29->1|31->3|46->18|46->18|46->18|46->18|47->19|55->27|57->29|65->37|65->37|65->37|66->38|67->39|67->39|69->41|71->43
                  -- GENERATED --
              */
          