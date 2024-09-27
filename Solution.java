import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte w = input.nextByte();

        // Check if w is greater than 2 and even
        if (w > 2 && w % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        input.close();
    }
}

class NextRound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextByte();
        int k = input.nextByte();
        int count = 0;

        int scores[] = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = input.nextByte();
        }

        int kthScore = scores[k - 1];

        for (int i = 0; i < n; i++) {
            if (scores[i] > 0 && scores[i] >= kthScore) {
                count++;
            }
        }

        System.out.println(count);
        input.close();
    }

}

class ToLongWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            String word = input.next();
            String finalString = word;
            if (word.length() > 10) {
                char first = word.charAt(0);
                char last = word.charAt(word.length() - 1);
                String middle = word.substring(1, word.length() - 1);
                finalString = first + String.valueOf(middle.length()) + last;
            }
            System.out.println(finalString);
        }

        input.close();
    }
}

class Team {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int mustSolve = 0;

        while (n-- > 0) {
            int P = input.nextInt();
            int V = input.nextInt();
            int T = input.nextInt();

            if (P + V + T >= 2) {
                mustSolve++;
            }
        }

        System.out.println(mustSolve);
        input.close();
    }
}
