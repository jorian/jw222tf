package jw222tf_assign4.newsagency;

import java.util.ArrayList;

/**
 * Created by Jorian on 6-1-2017 at 14:58.
 */
public class NewsAgency {
    private String name;
    private ArrayList<Newspaper> newspapers = new ArrayList<>(0);
    private ArrayList<NewsArticle> newsArticles = new ArrayList<>(0);
    private NewsArticle newsArticle;


    NewsAgency(String name) {
        this.name = name;
    }

    void registerNewspaper(Newspaper newspaper) {
        newspapers.add(newspaper);
    }

    private void broadcastNews(NewsArticle newsArticle) {
        this.newsArticle = newsArticle;
        for (Newspaper eaNewspaper : newspapers) {
            if (!eaNewspaper.equals(newsArticle.getOwner())) {
                eaNewspaper.receiveNewsFromAgency(newsArticle);
            }
        }
    }

    void collectNews(NewsArticle news) {
        newsArticles.add(news);
        broadcastNews(news);
    }
}
