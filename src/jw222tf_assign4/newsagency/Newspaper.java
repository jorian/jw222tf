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

    String getName() {
        return name;
    }

    void addToArticlesUponCreation(NewsArticle newsArticle) {
        articles.add(newsArticle);
    }

    void sendNewsToAgency(NewsAgency agency, NewsArticle newsArticle) {
        agency.collectNews(newsArticle);
    }

    void receiveNewsFromAgency(NewsArticle newsArticle) {
        articles.add(newsArticle);
    }

    void printArticles() {
        System.out.println("\n-----Articles from: " + this.name + "-----");
        for (NewsArticle eaNews : articles) {
            System.out.println(eaNews.getHeadline());
        }
    }
}
