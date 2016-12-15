
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
      <head>
	 
         <meta charset="UTF-8">
          <title>Movies & Chill</title>
			<meta name="viewport" content="width=device-width, initial-scale=1">
			<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
			<link href='"""),_display_(/*17.17*/routes/*17.23*/.Assets.at("stylesheets/base.css")),format.raw/*17.57*/("""' rel="stylesheet" alt="Cascading Style Sheet.">
			
	 <div id="Logo">
	 <span class="glyphicons glyphicons-user"></span>
    <a href="/" alt="Logo Link" ><h1>Movies & Chill</h1></a>
	<div id="signup">
	<a href="/signup" alt="Logo Link" ><i class="fa fa-user-plus"  style="font-size:48px; right: 10em; color:white"></i></a>

</div>
</div>
</head>
    <body background=""""),_display_(/*28.24*/routes/*28.30*/.Assets.versioned("images/cinred.jpeg")),format.raw/*28.69*/("""">
        <div id="cinema red"></div>
	 <div id="Navigation">
            <div id="Home"><a href="/" alt="Link to the Homepage">HOME</a></div><br><br>
			
            <div id="Action"><a href="/action"  alt="Link to Actionpage">ACTION</a></div><br><br>
			
            <div id="Comedy"><a href="/comedy"  alt="Link to Comedypage">COMEDY</a></div><br><br>
			
            <div id="Horror"><a href="/horror"  alt="Link to the Horrorpage">HORROR</a></div>
			</div>
       
<div id="Container">

<div id="frontpage"><a href="/" alt="Link to the Homepage"><h2>HOME</h2></a>
	</div>	
	

    """),_display_(/*46.6*/content),format.raw/*46.13*/("""

"""),format.raw/*48.1*/("""</div>
  <footer>
	
	
    
    
	  <div id="Footer">
            <p>
                Copyright &copyMovies&Chill.com
            </p>
			<div id="FooterNav">
			<div id="FootNavHelp">
			<a href="/help" alt="Link to our help page.">Get In Touch With Us</a>
			
			
			
			</div>
			
			 <a href="https://www.facebook.com/" id="F" alt="Link to Find us on Facebook"><img src=""""),_display_(/*66.93*/routes/*66.99*/.Assets.versioned("images/Facebook.png")),format.raw/*66.139*/(""""
			 <a href="https://twitter.com/?lang=en" id="T" alt="Link to Find us on Twitter"><img src=""""),_display_(/*67.95*/routes/*67.101*/.Assets.versioned("images/Twitter.png")),format.raw/*67.140*/(""""
			  
			</div>
			
        </div>
		
	</footer>
-->	 
		
    
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Thu Dec 15 19:40:25 GMT 2016
                  SOURCE: /home/wdd/webapps/MoviesAndChill-/app/views/main.scala.html
                  HASH: be259ff566af4010cbfa9e38ada5b41e1b5667ac
                  MATRIX: 1002->260|1127->290|1155->292|1508->618|1523->624|1578->658|1975->1028|1990->1034|2050->1073|2664->1661|2692->1668|2721->1670|3123->2045|3138->2051|3200->2091|3323->2187|3339->2193|3400->2232
                  LINES: 32->7|37->7|39->9|47->17|47->17|47->17|58->28|58->28|58->28|76->46|76->46|78->48|96->66|96->66|96->66|97->67|97->67|97->67
                  -- GENERATED --
              */
          