package io.github.ilyalevelev.webapp;

import spark.Spark;

public class SparkMain {

    public static void main(String[] args) {

        Spark.get("/about", (req, res) -> "about the company");

        Spark.get("/news", (req, res) -> {

            String html = "";
            html = html + "<h1>The news</h1>\n";
            html = html + "<p>the latest news will appear here<p>";

            System.out.println(html);

            return html;
        });
    }
}