package utils;

import com.google.common.base.Strings;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class HtmlFormater {
    public String formatHtml(String html) {
        if(Strings.isNullOrEmpty(html)) {
            try {
                Document doc = Jsoup.parseBodyFragment(html);
                html = doc.body().html();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return html;
    }

}
