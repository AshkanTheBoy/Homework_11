package Strings;

public class Task_01_Correct {
    static String givenWord = "программа";
    static String target = "мрамор";

    public static void main(String[] args) {
        System.out.println(givenWord+" => "+target);
        printResult(makeWord(givenWord,target));
    }

    static String makeWord(String givenWord, String target) {
        String result;
        StringBuilder resultSB = new StringBuilder();
        StringBuilder givenWordSB = new StringBuilder(givenWord);

        for (int targetIndex = 0; targetIndex < target.length(); targetIndex++) {
            for (int givenWordIndex = 0; givenWordIndex < givenWordSB.length(); givenWordIndex++) {
                if (givenWordSB.charAt(givenWordIndex) == target.charAt(targetIndex)) {
                    resultSB.append(target.charAt(targetIndex));
                    givenWordSB.deleteCharAt(givenWordIndex);
                    break;
                }
            }
        }
        result = resultSB.toString();
        return result;
    }

    static void printResult(String result) {
        if (result.length() == target.length()) {
            System.out.println("Операция успешна: "+result);
        } else {
            System.out.printf("Из букв слова %s невозможно собрать слово %s.\n", givenWord, target);
        }
    }
}

