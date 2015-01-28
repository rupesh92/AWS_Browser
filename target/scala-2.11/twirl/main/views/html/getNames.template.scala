
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
object getNames extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[ArrayList[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(names : ArrayList[String]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.29*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
<head>
    <title>S3 Browser</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.js"></script>
    <script src= "http://ajax.googleapis.com/ajax/libs/angularjs/1.2.26/angular.min.js"></script>
    <script>
        app.controller('NamesCtrl', function($scope) """),format.raw/*18.54*/("""{"""),format.raw/*18.55*/("""
    """),format.raw/*19.5*/("""// get names using AngularJS AJAX API
    $http.get('/getNames').success(function(data)"""),format.raw/*20.50*/("""{"""),format.raw/*20.51*/("""
        """),format.raw/*21.9*/("""$scope.names = data;
    """),format.raw/*22.5*/("""}"""),format.raw/*22.6*/(""");
"""),format.raw/*23.1*/("""}"""),format.raw/*23.2*/(""");
    </script>
</head>


<body class="container">

<div>
    <ul>
        <li ng-repeat=" name in names">"""),format.raw/*32.40*/("""{"""),format.raw/*32.41*/("""{"""),format.raw/*32.42*/("""name"""),format.raw/*32.46*/("""}"""),format.raw/*32.47*/("""}"""),format.raw/*32.48*/("""</li>
    </ul>
</div>
<div ng-app="" ng-init="firstName=['hjhxd','hdj']">
    <p>You wrote: """),format.raw/*36.19*/("""{"""),format.raw/*36.20*/("""{"""),format.raw/*36.21*/(""" """),format.raw/*36.22*/("""firstName """),format.raw/*36.32*/("""}"""),format.raw/*36.33*/("""}"""),format.raw/*36.34*/("""</p>

    <input type="text" ng-autocomplete ng-model="search.result" details="search.details" options="firstName"/>
</div>



<div ng-init="applyFilter='John'">

    <p>"""),format.raw/*45.8*/("""{"""),format.raw/*45.9*/("""{"""),format.raw/*45.10*/(""" """),format.raw/*45.11*/("""applyFilter """),format.raw/*45.23*/("""}"""),format.raw/*45.24*/("""}"""),format.raw/*45.25*/("""</p>
</div>


"""),_display_(/*49.2*/helper/*49.8*/.form(action = routes.Application.uploadFile())/*49.55*/{_display_(Seq[Any](format.raw/*49.56*/("""
"""),format.raw/*50.1*/("""<form>
    <div class="form-group">
        <label>Upload a file</label>
        <input type="file" name="uploadfile">
    </div>

    <button type="submit" class="btn btn-default">Submit</button>
</form>
""")))}),format.raw/*58.2*/("""





"""),format.raw/*64.1*/("""<table class="table">
    <thead>
    <tr class="row">
        <th>
            File Path
        </th>
    </tr>
    </thead>
    """),_display_(/*72.6*/for((name) <- (names)) yield /*72.28*/{_display_(Seq[Any](format.raw/*72.29*/("""
    """),format.raw/*73.5*/("""<tr class="row">
        <td>"""),_display_(/*74.14*/name),format.raw/*74.18*/("""</td>
    </tr>
    """)))}),format.raw/*76.6*/("""

"""),format.raw/*78.1*/("""</table>

</body>
</html>"""))}
  }

  def render(names:ArrayList[String]): play.twirl.api.HtmlFormat.Appendable = apply(names)

  def f:((ArrayList[String]) => play.twirl.api.HtmlFormat.Appendable) = (names) => apply(names)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jan 29 02:04:20 IST 2015
                  SOURCE: /home/rupesh/AWSBrowser/app/views/getNames.scala.html
                  HASH: c94e52f7d9d8256adbce1e32dded9d7873c2b2d0
                  MATRIX: 737->1|852->28|880->30|1816->938|1845->939|1877->944|1992->1031|2021->1032|2057->1041|2109->1066|2137->1067|2167->1070|2195->1071|2330->1178|2359->1179|2388->1180|2420->1184|2449->1185|2478->1186|2599->1279|2628->1280|2657->1281|2686->1282|2724->1292|2753->1293|2782->1294|2979->1464|3007->1465|3036->1466|3065->1467|3105->1479|3134->1480|3163->1481|3204->1496|3218->1502|3274->1549|3313->1550|3341->1551|3577->1757|3610->1763|3768->1895|3806->1917|3845->1918|3877->1923|3934->1953|3959->1957|4010->1978|4039->1980
                  LINES: 26->1|29->1|31->3|46->18|46->18|47->19|48->20|48->20|49->21|50->22|50->22|51->23|51->23|60->32|60->32|60->32|60->32|60->32|60->32|64->36|64->36|64->36|64->36|64->36|64->36|64->36|73->45|73->45|73->45|73->45|73->45|73->45|73->45|77->49|77->49|77->49|77->49|78->50|86->58|92->64|100->72|100->72|100->72|101->73|102->74|102->74|104->76|106->78
                  -- GENERATED --
              */
          