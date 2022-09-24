import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArticleClass {
    Set<String> articleName = new HashSet<>();

    public void addArticleName(String name) {
        articleName.add(name);
    }

    public void removeArticleName(String name) {
        articleName.remove(name);
    }

    public void printArticle() {
        Iterator<String> iterator = articleName.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void searchArticle(String name) {
        for (String fullname : articleName) {
            if (fullname.contains(name)) System.out.println("По наименованию найдено : " + fullname);
        }
    }
}
