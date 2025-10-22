
import java.util.Scanner;
import java.util.Arrays;

public class Assignment4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word to search for");
        String searchWord = input.nextLine();

        System.out.println("Enter a list of cities, the method will determine if the search word is included.");
        String cities = input.nextLine();

        input.close();
        list(cities, searchWord);

    }

    public static void list(String cities, String searchWord) {
        int t = 0;
        String[] wordList = cities.split("\\s+");
        for (int i = 0; i < wordList.length; i++) {
            System.out.println("Array position: " + i + " = " + wordList[i]);
            if (wordList[i].equalsIgnoreCase(searchWord)) {
                t = t + 1;
                System.out.println("Array value is True:" + wordList[i]);
            }
        }
        if (wordList.length > 3) {
            System.out.println("Array address location 3 contains: " + wordList[3]);
        }
        if (t > 0) {
            System.out.println(searchWord + " exists in the Array");
            System.out.println(searchWord + " found in the array " + t + " times.");
        } else {
            System.out.println(searchWord + " Does not exist in the Array");
        }
        System.out.println("List: " + Arrays.toString(wordList));
    }

}
