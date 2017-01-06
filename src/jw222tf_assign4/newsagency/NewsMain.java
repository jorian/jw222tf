package jw222tf_assign4.newsagency;

/**
 * Created by Jorian on 6-1-2017 at 14:59.
 */
public class NewsMain {
    public static void main(String args[]) {

        Newspaper newyorktimes = new Newspaper("The New York Times");
        Newspaper washingtonpost = new Newspaper("The Washington Post");
        Newspaper wallstreetjournal = new Newspaper("Wall Street Journal");
        Newspaper chicagotribune = new Newspaper("Chicago Tribune");

        NewsAgency reuters = new NewsAgency("Reuters");

        reuters.registerNewspaper(newyorktimes);
        reuters.registerNewspaper(washingtonpost);
        reuters.registerNewspaper(wallstreetjournal);
        reuters.registerNewspaper(chicagotribune);

        NewsArticle nytArticle = new NewsArticle(newyorktimes, "100 casualties after car accident");
        NewsArticle wpArticle = new NewsArticle(washingtonpost, "Christmas came early this year");
        NewsArticle ctArticle = new NewsArticle(chicagotribune, "Trump almost president");

        newyorktimes.sendNewsToAgency(reuters, nytArticle);
        washingtonpost.sendNewsToAgency(reuters, wpArticle);

        wallstreetjournal.printArticles();
        chicagotribune.printArticles();
    }
}

