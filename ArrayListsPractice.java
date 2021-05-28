 
import java.util.ArrayList;

public class ArrayListsPractice {

    public static void removeZeros(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++){
            if (list.get(i) == 0){
                list.remove(i);
            }
        }

        System.out.println(list);
    }

    public static void countLetters(ArrayList<String> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++){

            sum = sum + list.get(i).length();

        }

        System.out.println(sum);

    }

    public static int findPosition(int keyValue, ArrayList<Integer> list){
        int result = -1;

        for (int i = 0; i < list.size(); i++){

            if (list.get(i) == keyValue){
                result = keyValue;
            }
        }

        return result;


    }


    public static ArrayList<String> parseIntoArrayList(String input){

        ArrayList<String> letters = new ArrayList<String>();

        for (int i = 0; i < input.length(); i++){

            letters.add(input.substring(i, i + 1));
        }

        return letters;

    }

    public static int findMin(ArrayList<ArrayListsPractice> list){

        int min = 0;
        for (int i = 0; i < list.size(); i++){

            min += i;

        }
        return min;

    }
}
