package jw222tf_assign4.newsagency;

/**
 * Created by Jorian on 6-1-2017 at 14:59.
 */
public class NewsMain {
    public static void main(String args[]) {

        Newspaper volkskrant = new Newspaper("Volkskrant");
        Newspaper trouw = new Newspaper("Trouw");
        Newspaper telegraaf = new Newspaper("De Telegraaf");
        Newspaper nrc = new Newspaper("NRC Handelsblad");

        NewsAgency reuters = new NewsAgency("Reuters");

        reuters.registerNewspaper(volkskrant);
        reuters.registerNewspaper(trouw);
        reuters.registerNewspaper(telegraaf);
        reuters.registerNewspaper(nrc);

        NewsArticle vkartikel = new NewsArticle(volkskrant, "Honderd doden door verkeersongeluk.");
        NewsArticle trArtikel = new NewsArticle(trouw, "Pasen komt vroeg dit jaar");

        volkskrant.sendNews(reuters, vkartikel);
    }
}
