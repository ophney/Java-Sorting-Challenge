import java.util.Arrays;
import java.util.Collections;
public class sorting3 {
    public static  void main(String [] g){

        Integer [] myArray=new Integer[50];
        Integer [] o=getRandomArray(myArray);
        System.out.println("original arrays: ");
        for(int x:o){

            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println("arrays in descending order.: ");
        for (Integer index:getSotterdArray(o))
            System.out.print(index + " ");
    }

    public static Integer [] getSotterdArray(Integer [] Arr){
        Arrays.sort(Arr, Collections.reverseOrder());
        return Arr;
    }

    public static Integer [] getRandomArray(Integer [] arr){
        for(int i=0;i<arr.length;i++)
            arr[i]=(int)(Math.random()*50);
        return arr;
    }
}

