
/**
 * 
 * Here all solution of I solved in CodeForces are coded!
 * Java 
 * 
 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

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

class PetyaAndString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s1 = input.next().toLowerCase();
        String s2 = input.next().toLowerCase();

        int result = s1.compareTo(s2);

        if (result > 0) {
            System.out.println(1);
        } else if (result < 0) {
            System.out.println(-1);
        } else {
            System.out.println(0);
        }

        input.close();
    }
}

class HelpFulMaths {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.next();

        String[] newStr = str.split("\\+");

        int[] numbers = new int[newStr.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(newStr[i]);
        }

        Arrays.sort(numbers);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            result.append(numbers[i]);
            if (i != numbers.length - 1) {
                result.append("+");
            }
        }

        System.out.println(result);
        input.close();
    }
}

class WordCapitalization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();

        String s = str.substring(0, 1);
        s = s.toUpperCase();

        StringBuilder st = new StringBuilder();
        st.append(s);
        st.append(str.substring(1, str.length()));

        System.out.println(st);
        input.close();
    }
}

class BoyOrGirl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        while (t-- > 0) {

            String name = input.next();

            Set<Character> set = new HashSet<>();

            for (char ch : name.toCharArray()) {
                set.add(ch);
            }

            if (set.size() % 2 == 0) {
                System.out.println("CHAT WITH HER!");
            } else {
                System.out.println("IGNORE HIM!");
            }

        }
        input.close();

    }

}

class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        while (t-- > 0) {
            int w0 = input.nextInt();
            int w1 = input.nextInt();

            int year = findYear(w0, w1);
            System.out.println(year);
        }

        input.close();
    }

    private static int findYear(int limakWeightPerYear, int bobWeightPerYear) {
        int year = 0;
        while (limakWeightPerYear <= bobWeightPerYear) {
            year++;
            limakWeightPerYear *= 3;
            bobWeightPerYear *= 2;
        }

        return year;
    }
}

class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String str = input.next();

        int count = 0;
        for (int i = 1; i < n; i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            }
        }

        System.out.println(count);

        input.close();
    }
}

class Elephant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int distance = input.nextInt();
        int numberOfSteps = distance / 5;

        if (distance % 5 != 0) {
            numberOfSteps++;
        }

        System.out.println(numberOfSteps);
        input.close();

    }

}

class SoldierandBananas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k = input.nextInt();
        int n = input.nextInt();
        int w = input.nextInt();

        int bananaPriceList[] = new int[w];

        for (int i = 0; i < bananaPriceList.length; i++) {
            bananaPriceList[i] = k * (i + 1);
        }

        int totalAmount = 0;

        for (int i = 0; i < w; i++) {
            totalAmount += bananaPriceList[i];
        }

        if (totalAmount > n) {
            totalAmount = totalAmount - n;
        } else {
            totalAmount = 0;
        }

        System.out.println(totalAmount);

        input.close();
    }
}

class WordExtenstion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next();

        int CountOfUpperCase = 0;
        int CountOfIsLowerCase = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                CountOfUpperCase++;
            } else {
                CountOfIsLowerCase++;
            }
        }

        if (CountOfIsLowerCase >= CountOfUpperCase) {
            str = str.toLowerCase();
        } else {
            str = str.toUpperCase();
        }

        System.out.println(str);
        input.close();
    }
}

class WrongSubtraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int xCount = input.nextInt();

        while (xCount != 0) {
            if (x > 0) {
                if (x % 10 == 0) {
                    x /= 10;
                } else {
                    x--;
                }
            }
            xCount--;
        }

        System.out.println(x);

        input.close();
    }
}

class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next();
        int count = 0;

        for (char ch : str.toCharArray()) {
            if (ch == '4' || ch == '7') {
                count++;
            }
        }

        String countStr = String.valueOf(count);
        boolean isNearlyLucky = true;

        for (char ch : countStr.toCharArray()) {
            if (ch != '4' && ch != '7') {
                isNearlyLucky = false;
                break;
            }
        }

        if (isNearlyLucky && count > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        input.close();
    }
}

class AntonAndDanikChess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String s = input.next();

        int numberOfGameWinsByAnton = 0;
        int numberOfGameWinsByDanik = 0;

        for (Character ch : s.toCharArray()) {
            if (ch == 'A') {
                numberOfGameWinsByAnton++;
            } else {
                numberOfGameWinsByDanik++;
            }
        }

        if (numberOfGameWinsByAnton > numberOfGameWinsByDanik) {
            System.out.println("Anton");
        } else if (numberOfGameWinsByAnton < numberOfGameWinsByDanik) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }

        input.close();
    }
}

class Translation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s1 = input.next();
        String s2 = input.next();

        boolean correctlyTranslated = false;

        if (s1.length() != s2.length()) {
            correctlyTranslated = false;
        } else {
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();

            for (int i = 0, j = ch2.length - 1; i < ch2.length && j >= 0; i++, j--) {
                if (ch1[i] == ch2[j]) {
                    correctlyTranslated = true;
                } else {
                    correctlyTranslated = false;
                    break;
                }
            }

        }

        if (correctlyTranslated) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        input.close();
    }
}

class Tram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalStops = input.nextInt();

        int totalPassengersCapacity = 0;
        int currentPassengers = 0;

        for (int i = 0; i < totalStops; i++) {
            int exit = input.nextInt();
            int enter = input.nextInt();

            currentPassengers -= exit;
            currentPassengers += enter;

            totalPassengersCapacity = Math.max(currentPassengers, totalPassengersCapacity);
        }

        System.out.println(totalPassengersCapacity);

        input.close();

    }
}