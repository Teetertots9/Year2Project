// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/Year2Project/Year2Pro/conf/routes
// @DATE:Tue Feb 12 14:44:04 GMT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
