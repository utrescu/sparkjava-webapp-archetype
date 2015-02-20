package net.xaviersala;

import static spark.Spark.get;
import spark.servlet.SparkApplication;

public class App implements SparkApplication {

  @Override
  public void init() {    

    get("/", (req, res) -> {
      return "Hello, world";
    });
    
  }

}
