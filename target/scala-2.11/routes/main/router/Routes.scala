
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/MoviesAndChill-/conf/routes
// @DATE:Thu Dec 15 17:46:12 GMT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:8
  CountController_3: controllers.CountController,
  // @LINE:10
  AsyncController_2: controllers.AsyncController,
  // @LINE:15
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:8
    CountController_3: controllers.CountController,
    // @LINE:10
    AsyncController_2: controllers.AsyncController,
    // @LINE:15
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, CountController_3, AsyncController_2, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, CountController_3, AsyncController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """public/base.css""", """controllers.Assets.at(path:String = "/public", base:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """action""", """controllers.HomeController.action"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comedy""", """controllers.HomeController.comedy"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """form""", """controllers.HomeController.form"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """help""", """controllers.HomeController.help"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """horror""", """controllers.HomeController.horror"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """index2""", """controllers.HomeController.index2"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newsaction_1""", """controllers.HomeController.newsaction_1"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newsaction_2""", """controllers.HomeController.newsaction_2"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newsaction_3""", """controllers.HomeController.newsaction_3"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newscomedy_1""", """controllers.HomeController.newscomedy_1"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newscomedy_2""", """controllers.HomeController.newscomedy_2"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newscomedy_3""", """controllers.HomeController.newscomedy_3"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newshorror_1""", """controllers.HomeController.newshorror_1"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newshorror_2""", """controllers.HomeController.newshorror_2"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newshorror_3""", """controllers.HomeController.newshorror_3"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.HomeController.signup"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_3.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_2.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Assets_at3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("public/base.css")))
  )
  private[this] lazy val controllers_Assets_at3_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """public/base.css"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Assets_versioned4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned4_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_action5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("action")))
  )
  private[this] lazy val controllers_HomeController_action5_invoker = createInvoker(
    HomeController_0.action,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "action",
      Nil,
      "GET",
      """""",
      this.prefix + """action"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_comedy6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comedy")))
  )
  private[this] lazy val controllers_HomeController_comedy6_invoker = createInvoker(
    HomeController_0.comedy,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "comedy",
      Nil,
      "GET",
      """""",
      this.prefix + """comedy"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_HomeController_form7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("form")))
  )
  private[this] lazy val controllers_HomeController_form7_invoker = createInvoker(
    HomeController_0.form,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "form",
      Nil,
      "GET",
      """""",
      this.prefix + """form"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_HomeController_help8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("help")))
  )
  private[this] lazy val controllers_HomeController_help8_invoker = createInvoker(
    HomeController_0.help,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "help",
      Nil,
      "GET",
      """""",
      this.prefix + """help"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_HomeController_horror9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("horror")))
  )
  private[this] lazy val controllers_HomeController_horror9_invoker = createInvoker(
    HomeController_0.horror,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "horror",
      Nil,
      "GET",
      """""",
      this.prefix + """horror"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_HomeController_index210_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("index2")))
  )
  private[this] lazy val controllers_HomeController_index210_invoker = createInvoker(
    HomeController_0.index2,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index2",
      Nil,
      "GET",
      """""",
      this.prefix + """index2"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_HomeController_newsaction_111_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newsaction_1")))
  )
  private[this] lazy val controllers_HomeController_newsaction_111_invoker = createInvoker(
    HomeController_0.newsaction_1,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "newsaction_1",
      Nil,
      "GET",
      """""",
      this.prefix + """newsaction_1"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_HomeController_newsaction_212_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newsaction_2")))
  )
  private[this] lazy val controllers_HomeController_newsaction_212_invoker = createInvoker(
    HomeController_0.newsaction_2,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "newsaction_2",
      Nil,
      "GET",
      """""",
      this.prefix + """newsaction_2"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_HomeController_newsaction_313_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newsaction_3")))
  )
  private[this] lazy val controllers_HomeController_newsaction_313_invoker = createInvoker(
    HomeController_0.newsaction_3,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "newsaction_3",
      Nil,
      "GET",
      """""",
      this.prefix + """newsaction_3"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_HomeController_newscomedy_114_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newscomedy_1")))
  )
  private[this] lazy val controllers_HomeController_newscomedy_114_invoker = createInvoker(
    HomeController_0.newscomedy_1,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "newscomedy_1",
      Nil,
      "GET",
      """""",
      this.prefix + """newscomedy_1"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_HomeController_newscomedy_215_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newscomedy_2")))
  )
  private[this] lazy val controllers_HomeController_newscomedy_215_invoker = createInvoker(
    HomeController_0.newscomedy_2,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "newscomedy_2",
      Nil,
      "GET",
      """""",
      this.prefix + """newscomedy_2"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_HomeController_newscomedy_316_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newscomedy_3")))
  )
  private[this] lazy val controllers_HomeController_newscomedy_316_invoker = createInvoker(
    HomeController_0.newscomedy_3,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "newscomedy_3",
      Nil,
      "GET",
      """""",
      this.prefix + """newscomedy_3"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_HomeController_newshorror_117_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newshorror_1")))
  )
  private[this] lazy val controllers_HomeController_newshorror_117_invoker = createInvoker(
    HomeController_0.newshorror_1,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "newshorror_1",
      Nil,
      "GET",
      """""",
      this.prefix + """newshorror_1"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_HomeController_newshorror_218_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newshorror_2")))
  )
  private[this] lazy val controllers_HomeController_newshorror_218_invoker = createInvoker(
    HomeController_0.newshorror_2,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "newshorror_2",
      Nil,
      "GET",
      """""",
      this.prefix + """newshorror_2"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_HomeController_newshorror_319_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newshorror_3")))
  )
  private[this] lazy val controllers_HomeController_newshorror_319_invoker = createInvoker(
    HomeController_0.newshorror_3,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "newshorror_3",
      Nil,
      "GET",
      """""",
      this.prefix + """newshorror_3"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_HomeController_signup20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_HomeController_signup20_invoker = createInvoker(
    HomeController_0.signup,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signup",
      Nil,
      "GET",
      """""",
      this.prefix + """signup"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_3.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:15
    case controllers_Assets_at3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromQuery[String]("base", None)) { (path, base) =>
        controllers_Assets_at3_invoker.call(Assets_1.at(path, base))
      }
  
    // @LINE:19
    case controllers_Assets_versioned4_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned4_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:21
    case controllers_HomeController_action5_route(params) =>
      call { 
        controllers_HomeController_action5_invoker.call(HomeController_0.action)
      }
  
    // @LINE:22
    case controllers_HomeController_comedy6_route(params) =>
      call { 
        controllers_HomeController_comedy6_invoker.call(HomeController_0.comedy)
      }
  
    // @LINE:23
    case controllers_HomeController_form7_route(params) =>
      call { 
        controllers_HomeController_form7_invoker.call(HomeController_0.form)
      }
  
    // @LINE:24
    case controllers_HomeController_help8_route(params) =>
      call { 
        controllers_HomeController_help8_invoker.call(HomeController_0.help)
      }
  
    // @LINE:25
    case controllers_HomeController_horror9_route(params) =>
      call { 
        controllers_HomeController_horror9_invoker.call(HomeController_0.horror)
      }
  
    // @LINE:26
    case controllers_HomeController_index210_route(params) =>
      call { 
        controllers_HomeController_index210_invoker.call(HomeController_0.index2)
      }
  
    // @LINE:27
    case controllers_HomeController_newsaction_111_route(params) =>
      call { 
        controllers_HomeController_newsaction_111_invoker.call(HomeController_0.newsaction_1)
      }
  
    // @LINE:28
    case controllers_HomeController_newsaction_212_route(params) =>
      call { 
        controllers_HomeController_newsaction_212_invoker.call(HomeController_0.newsaction_2)
      }
  
    // @LINE:29
    case controllers_HomeController_newsaction_313_route(params) =>
      call { 
        controllers_HomeController_newsaction_313_invoker.call(HomeController_0.newsaction_3)
      }
  
    // @LINE:30
    case controllers_HomeController_newscomedy_114_route(params) =>
      call { 
        controllers_HomeController_newscomedy_114_invoker.call(HomeController_0.newscomedy_1)
      }
  
    // @LINE:31
    case controllers_HomeController_newscomedy_215_route(params) =>
      call { 
        controllers_HomeController_newscomedy_215_invoker.call(HomeController_0.newscomedy_2)
      }
  
    // @LINE:32
    case controllers_HomeController_newscomedy_316_route(params) =>
      call { 
        controllers_HomeController_newscomedy_316_invoker.call(HomeController_0.newscomedy_3)
      }
  
    // @LINE:33
    case controllers_HomeController_newshorror_117_route(params) =>
      call { 
        controllers_HomeController_newshorror_117_invoker.call(HomeController_0.newshorror_1)
      }
  
    // @LINE:34
    case controllers_HomeController_newshorror_218_route(params) =>
      call { 
        controllers_HomeController_newshorror_218_invoker.call(HomeController_0.newshorror_2)
      }
  
    // @LINE:35
    case controllers_HomeController_newshorror_319_route(params) =>
      call { 
        controllers_HomeController_newshorror_319_invoker.call(HomeController_0.newshorror_3)
      }
  
    // @LINE:36
    case controllers_HomeController_signup20_route(params) =>
      call { 
        controllers_HomeController_signup20_invoker.call(HomeController_0.signup)
      }
  }
}
