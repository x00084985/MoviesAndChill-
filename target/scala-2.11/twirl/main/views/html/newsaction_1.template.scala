
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object newsaction_1_Scope0 {
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

class newsaction_1 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
 <html lang="en-US">
     <head>
	 
         <meta charset="UTF-8">
          <title>Movies & Chill</title>
			<meta name="viewport" content="width=device-width, initial-scale=1">
			<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
			<link href="base.css" rel="stylesheet" alt="Cascading Style Sheet.">
			
	 <div id="Logo">
	 <span class="glyphicons glyphicons-user"></span>
    <a href="signup.html" alt="Logo Link" ><h1>Movies & Chill</h1></a>
	<div id="signup">
	<a href="signup.html" alt="Logo Link" ><i class="fa fa-user-plus"  style="font-size:48px; right: 10em; color:white"></i></a>
	</div>
  </div>
	 <div id="cinema red"><body background="cinred.jpeg"></div>
        <div id="Navigation">
            <div id="Home"><a href="index.html" alt="Link to the Homepage">HOME</a></div><br><br>
			
            <div id="Action"><a href="action.html"  alt="Link to Actionpage">ACTION</a></div><br><br>
			
            <div id="Comedy"><a href="comedy.html"  alt="Link to Comedypage">COMEDY</a></div><br><br>
			
            <div id="Horror"><a href="horror.html"  alt="Link to the Horrorpage">HORROR</a></div>
			</div>

<div id="Container">




<div id="actionfrontpage"><a href="action.html" alt="Link to the Actionpage"><h2>ACTION</h2></a>
	</div>	
	
	
	<div id= "action1BODY">
	
	<div id="action1head"><h3>Review title</h3></div>
	<div id="action1subhead"><h4></h4></div>
	
<p>Review Body</p>
 

	

		</div>
               </div>
		
		<div id="Footer">
            <p>
                Copyright &copyMovies&Chill.com
            </p>
			<div id="FooterNav">
			<div id="FootNavHelp">
			<a href="help.html" alt="Link to our help page.">Get In Touch With Us</a>
			</div>
			
			 <a href="https://www.facebook.com/" id="F" alt="Link to Find us on Facebook"><img src="Facebook.png" alt="Image of Facebook Logo"></a>
			 <a href="https://twitter.com/?lang=en" id="T" alt="Link to Find us on Twitter"><img src="Twitter.png" alt="Image of twitter Logo"></a>
			  
			</div>
        </div>
		
		</body>
     
     
     
     
     
 </html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object newsaction_1 extends newsaction_1_Scope0.newsaction_1
              /*
                  -- GENERATED --
                  DATE: Fri Nov 18 14:53:54 GMT 2016
                  SOURCE: /home/wdd/webapps/MoviesAndChill/app/views/newsaction_1.scala.html
                  HASH: 096fd72729901c489ceacb30886ab8fcbf1fe12c
                  MATRIX: 841->0
                  LINES: 32->1
                  -- GENERATED --
              */
          