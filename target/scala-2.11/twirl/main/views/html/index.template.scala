
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("home")/*2.14*/{_display_(Seq[Any](format.raw/*2.15*/("""


"""),format.raw/*5.1*/("""<div id="container1"><div id="headline1"><a href="/newscomedy_1" alt="Link to Review in Comedy Section."><div id="headlineIcon"><img src=""""),_display_(/*5.140*/routes/*5.146*/.Assets.versioned("images/Bridget.jpg")),format.raw/*5.185*/("""" height="88" width="90" align="right"></div><h3> Bridget Jones' Baby<br><br> PURCHASE MOVIE</h3></a></div></div>
<br>
<hr>
<div id="container2"><div id="headline2"><a href="/newscomedy_2" alt="Link to Review in Comedy Section."><div id="headlineIcon"><img src=""""),_display_(/*8.140*/routes/*8.146*/.Assets.versioned("images/Storks.jpg")),format.raw/*8.184*/("""" height="88" width="90" align="right"></div><h3> Storks<br><br> PURCHASE MOVIE</h3></a></div></div>
<br>
<hr>
<div id="container3"><div id="headline3"><a href="/newshorror_1" alt="Link to Review in Horror Section."><div id="headlineIcon"><img src=""""),_display_(/*11.140*/routes/*11.146*/.Assets.versioned("images/Arrival.jpg")),format.raw/*11.185*/("""" height="88" width="90" align="right"></div><h3> Arrival<br><br>PURCHASE MOVIE</h3></a></div></div>
<br>
<hr>
<div id="container4"><div id="headline4"><a href="/newsaction_1" alt="Link to Review in Action Section."><div id="headlineIcon"><img src=""""),_display_(/*14.140*/routes/*14.146*/.Assets.versioned("images/JackReacher.jpg")),format.raw/*14.189*/("""" height="88" width="90" align="right"></div><h3> Jack Reacher: Never Go Back<br><br> PURCHASE MOVIE</h3></a></div></div>
<br>
<hr>		
<div id="container5"><div id="headline5"><a href="/newshorror_2" alt="Link to Review in Horror Section."><div id="headlineIcon"><img src=""""),_display_(/*17.140*/routes/*17.146*/.Assets.versioned("images/GOTT.jpg")),format.raw/*17.182*/("""" height="88" width="90" align="right"></div><h3> The Girl On The Train<br><br>PURCHASE MOVIE</h3></a></div></div>		
<br>
<hr>
<div id="container6"><div id="headline6"><a href="/newsaction_2" alt="Link to Review in Action Section."><div id="headlineIcon"><img src=""""),_display_(/*20.140*/routes/*20.146*/.Assets.versioned("images/Accountant.jpg")),format.raw/*20.188*/("""" height="88" width="90" align="right"></div><h3> Accountant<br><br> PURCHASE MOVIE</h3></a></div></div>
<br>
<hr>
<div id="container7"><div id="headline7"><a href="/newsaction_3" alt="Link to review in Action Section."><div id="headlineIcon"><img src=""""),_display_(/*23.140*/routes/*23.146*/.Assets.versioned("images/Strange.jpg")),format.raw/*23.185*/("""" height="88" width="90" align="right"></div><h3> Dr. Strange<br><br> PURCHASE MOVIE</h3></a></div></div>
<br>
<hr>
<div id="container8"><div id="headline8"><a href="/newshorror_3" alt="Link to Review in Horror Section."><div id="headlineIcon"><img src=""""),_display_(/*26.140*/routes/*26.146*/.Assets.versioned("images/DontBreath.jpeg")),format.raw/*26.189*/("""" height="88" width="90" align="right"></div><h3> Don't Breath<br><br>PURCHASE MOVIE</h3></a></div></div>
<br>
<hr>
<div id="container9"><div id="headline9"><a href="/newscomedy_3" alt="Link to Review in Comedy Section"><div id="headlineIcon"><img src=""""),_display_(/*29.139*/routes/*29.145*/.Assets.versioned("images/BadSanta.jpg")),format.raw/*29.185*/("""" height="88" width="90" align="right"></div><h3> Bad Santa 2<br><br>PURCHASE MOVIE</h3></a></div></div>	
<br>
<hr>

</div>
</body>
</html>   
""")))}),format.raw/*36.2*/("""
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
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Dec 15 21:47:06 GMT 2016
                  SOURCE: /home/wdd/webapps/MoviesAndChill-/app/views/index.scala.html
                  HASH: 5e3d4f76ceecc8452974a57652dc8566ed4ed7b0
                  MATRIX: 827->2|847->14|885->15|914->18|1080->157|1095->163|1155->202|1445->465|1460->471|1519->509|1797->759|1813->765|1874->804|2152->1054|2168->1060|2233->1103|2534->1376|2550->1382|2608->1418|2902->1684|2918->1690|2982->1732|3264->1986|3280->1992|3341->2031|3624->2286|3640->2292|3705->2335|3987->2589|4003->2595|4065->2635|4239->2779
                  LINES: 32->2|32->2|32->2|35->5|35->5|35->5|35->5|38->8|38->8|38->8|41->11|41->11|41->11|44->14|44->14|44->14|47->17|47->17|47->17|50->20|50->20|50->20|53->23|53->23|53->23|56->26|56->26|56->26|59->29|59->29|59->29|66->36
                  -- GENERATED --
              */
          