
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signup_Scope0 {
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

class signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("home")/*1.14*/{_display_(Seq[Any](format.raw/*1.15*/("""
	 """),format.raw/*2.3*/("""<form name="article" action="articleAction.php" method="post">
	 
	 <fieldset>
	 	
	 <legend>YOUR NEW ACCOUNT</legend>
	 
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
	 <p>
	 <label for="password"> CREATE PASSWORD:</label>
	 <input type="text" name="Password" id="Password"/>
	 <br>
	 
	 <p><input type="submit" name="SubmitForm" value="Create Account" class="CreateAccount" /></p>
	 
	 </p>
	 <br>
	 
	 
	 </fieldset>
	 
	 
					
	 </form>
	
        </div>
     </body>
     
     
     
     
     
 </html>
""")))}),format.raw/*43.2*/("""
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
object signup extends signup_Scope0.signup
              /*
                  -- GENERATED --
                  DATE: Thu Dec 08 16:08:55 GMT 2016
                  SOURCE: /home/wdd/webapps/MoviesAndChill-/app/views/signup.scala.html
                  HASH: b57359501656cc0ba2c9bd5134211ffbed963d37
                  MATRIX: 829->1|849->13|887->14|917->18|1752->823
                  LINES: 32->1|32->1|32->1|33->2|74->43
                  -- GENERATED --
              */
          