
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pagename: String)(content:Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta charset="UTF-8"/>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
	<link rel="stylesheet" media="screen" href='"""),_display_(/*11.47*/routes/*11.53*/.Assets.versioned("assets/styles.css")),format.raw/*11.91*/("""' />
	
	</head>
	<body>
	<header>
	<img src="banner.png" alt="picture of banner">
	</header>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark sticky-top">
  <ul class="navbar-nav">
  <li class="nav-item">
      <a class="nav-link" href="/">Home</a>
    </li>
    <li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
        Gallery
      </a>
      <div class="dropdown-menu">
        <a class="dropdown-item" href="/gallerya">Andrew</a>
        <a class="dropdown-item" href="#">Kevin</a>
        <a class="dropdown-item" href="#">Ming</a>
      </div>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">Appointment</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">Contact Us</a>
    </li>
	
	
  <li class="nav-item">
      <a class="nav-link" href="#">Login/Register</a>
    </li>
  </ul>
</nav>

<div class="body_layout">

	<main>
    """),_display_(/*50.6*/content),format.raw/*50.13*/("""
    """),format.raw/*51.5*/("""</main>
	</div>
  </body>
  </html>"""))
      }
    }
  }

  def render(pagename:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename) => (content) => apply(pagename)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 12 15:04:13 GMT 2019
                  SOURCE: /home/wdd/Desktop/Year2Project/Year2Pro/app/views/main.scala.html
                  HASH: 60371b962efc0e9120067422af21bdebfc95e7ab
                  MATRIX: 952->1|1078->34|1669->598|1684->604|1743->642|2731->1604|2759->1611|2791->1616
                  LINES: 28->1|33->2|42->11|42->11|42->11|81->50|81->50|82->51
                  -- GENERATED --
              */
          