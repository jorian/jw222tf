package jw222tf_assign4.newsagency;

import java.util.ArrayList;

/**
 * Created by Jorian on 6-1-2017 at 14:59.
 */
public class Newspaper {
    private String name;
    private ArrayList<NewsArticle> articles = new ArrayList<>();

    Newspaper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    NewsArticle newNewsArticle(String headline) {
        return new NewsArticle(this, headline);
    }

    void sendNews(NewsAgency agency, NewsArticle newsArticle) {
        Newspaper temp = newsArticle.getOwner();
        agency.collectNews(newsArticle);
    }

    void receiveNews(NewsArticle newsArticle) {
        articles.add(newsArticle);
    }

    void printArticles() {
        for (NewsArticle eaNews : articles) {
            System.out.println(eaNews.getHeadline());
        }
    }
}
