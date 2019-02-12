
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object gallerya extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Gallery")/*1.17*/{_display_(Seq[Any](format.raw/*1.18*/("""
      """),format.raw/*2.7*/("""<div class="bio">
          <h1>Andrew Teeters</h1>
          <img src=""""),_display_(/*4.22*/routes/*4.28*/.Assets.versioned("assets/profiler.jpg")),format.raw/*4.68*/("""" alt="image of artist">
          <h3>
              Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 
              Arcu non odio euismod lacinia at quis. Ut eu sem integer vitae justo eget magna. 
              At imperdiet dui accumsan sit amet nulla facilisi. Pretium lectus quam id leo in vitae turpis massa sed. 
              Integer eget aliquet nibh praesent. Dictumst vestibulum rhoncus est pellentesque elit ullamcorper. 
              Sem viverra aliquet eget sit amet tellus. Vitae proin sagittis nisl rhoncus mattis rhoncus. Mi bibendum neque egestas congue. 
              Consectetur libero id faucibus nisl tincidunt. 
              Nibh tortor id aliquet lectus proin nibh nisl condimentum id. Velit egestas dui id ornare arcu.
          </h3>
          
        </div>
    <ul class="gallery_box">
      <li>
        <a href="#0"><img src=""""),_display_(/*18.33*/routes/*18.39*/.Assets.versioned("assets/Tattoos/twin-black-crow-tattoos-on-leg-2.jpg")),format.raw/*18.111*/("""">
        <div class="box_data">
           
        </div></a>
      </li>
        <li>
        <a href="#0"><img src=""""),_display_(/*24.33*/routes/*24.39*/.Assets.versioned("assets/Tattoos/wolf_crows_tattoo_version_2_by_thetrollesque-d53gem2.jpg")),format.raw/*24.131*/("""">
        <div class="box_data">
           
        </div></a>
      </li>
        <li>
        <a href="#0"><img src=""""),_display_(/*30.33*/routes/*30.39*/.Assets.versioned("assets/Tattoos/raven_trash_polka.jpg")),format.raw/*30.96*/("""">
        <div class="box_data">
           
        </div></a>
      </li>
          <li>
        <a href="#0"><img src=""""),_display_(/*36.33*/routes/*36.39*/.Assets.versioned("assets/Tattoos/Rose.jpg")),format.raw/*36.83*/("""">
        <div class="box_data">
          
        </div></a>
      </li>
          <li style="    position: relative;
        top: -134px;">
        <a href="#0"><img src=""""),_display_(/*43.33*/routes/*43.39*/.Assets.versioned("assets/Tattoos/wolf_trash_polka.jpg")),format.raw/*43.95*/("""">
        <div class="box_data">
           
        </div></a>
      </li>
          <li>
        <a href="#0"><img src=""""),_display_(/*49.33*/routes/*49.39*/.Assets.versioned("assets/Tattoos/small-wolf-tattoo-for-men.jpg")),format.raw/*49.104*/("""">
        <div class="box_data">
           
        </div></a>
      </li>
      
    </ul>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 12 15:40:12 GMT 2019
                  SOURCE: /home/wdd/Desktop/Year2Project/Year2Pro/app/views/gallerya.scala.html
                  HASH: f85f4ae5b645312a2152de2cc240928c3907f4cd
                  MATRIX: 1033->1|1056->16|1094->17|1127->24|1226->97|1240->103|1300->143|2263->1079|2278->1085|2372->1157|2521->1279|2536->1285|2650->1377|2799->1499|2814->1505|2892->1562|3043->1686|3058->1692|3123->1736|3326->1912|3341->1918|3418->1974|3569->2098|3584->2104|3671->2169
                  LINES: 33->1|33->1|33->1|34->2|36->4|36->4|36->4|50->18|50->18|50->18|56->24|56->24|56->24|62->30|62->30|62->30|68->36|68->36|68->36|75->43|75->43|75->43|81->49|81->49|81->49
                  -- GENERATED --
              */
          