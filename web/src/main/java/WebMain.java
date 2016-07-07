import spark.ModelAndView;
import spark.TemplateEngine;
import spark.template.mustache.MustacheTemplateEngine;

import java.util.Collections;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;

public class WebMain {
    public static void main(String[] args) {
        TemplateEngine templateEngine = new MustacheTemplateEngine();

        staticFileLocation("/assets");
        get("/", (req, res) -> new ModelAndView(Collections.emptyMap(), "home.mustache"), templateEngine);
    }
}
