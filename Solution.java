
/**
 * 
 * Here all solution of I solved in CodeForces are coded!
 * Java 
 * 
 */

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

class BitLandBit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int counter = 0;

        for (int b = 0; b < n; b++) {
            String s = input.next();
            switch (s) {
                case "X++":
                case "++X":
                    ++counter;
                    break;
                case "X--":
                case "--X":
                    counter--;
                    break;
                default:
                    break;
            }
        }
        System.out.println(counter);

        input.close();
    }
}

class Domino {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m = input.nextInt();
        int n = input.nextInt();

        System.out.println(m * n / 2);

        input.close();

    }
}

class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[5][5];
        int findRowOfOne = 0;
        int findColOfOne = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = input.nextInt();
                if (matrix[i][j] == 1) {
                    findRowOfOne = i + 1;
                    findColOfOne = j + 1;
                }
            }
        }

        int midRow = 3;
        int midCol = 3;

        int steps = Math.abs(findRowOfOne - midRow) + Math.abs(findColOfOne - midCol);

        System.out.println(steps);

        input.close();
    }
}
