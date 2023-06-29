import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        UserProfile sergei = new UserProfile("sergei", "sergei@mail.com");
        UserProfile viktor = new UserProfile("viktor", "viktor@mail.com");
        UserProfile ivan = new UserProfile("ivan", "ivan@mail.com");
        UserProfile anonim = sergei;

        TreeMap<String, UserProfile> indexById = new TreeMap<>();
        indexById.put(sergei.id, sergei);
        indexById.put(viktor.id, viktor);
        indexById.put(ivan.id, ivan);

        System.out.println(indexById);
        System.out.println("По иденификатору " + viktor.id + " найден профиль " + indexById.get(viktor.id));

        if(indexById.containsValue(anonim)) {
            Set<Map.Entry<String, UserProfile>> keyValues = indexById.entrySet();
            keyValues.forEach(entry -> {
                if(entry.getValue().equals(anonim)) {
                    System.out.println("Пользователь найден, его ключ = " + entry.getKey());
                }
            });
        } else {
            System.out.println("Элемента нет в дереве");
        }

        TreeMap<String, UserProfile> indexByLogin = new TreeMap<>();
        indexByLogin.put(sergei.login, sergei);
        indexByLogin.put(viktor.login, viktor);
        indexByLogin.put(ivan.login, ivan);

        System.out.println("По логину 'sergei' найден профиль " + indexByLogin.get("sergei"));

    }
}