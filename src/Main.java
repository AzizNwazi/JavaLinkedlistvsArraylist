
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> linkedlist  = new LinkedList<Integer>();
        ArrayList<Integer> arraylist =  new ArrayList<Integer>();

        calculateTime("LinkedList",linkedlist);
        calculateTime("ArrayList",arraylist);


    }
    public static void calculateTime(String data_type ,List<Integer> list) {

        // Add value to the end of the list
        long start;
        long end;

        start = System.currentTimeMillis();

        for (int i = 0 ; i< 100000 ; i++) {

            list.add(0,i);

        }
        end  = System.currentTimeMillis();

        System.out.println(data_type  + " insertion time " + (end  - start) + " ms");




    }

}