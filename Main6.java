import java.util.*;

public class Main6 {
    
    static Map<String, Set<Integer>> phoneBook = new HashMap<>();

    public static void main(String... args) {
        
        addNumber("Alex", 1);
        addNumber("Alex", 2);
        addNumber("Alex", 3);
        addNumber("Gena", 10);
        addNumber("Dima", 5);
        addNumber("Sasha", 15);
        addNumber("Gena", 20);
        addNumber("Alex", 4);
        addNumber("Sasha", 25);
        addNumber("Dima", 30);

        
        printSortedPhoneBook();
    }

    
    private static void addNumber(String key, int num) {
        
        phoneBook.putIfAbsent(key, new HashSet<>());
        phoneBook.get(key).add(num);
    }

    private static void printSortedPhoneBook() {
        
        List<Map.Entry<String, Set<Integer>>> phoneBookList = new ArrayList<>(phoneBook.entrySet());

        phoneBookList.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));

        for (Map.Entry<String, Set<Integer>> entry : phoneBookList) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}