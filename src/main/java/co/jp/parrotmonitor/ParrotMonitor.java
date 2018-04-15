package co.jp.parrotmonitor;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ParrotMonitor {
    public void monitor() {
        try {
            Document document = Jsoup.connect("http://cultofthepartyparrot.com/").userAgent("Mozilla").ignoreHttpErrors(true).timeout(0).get();
            Elements lis = document.getElementsByTag("li");
            List<String> parrotList = new ArrayList<>();
            StringBuilder b = new StringBuilder();
            lis.forEach(li -> {
                b.append(li.textNodes().get(0).toString());
                b.append("\r\n");
            });
            SlackUtil.sendSlack(":bow:", "#general", b.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
