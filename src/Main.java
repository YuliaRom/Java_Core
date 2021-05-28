import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] array = new String[]{"один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "девять", "девять", "восемь", "восемь", "семь", "девять"};

        uniqueElements(array);
        calculateElementsCount(array);

        Phonebook phonebook = new Phonebook();
        phonebook.add("Чайковский", "89991112233");
        phonebook.add("Шопен", "83335552222");
        phonebook.add("Моцарт", "89091334567");
        phonebook.add("Бетховен", "87079098858");
        phonebook.add("Бетховен", "87079098859");
        phonebook.add("Бетховен", "87079098860");


        String surName = "Бетховен";
        List<String> phoneNumbersBySurName = phonebook.get(surName);

        if(phoneNumbersBySurName != null) {
            System.out.println("Для фамилии " + surName + " найдены номера: " + phoneNumbersBySurName);
        } else {
            System.out.println("Для фамилии " + surName + " записей нет");
        }
    }



    public static void uniqueElements(String[] array) {
        List<String> listFromArray = Arrays.asList(array);
        Set<String> uniqueElements = new HashSet<>(listFromArray);
        System.out.println("Уникальные элементы массива: " + uniqueElements);
    }


    
    public static void calculateElementsCount(String[] array) {
        Map<String, Integer> map = new HashMap<>();
        for (String word: array) {
            Integer count = map.get(word);
            if(count == null) {
                map.put(word, 1);
            } else {
                map.put(word, count + 1);
            }
        }
        System.out.println("Количество повторов слов:");
        System.out.println(map);
    }
}
