package io.github.ilyalevelev.webapp;

import spark.Spark;

public class SparkMain {

    public static void main(String[] args) {

        Spark.get("/about", (req, res) -> "about the company");

        // When you launch the server, you can access this endpoint with http://localhost:4567/news
        Spark.get("/news", (req, res) -> {

            // Define a News class
            // Every News has title and text

            // Here create 3 News objects and put them in a list
            // Loop through the list and built the html

            String html = "";
            html = html + "<h1>The news</h1>\n";

            // You will remove this part, because you will add the actual news
            html = html + "<h3>Hurricane in Texas</h3>\n";
            html = html + "<p>There was bla bla...<p>";

            System.out.println(html);

            return html;
        });
    }
}