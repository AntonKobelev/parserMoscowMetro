import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Document doc;
        {
            try {
                doc = Jsoup.connect("https://ru.wikipedia.org/wiki/Список_станций_Московского_метрополитена").get(); // connect to the website and get the html
                //System.out.println(doc);
                Elements elements = doc.select("a[href]"); // get all elements with the tag img
                for (Element el: elements) {
                    System.out.println(el.text());



                    //System.out.println("Station Found!");
                    //System.out.println("src attribute is:  ");

                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("There was an error");






    }}
}}
