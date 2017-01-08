package jw222tf_assign4.newsagency;

/**
 * Created by Jorian on 6-1-2017 at 14:59.
 */
public class NewsMain {
    /*
    This subpackage tries to implement the following scenario:

    Newspapers exchange news by using news agencies (such as Reuters and ITAR- TASS).
    A newspaper registers at a news agency and sends all its news to the agency. The news agency collects the news
    and broadcasts it to all registered newspapers, except from to the one who delivered it.

    Three classes are made to function as: 1. agency; 2. Newspaper; 3. News article.

    The basic layout is as follows: A newspaper is created by giving it a name. This newspaper can now create a Newsarticle,
    since a newsArticle needs a Newspaper as input parameter, as well as a headline for the article. (contents of the
    article are not included in this program)

    An agency is created for collecting and broadcasting news. As with a newspaper, it is given a name only. Now, a newspaper can
    send ALL its news to the agency, or only one article. The agency broadcasts this article to the other registered newspapers
    consequently.

    It is up to the newspaper to decide whether to send an article to a news agency.
     */
    public static void main(String args[]) {

        Newspaper newyorktimes = new Newspaper("The New York Times");
        Newspaper washingtonpost = new Newspaper("The Washington Post");
        Newspaper wallstreetjournal = new Newspaper("Wall Street Journal");
        Newspaper bostonglobe = new Newspaper("The Boston Globe");

        Newspaper[] newspapers = {newyorktimes, wallstreetjournal, washingtonpost, bostonglobe};

        NewsAgency reuters = new NewsAgency("Reuters");

        for (Newspaper eaNewspaper : newspapers) {
            reuters.registerNewspaper(eaNewspaper);
        }

        NewsArticle nytArticle1 = new NewsArticle(newyorktimes, "100 casualties after car accident");
        NewsArticle nytArticle2 = new NewsArticle(newyorktimes, "Cessna crashes on cemetery, 237 corpses found");
        NewsArticle nytArticle3 = new NewsArticle(newyorktimes, "100 casualties after car accident");
        NewsArticle wpArticle1 = new NewsArticle(washingtonpost, "Christmas came early this year");
        NewsArticle wpArticle2 = new NewsArticle(washingtonpost, "Obama fell by stepping down");
        NewsArticle bgArticle = new NewsArticle(bostonglobe, "Roman catholic church seeks healing");

        // New York Times sends all its articles to the newsagency
        // Washington Post only sends 1 article, Chicago Tribune doesn't send news.
        newyorktimes.sendAllNewsToAgency(reuters);
        newyorktimes.sendAllNewsToAgency(reuters);
        washingtonpost.sendNewsArticleToAgency(reuters, wpArticle1);

        for (Newspaper eaNewspaper : newspapers) {
            eaNewspaper.printArticles();
        }
    }
}

