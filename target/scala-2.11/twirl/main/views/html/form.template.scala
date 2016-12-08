
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object form_Scope0 {
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

class form extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
   <div id="Home"><a href="index.html" alt="Link to the Home page.">HOME</a></div><br><br>
   <div id="Action"><a href="action.html" alt="Link to the Action page.">ACTION</a></div><br><br>
   <div id="Comedy"><a href="comedy.html"  alt="Link to the Comedy page.">COMEDY</a></div><br><br>
   <div id="Horror"><a href="horror.html" alt="Link to the Horror page.">HORROR</a></div><br><br>
  </div>
	 <form name="article" action="articleAction.php" method="post">
	 
	 <fieldset>
	 	
	 <legend>YOUR DETAILS</legend>
	 
	 <p>
	 <label for="FullName">FIRST NAME:</label>
	 <input type="text" name="FulltName" id="FullName"/>
	 </p>
	 <P>
	 <label for="Surname">SURNAME:</label>
	 <input type="text" name="Surname" id="Surname"/>
	 <p>
	 <label for="email"> EMAIL:</label>
	 <input type="text" name="email" id="email"/>
	 
	 </p>
	 <br>
	 
	 
	 <legend>REVIEW DETAILS</legend>
	 
	 <p>
	 <label for="heading">HEADING:</label>
	 <input type="text" name="heading" id="heading"/>
	 </p>
	 <p>
	 <label for="content">CONTENT:</label>	
	 <textarea name="message" rows="10" cols="30" background="white"></textarea>
	 
	 </p>
	 <p>
	 <label for="source">SOURCE:</label>
	 <input type="text" name="source" id="source"/>
	 </p>
	 <p><input type="submit" name="SubmitForm" value="Submit Article" class="submit" /></p>
	 
	 </fieldset>
	 
	 
					
	 </form>
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
object form extends form_Scope0.form
              /*
                  -- GENERATED --
                  DATE: Fri Nov 18 14:53:54 GMT 2016
                  SOURCE: /home/wdd/webapps/MoviesAndChill/app/views/form.scala.html
                  HASH: 898ec845ead04001272cbe7ed952344f7d75b2f8
                  MATRIX: 825->0
                  LINES: 32->1
                  -- GENERATED --
              */
          