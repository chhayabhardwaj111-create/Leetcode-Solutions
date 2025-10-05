import java.util.*;

public class LC1832 {

    public boolean checkIfPangram(String sentence) {

        for (int i = 'a'; i <= 'z'; ) {
            int f = 0;
            int j = 0;

            while (j < sentence.length()) {
                if (i == sentence.charAt(j)) {
                    f++;
                }
                j++;
            }

            if (f > 0) {
                i++;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        LC1832 solution = new LC1832();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        boolean result = solution.checkIfPangram(sentence);
        System.out.println("Is pangram? " + result);

        sc.close();
    }
}
