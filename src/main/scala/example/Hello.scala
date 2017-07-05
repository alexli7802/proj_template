package example


object Hello extends Greeting with App {
  
  val log = {
    import org.slf4j.{LoggerFactory,Logger}
    LoggerFactory.getLogger("Hello")
  }
  
  val cfg = {
    import com.typesafe.config.ConfigFactory
    ConfigFactory.load()
  }
  
  println(greeting)
  
  log.info("this is printed by [logback: slf4j.Logger]")

  if (cfg.hasPath("examples.greetings.oz")) {
    log.debug("OZs say: {}", cfg.getString("examples.greetings.oz"))
  }
}

trait Greeting {
  lazy val greeting: String = "hello"
}
