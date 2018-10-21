package io.github.ilyalevelev.webapp;

import javafx.scene.input.InputMethodTextRun;
import spark.Spark;

import java.util.ArrayList;
import java.util.List;

import static java.awt.SystemColor.text;

public class SparkMain {

    public static void main(String[] args) {

        Spark.get("/about", (req, res) -> "about the company");

        // When you launch the server, you can access this endpoint with http://localhost:4567/news
        Spark.get("/news", (req, res) -> {

            // Define a News class
            // Every News has title and text

            // Here create 3 News objects and put them in a list
            // Loop through the list and built the html

            News news1 = new News("Badalona opens new Port", "Today Badalona opened it new port that will connect the city with the sea");
            News news2 = new News("Microsoft acquires GitHub","The big Software giant says connecting with IT engineers becomes increasingly important");
            News news3 = new News("New James Bond movie arrives in Cinema", "Daniel Craig said it will be the last time he stars in a James Bond movie");

            List<News> news = new ArrayList<>();
            news.add(news1);
            news.add(news2);
            news.add(news3);


            for (News n : news) {
                System.out.println(n.title + n.text);


            }

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