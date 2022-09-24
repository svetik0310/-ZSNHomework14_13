import java.util.ArrayList;
import java.util.List;

public class MagazinesClass {
    List<String> magazines = new ArrayList<>();

    public void addNewMagazine(String name) {
        magazines.add(name);
    }

    public void removeMagazine(String name) {
        magazines.remove(name);
    }

    public void searchMagazine(String name) {
        if (magazines.contains(name)) {
            System.out.println("По поиску найден журнал " + name + " он издается");
        } else System.out.println("Поиск по наименованию " + name + " не дал результатов");
    }

    public void allMagazinesDoWhile() {
        int i = 0;
        System.out.println("Цикл dowhile");
        if (magazines.size() > 0) {
            do {
                System.out.println("Журнал " + magazines.get(i) + " издается");
                i++;
            } while (i < magazines.size());
        }
    }

    public void allMagazinesWhile() {
        int i = 0;
        System.out.println("Цикл while");
        while (i < magazines.size()) {
            System.out.println("Журнал " + magazines.get(i) + " издается");
            i++;
        }
    }
}
