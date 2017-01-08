package jw222tf_assign4.newsagency;

import java.util.ArrayList;

/**
 * Created by Jorian on 6-1-2017 at 14:59.
 */
public class Newspaper {
    private String name;
    private ArrayList<NewsArticle> articles = new ArrayList<>();

    /*
    A newspaper only gets a name upon creation.
     */
    Newspaper(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    /*
    When a newspaper creates an article, it gets stored in the ArrayList articles, which contain all the articles the
    newspaper has created itself or received by a news agency.
     */
    void addToArticlesUponCreation(NewsArticle newsArticle) {
        articles.add(newsArticle);
    }

    /*
    Sends all news to the agency. Only if the newspaper exists at agency, the agency will collect the news.
     */
    void sendAllNewsToAgency(NewsAgency agency) {
        if (agency.newsPaperExists(this)) {
            for (NewsArticle eaNews : articles) {
                agency.collectNews(eaNews);
            }
        } else {
            System.err.printf("%s is not registered at %s", this.getName(), agency.getName());
        }
    }

    void sendNewsArticleToAgency(NewsAgency agency, NewsArticle newsArticle) {
        if (agency.newsPaperExists(this)) {
            agency.collectNews(newsArticle);
        } else {
            System.err.printf("%s is not registered at %s", this.getName(), agency.getName());
        }
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
