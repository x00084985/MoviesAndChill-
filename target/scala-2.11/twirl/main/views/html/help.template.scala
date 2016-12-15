
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
   """),format.raw/*2.4*/("""<div id="infohead"><h3>Helpful Information</h3></div>
   <div id="Info">
   
    <p>We hope that you are enjoying your time on our brand new up and coming web site. We here at <a href="/index" alt="Link to the Home page.">Movies & Chill</a> make a point of creating a web experience that is both intuitive and user friendly so your desired film review is never more than three clicks away.</p>
	<p>We would also love to here from you, the user. Your feedback is very important to our website. Please, don't be afraid to let us know what you think we could improve on and we will do our best to achieve it.</p>
   </div>
  <div id="contactshead"> <h3>Contact Details</h3></div>
	<div id="Contacts">
    <ul>
    <li> For Feedback & Help, email us at: <br><br>movies&chill_hf@gmail.com</li><br><br></ul>
   </div>
  </div>
 
   </div>
 """)))}),format.raw/*16.3*/("""   
  
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
                  DATE: Thu Dec 15 20:04:48 GMT 2016
                  SOURCE: /home/wdd/webapps/MoviesAndChill-/app/views/help.scala.html
                  HASH: 69e39b9597b504b8141ce11b9d0d7f3d479b1e57
                  MATRIX: 825->1|845->13|883->14|913->18|1778->854
                  LINES: 32->1|32->1|32->1|33->2|47->16
                  -- GENERATED --
              */
          