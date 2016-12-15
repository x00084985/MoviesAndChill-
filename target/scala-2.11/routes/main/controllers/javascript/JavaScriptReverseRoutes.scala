
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/MoviesAndChill-/conf/routes
// @DATE:Thu Dec 15 21:48:32 GMT 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def help: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.help",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "help"})
        }
      """
    )
  
    // @LINE:25
    def horror: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.horror",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "horror"})
        }
      """
    )
  
    // @LINE:32
    def newshorror_1: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.newshorror_1",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newshorror_1"})
        }
      """
    )
  
    // @LINE:21
    def action: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.action",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "action"})
        }
      """
    )
  
    // @LINE:31
    def newscomedy_3: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.newscomedy_3",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newscomedy_3"})
        }
      """
    )
  
    // @LINE:30
    def newscomedy_2: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.newscomedy_2",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newscomedy_2"})
        }
      """
    )
  
    // @LINE:22
    def comedy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.comedy",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "comedy"})
        }
      """
    )
  
    // @LINE:34
    def newshorror_3: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.newshorror_3",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newshorror_3"})
        }
      """
    )
  
    // @LINE:35
    def signup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signup",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:28
    def newsaction_3: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.newsaction_3",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newsaction_3"})
        }
      """
    )
  
    // @LINE:23
    def form: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.form",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "form"})
        }
      """
    )
  
    // @LINE:33
    def newshorror_2: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.newshorror_2",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newshorror_2"})
        }
      """
    )
  
    // @LINE:26
    def newsaction_1: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.newsaction_1",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newsaction_1"})
        }
      """
    )
  
    // @LINE:27
    def newsaction_2: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.newsaction_2",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newsaction_2"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:29
    def newscomedy_1: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.newscomedy_1",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newscomedy_1"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(base1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "public/base.css" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("base", base1)])})
        }
      """
    )
  
    // @LINE:19
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }


}
