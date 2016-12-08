
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


Seq[Any](_display_(/*1.2*/main("home")/*1.14*/{_display_(Seq[Any](format.raw/*1.15*/("""
  """),format.raw/*2.3*/("""<div id="Container">
   <div id="infohead"><h3>Helpful Information</h3></div>
   <div id="Info">
   
    <p>We hope that you are enjoying your time on our brand new up and coming web site. We here at <a href="/index" alt="Link to the Home page.">Movies & Chill</a> make a point of creating a web experience that is both intuitive and user friendly so your desired film review is never more than three clicks away.</p>
	<p>We would also love to here from you, the user. Your feedback is very important to our website. Please, don't be afraid to let us know what you think we could improve on and we will do our best to achieve it.</p>
	<p>Finally, if you are as crazy about movies as we are, we would love for you to to show us what you've got to write about. We're looking for writers who are both critical and skilled in the art of creative writing. We know that both aren't easy to come by but we also know that they exist!</p>
	<p>Please don't hesitate to give us feedback to make your experience of <a href="/index" alt="Link to the Home page.">Movies & Chill</a> greater one. Also, don't be afraid to show us what you've got.<a href="/form" alt="Link to the Form page.">Post a film review</a> to us and you might just start your writing career here at Movies & Chill</p>
   </div>
  <div id="contactshead"> <h3>Contact Details</h3></div>
	<div id="Contacts">
    <ul>
    <li> For Feedback & Help, email us at: <br><br>movies&chill_hf@gmail.com</li><br><br>
    <li> For information on how to become a writer, email us at: <br><br>movies&chill_publisher@gmail.com</li>
   </ul>
   </div>
  </div>
 
   </div>
 """)))}),format.raw/*21.3*/("""   
  
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
                  DATE: Thu Dec 08 16:08:55 GMT 2016
                  SOURCE: /home/wdd/webapps/MoviesAndChill-/app/views/help.scala.html
                  HASH: 1fd58bb101e10bb0ea3779be1932c8266eb8f61d
                  MATRIX: 825->1|845->13|883->14|912->17|2558->1635
                  LINES: 32->1|32->1|32->1|33->2|52->21
                  -- GENERATED --
              */
          