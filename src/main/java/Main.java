public class Main {
    public static void main(String[] args) {
        MagazinesClass magazinesName = new MagazinesClass();
        MagazinesReestrClass reestr = new MagazinesReestrClass();
        ArticleClass article = new ArticleClass();

        magazinesName.addNewMagazine("Tatler");
        magazinesName.addNewMagazine("Forbs");
        magazinesName.addNewMagazine("Burda");
        magazinesName.addNewMagazine("Vogue");
        magazinesName.allMagazinesDoWhile();
        magazinesName.removeMagazine("Burda");
        magazinesName.allMagazinesWhile();
        magazinesName.searchMagazine("Burda");
        magazinesName.searchMagazine("Forbs");

        reestr.addToReestr(1, "Tatler");
        reestr.addToReestr(123, "Кросворды");
        reestr.addToReestr(12, "VoMagazine");
        reestr.addToReestr(2, "Vogue");
        reestr.printReestr();
        reestr.removeFromReestr(12, "VoMagazine");
        reestr.searchReestrByName("at");

        article.addArticleName("Тестирование в условиях deadline");
        article.addArticleName("Стресс тестирование");
        article.addArticleName("Ой что тут тестировать то");
        article.addArticleName("Потестим в проме");
        article.printArticle();
        article.removeArticleName("Потестим в проме");
        article.searchArticle("тест");
    }
}
