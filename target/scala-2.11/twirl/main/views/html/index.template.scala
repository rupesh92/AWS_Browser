
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
<html lang="en">
<!DOCTYPE html>
<html lang="en">
<head>
    <title>S3 Browser</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">

    <link rel="stylesheet" type="text/css" href="main.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</head>
<body class="container">
<style>

    .proxyDetails """),format.raw/*20.19*/("""{"""),format.raw/*20.20*/(""" """),format.raw/*20.21*/("""display:none; """),format.raw/*20.35*/("""}"""),format.raw/*20.36*/("""
    """),format.raw/*21.5*/(""".check:checked+.proxyDetails"""),format.raw/*21.33*/("""{"""),format.raw/*21.34*/("""
    """),format.raw/*22.5*/("""display:block;
    """),format.raw/*23.5*/("""}"""),format.raw/*23.6*/("""
"""),format.raw/*24.1*/("""</style>

    <div class ="container">
        <h1 class="head">Welcome to the S3 Browser</h1>
        <div class="jumbotron">
        """),_display_(/*29.10*/helper/*29.16*/.form(action = routes.Application.check())/*29.58*/{_display_(Seq[Any](format.raw/*29.59*/("""
        """),format.raw/*30.9*/("""<form role="form" class="form-horizontal" >
                <div class="form-group">
                     <label for="accessId" class="inplabel">Access ID:</label>
                    <input class="form-control" id="accessId" name="access" placeholder="AccessID">
                </div>
                <div class="form-group">
                    <label for="secretKey" class="inplabel">Secret Key:</label>
                    <input class="form-control" id = "secretKey" type="password" name="secret" placeholder="SecretKey">
                </div>
                <div class="form-group">
                    <label for="bucket" class="inplabel">Bucket Name:</label>
                    <input class="form-control" id="bucket" name="bucketName" placeholder="Bucket Name">
                </div>

                <div class="form-group">
                    <label>Proxy Manual Configuration</label>
                    <input class="check" type="checkbox" name="checkbox" >



                    <div class="proxyDetails" >
                        <div class="form-group">
                            <label for="ip" class="inplabel">IP Address</label>
                            <input class="form-control" id="ip" name="ip" placeholder="IP">
                        </div>
                        <div class="form-group">
                            <label for="port" class="inplabel">Port Number</label>
                            <input class="form-control" id = "port" type="text" name="port" placeholder="Port Number">
                        </div>
                    </div>


                </div>

            <button class="btn btn-primary" type="submit">Submit</button>
        </form>
            </div>
""")))}),format.raw/*67.2*/("""
"""),format.raw/*68.1*/("""</div>
    <script src="https://code.jquery.com/jquery.js"></script>
    <!-- Include all compiled plugins (below), or include individual files
          as needed -->
    <script src="js/bootstrap.min.js"></script>

</body>
</html>


"""))}
  }

  def render(userForm:play.data.Form[models.Bar]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((play.data.Form[models.Bar]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jan 15 12:59:47 IST 2015
                  SOURCE: /home/rupesh/Downloads/foobar/app/views/index.scala.html
                  HASH: b0396a8119c8f02998b70c5a6f4a19eb4a612858
                  MATRIX: 743->1|868->38|896->40|1541->657|1570->658|1599->659|1641->673|1670->674|1702->679|1758->707|1787->708|1819->713|1865->732|1893->733|1921->734|2084->870|2099->876|2150->918|2189->919|2225->928|3980->2653|4008->2654
                  LINES: 26->1|29->1|31->3|48->20|48->20|48->20|48->20|48->20|49->21|49->21|49->21|50->22|51->23|51->23|52->24|57->29|57->29|57->29|57->29|58->30|95->67|96->68
                  -- GENERATED --
              */
          