import java.util.HashMap;
import java.util.Map;

public class MagazinesReestrClass {
    Map<Integer, String> reestr = new HashMap<>();

    public void addToReestr(int articul, String nameMagazine) {
        reestr.put(articul, nameMagazine);
    }

    public void removeFromReestr(int articul, String nameMagazine) {
        reestr.remove(articul, nameMagazine);
    }

    public void printReestr() {
        for (Map.Entry<Integer, String> entry : reestr.entrySet()) {
            System.out.println("Артикул журнала " + entry.getKey() + "  " + "наименованиевание журнала " + entry.getValue());
        }
    }

    public void searchReestrByName(String name) {
        System.out.println("По " + name + " найдено:");
        for (Map.Entry<Integer, String> entry : reestr.entrySet()) {
            if (entry.getValue().contains(name))
                System.out.println("артикул журнала " + entry.getKey() + " наименование журнала " + entry.getValue());
        }
    }
}


