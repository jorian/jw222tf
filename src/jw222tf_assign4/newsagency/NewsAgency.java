package jw222tf_assign4.newsagency;

import java.util.ArrayList;

/**
 * Created by Jorian on 6-1-2017 at 14:58.
 */
public class NewsAgency {
    /*
    A news agency stores all newspapers that registered and all the submitted news articles.
    In order to retrieve the owner of the newspaper that commits news, a temporary
     */
    private String name;
    private ArrayList<Newspaper> newspapers = new ArrayList<>(0);
    private ArrayList<NewsArticle> newsArticles = new ArrayList<>(0);

    // A news agency only gets a name upon creation.
    NewsAgency(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void registerNewspaper(Newspaper newspaper) {
        newspapers.add(newspaper);
    }

    /*
    Without registering, a newsPaper cannot send news to news agency.
     */
    boolean newsPaperExists(Newspaper newspaper) {
        return newspapers.contains(newspaper);
    }

    //Broadcasting news is always a consequence of submitting news by newspapers. It is therefore a private method.
    private void broadcastNews(NewsArticle newsArticle) {
        for (Newspaper eaNewspaper : newspapers) {
            if (!eaNewspaper.equals(newsArticle.getOwner())) {
                eaNewspaper.receiveNewsFromAgency(newsArticle);
            }
        }
    }

    /*
    collectNews is only called in methods sendAllNewsToAgency or sendNewsArticleToAgency in class NewsArticle.
    That way, collectNews is always called in the correct way.

    Duplicate objects of NewsArticle are detected and will not be added to ArrayList. Different objects with the same
    headlines will be added, because it is possible that certain things happen more than once. (could've added dates to
    newsArticle to compare)
     */
    void collectNews(NewsArticle news) {
        if (newsArticles.contains(news)) {
            System.err.printf("News article \"%s\" already exists with newspaper %s\n", news.getHeadline(), news.getOwner().getName());
        } else {
            newsArticles.add(news);
            broadcastNews(news);
        }
    }
}
