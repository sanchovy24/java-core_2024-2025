package laba8.IndTask3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

public class ParseHtmlNews {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("http://fat.urfu.ru/index.htm").get();

            Elements newsParent = doc
                    .select("body > table > tbody > tr > td > div > table > " +
                            "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                            "tr > td:nth-child(1)");

            String filePath = "src/laba8/IndTask3/news.txt";

            try (FileWriter writer = new FileWriter(filePath)) {
                for (int i = 3; i < 20; i++) {
                    if (!(i % 2 == 0)) {
                        List<Node> nodes = newsParent.get(0).childNodes();
                        Element newsItem = (Element) nodes.get(i);

                        writer.write("Тема: " +
                                newsItem.getElementsByClass("blocktitle").get(0).childNodes().get(0) + "\n");

                        writer.write("Дата: " +
                                newsItem.getElementsByClass("blockdate").get(0).childNodes().get(0) + "\n");
                    }
                }
            }
        } catch (HttpStatusException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}