//1: 0,2,4 => 'ы'
package Strings;

public class Task_2 {
    public static void main(String[] args) {
        String sentence = "Я нормальный человек";
        String result;
        StringBuilder sb = new StringBuilder();
        char[] chars = sentence.toCharArray();
        for (int i = 0; i < chars.length-1; i++) {
            if (i%2==0){
                //chars[i] = 'ы'; // с 0-го индекса
                chars[i+1] = 'ы'; //- отсчет с 1-го индекса
            }
        }
        for (char unit: chars){
            sb.append(unit);
        }
        result = sb.toString();

        System.out.println(result);
    }
}
