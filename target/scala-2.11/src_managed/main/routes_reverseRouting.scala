// @SOURCE:/home/rupesh/Downloads/foobar/conf/routes
// @HASH:3fae3adfb4c909685df4cea58474327e38c79a6a
// @DATE:Tue Jan 13 16:56:48 IST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:10
class ReverseAssets {


// @LINE:10
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:7
def check(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "bar")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:8
def showDir(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "showdir")
}
                        

}
                          
}
                  


// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:10
class ReverseAssets {


// @LINE:10
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:7
def check : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.check",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "bar"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:8
def showDir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.showDir",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showdir"})
      }
   """
)
                        

}
              
}
        


// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:10
class ReverseAssets {


// @LINE:10
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:7
def check(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.check(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "check", Seq(), "POST", """""", _prefix + """bar""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:8
def showDir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.showDir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "showDir", Seq(), "GET", """""", _prefix + """showdir""")
)
                      

}
                          
}
        
    