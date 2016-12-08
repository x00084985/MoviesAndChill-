
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


Seq[Any](_display_(/*1.2*/main("home")/*1.14*/{_display_(Seq[Any](format.raw/*1.15*/("""
	 """),format.raw/*2.3*/("""<form name="article" action="articleAction.php" method="post">
	 
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
	 
		
     </body>
     
     
     
     
     
 </html>
""")))}),format.raw/*54.2*/("""
	
	 
	
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
                  DATE: Thu Dec 08 16:08:19 GMT 2016
                  SOURCE: /home/wdd/webapps/MoviesAndChill-/app/views/form.scala.html
                  HASH: 2219947d830d61f4b83bd301dda139f241b6f30f
                  MATRIX: 825->1|845->13|883->14|913->18|1997->1072
                  LINES: 32->1|32->1|32->1|33->2|85->54
                  -- GENERATED --
              */
          