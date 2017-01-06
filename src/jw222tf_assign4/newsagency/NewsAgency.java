package jw222tf_assign4.newsagency;

import java.util.ArrayList;

/**
 * Created by Jorian on 6-1-2017 at 14:58.
 */
public class NewsAgency {
    private String name;
    private ArrayList<Newspaper> newspapers = new ArrayList<>(0);
    private ArrayList<NewsArticle> newsArticles = new ArrayList<>(0);


    NewsAgency(String name) {
        this.name = name;
    }

    void registerNewspaper(Newspaper newspaper) {
        newspapers.add(newspaper);
    }

    void broadcastNews(NewsArticle newsArticle) {
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
