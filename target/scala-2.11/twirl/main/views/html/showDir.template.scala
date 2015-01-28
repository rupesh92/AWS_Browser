
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

<html >
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

</head>


<body class="container">



        <div ng-app= "" ng-controller="NamesCtrl">

            <label>Search File</label>
            <input type="text" data-ng-model="result" list="namesList">
            <datalist id="namesList">
                <option data-ng-repeat="n in names" value=""""),format.raw/*30.60*/("""{"""),format.raw/*30.61*/("""{"""),format.raw/*30.62*/("""n"""),format.raw/*30.63*/("""}"""),format.raw/*30.64*/("""}"""),format.raw/*30.65*/("""">
            </datalist>

        </div>
        <script>
                function test(callback)"""),format.raw/*35.40*/("""{"""),format.raw/*35.41*/("""
                    """),format.raw/*36.21*/("""$.getJSON("http://localhost:9000/getNames" ,function(data)"""),format.raw/*36.79*/("""{"""),format.raw/*36.80*/("""

                                """),format.raw/*38.33*/("""callback(data);


                         """),format.raw/*41.26*/("""}"""),format.raw/*41.27*/(""");
                """),format.raw/*42.17*/("""}"""),format.raw/*42.18*/("""

                """),format.raw/*44.17*/("""function NamesCtrl($scope) """),format.raw/*44.44*/("""{"""),format.raw/*44.45*/("""
                """),format.raw/*45.17*/("""var mydata;
                    test(function (data)"""),format.raw/*46.41*/("""{"""),format.raw/*46.42*/("""
                        """),format.raw/*47.25*/("""mydata=JSON.stringify(data).split("\"").join("").replace("[","").replace("]","").split(",");
                    """),format.raw/*48.21*/("""}"""),format.raw/*48.22*/(""");

                    alert("All contents of the directory fetched.");
                 $scope.names=mydata;
                """),format.raw/*52.17*/("""}"""),format.raw/*52.18*/("""


    """),format.raw/*55.5*/("""</script>

"""),_display_(/*57.2*/helper/*57.8*/.form(action = routes.Application.uploadFile())/*57.55*/{_display_(Seq[Any](format.raw/*57.56*/("""
"""),format.raw/*58.1*/("""<form>




    <div class="form-group">
        <label>Upload a file</label>
        <input type="file" name="uploadfile">
    </div>

    <button type="submit" class="btn btn-default">Submit</button>
</form>
""")))}),format.raw/*70.2*/("""




"""),format.raw/*75.1*/("""<table class="table">
    <thead>
    <tr class="row">
        <th>
            File Path
        </th>
    </tr>
    </thead>
    """),_display_(/*83.6*/for((name) <- (names)) yield /*83.28*/{_display_(Seq[Any](format.raw/*83.29*/("""
    """),format.raw/*84.5*/("""<tr class="row">
        <td>"""),_display_(/*85.14*/name),format.raw/*85.18*/("""</td>
    </tr>
    """)))}),format.raw/*87.6*/("""

"""),format.raw/*89.1*/("""</table>

</body>
</html>"""))}
  }

  def render(names:ArrayList[String]): play.twirl.api.HtmlFormat.Appendable = apply(names)

  def f:((ArrayList[String]) => play.twirl.api.HtmlFormat.Appendable) = (names) => apply(names)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jan 29 04:41:46 IST 2015
                  SOURCE: /home/rupesh/AWSBrowser/app/views/showDir.scala.html
                  HASH: 7767886f0c5d0cd3d111dbd9669ba324d0e3e185
                  MATRIX: 736->1|851->28|879->30|2049->1172|2078->1173|2107->1174|2136->1175|2165->1176|2194->1177|2321->1276|2350->1277|2399->1298|2485->1356|2514->1357|2576->1391|2647->1434|2676->1435|2723->1454|2752->1455|2798->1473|2853->1500|2882->1501|2927->1518|3007->1570|3036->1571|3089->1596|3230->1709|3259->1710|3414->1837|3443->1838|3477->1845|3515->1857|3529->1863|3585->1910|3624->1911|3652->1912|3892->2122|3924->2127|4082->2259|4120->2281|4159->2282|4191->2287|4248->2317|4273->2321|4324->2342|4353->2344
                  LINES: 26->1|29->1|31->3|58->30|58->30|58->30|58->30|58->30|58->30|63->35|63->35|64->36|64->36|64->36|66->38|69->41|69->41|70->42|70->42|72->44|72->44|72->44|73->45|74->46|74->46|75->47|76->48|76->48|80->52|80->52|83->55|85->57|85->57|85->57|85->57|86->58|98->70|103->75|111->83|111->83|111->83|112->84|113->85|113->85|115->87|117->89
                  -- GENERATED --
              */
          