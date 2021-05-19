/**
 * Write a description of class FrequencyChart here.
 *
 * @author Grant Yang
 * @version 4/30/21
 */
import java.util.Scanner;
public class FreqChart
{
        public static void main (String [] args){
            Scanner in = new Scanner(System.in);
            System.out.println("Numbers would you like to enter? "); 
            int q = in.nextInt();

            int[] numbers = new int[q];
            double sum = 0;
            for (int counter = 0; counter < q; counter++){ 
                System.out.println("Enter your numbers: ");
                int number = in.nextInt();
                numbers[counter] = number; 
            }

            int min = 0;
            int max = 9;

            while (max < 100) {
                System.out.print(min + "-" + max + ":"); 
                for (int i = 0; i < q; i++){ 
                    if (min <= numbers[i] && numbers[i] <= max ) { 
                        System.out.print("");
                    }
                }
                System.out.println();
                min += 10;
                max += 10;
            }

        }
    }
