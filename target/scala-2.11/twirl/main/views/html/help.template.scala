
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object help_Scope0 {
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

class help extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
  <div id="Container">
   <div id="infohead"><h3>Helpful Information</h3></div>
   <div id="Info">
   
    <p>We hope that you are enjoying your time on our brand new up and coming web site. We here at <a href="index.html" alt="Link to the Home page.">Movies & Chill</a> make a point of creating a web experience that is both intuitive and user friendly so your desired film review is never more than three clicks away.</p>
	<p>We would also love to here from you, the user. Your feedback is very important to our website. Please, don't be afraid to let us know what you think we could improve on and we will do our best to achieve it.</p>
	<p>Finally, if you are as crazy about movies as we are, we would love for you to to show us what you've got to write about. We're looking for writers who are both critical and skilled in the art of creative writing. We know that both aren't easy to come by but we also know that they exist!</p>
	<p>Please don't hesitate to give us feedback to make your experience of <a href="index.html" alt="Link to the Home page.">Movies & Chill</a> greater one. Also, don't be afraid to show us what you've got.<a href="form.html" alt="Link to the Form page.">Post a film review</a> to us and you might just start your writing career here at Movies & Chill</p>
   </div>
  <div id="contactshead"> <h3>Contact Details</h3></div>
	<div id="Contacts">
    <ul>
    <li> For Feedback & Help, email us at: <br><br>movies&chill_hf"""),_display_(/*37.68*/gmail/*37.73*/.com),format.raw/*37.77*/("""</li><br><br>
    <li> For information on how to become a writer, email us at: <br><br>movies&chill_publisher"""),_display_(/*38.97*/gmail/*38.102*/.com),format.raw/*38.106*/("""</li>
   </ul>
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
    
     <a href="http://www.facebook.com/" id="F" alt="Link to our Facebook page."><img src="Facebook.png" alt="Image of Facebook Logo"></a>
     <a href="http://ww.twitter.com/" id="T" alt="Link to our Twitter page."><img src="Twitter.png" alt="Image of Twitter Logo"></a>
    </div>
    </div>
    
  
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
object help extends help_Scope0.help
              /*
                  -- GENERATED --
                  DATE: Fri Nov 18 14:53:54 GMT 2016
                  SOURCE: /home/wdd/webapps/MoviesAndChill/app/views/help.scala.html
                  HASH: 8e318785ae84e6d5be208477472fa0d5885c86fc
                  MATRIX: 825->0|3477->2625|3491->2630|3516->2634|3653->2744|3668->2749|3694->2753
                  LINES: 32->1|68->37|68->37|68->37|69->38|69->38|69->38
                  -- GENERATED --
              */
          