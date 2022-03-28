import java.util.Arrays;
import java.util.Collections;
public class sorting2 {
    public static  void main(String [] g){
        Integer [] myArray=new Integer[50];
        Integer [] o=getRandomArray(myArray);
        for(int x:o){
        }
        System.out.println();
        for(int i = 0; i < 50; i++){
            if(i == 19) {
                o[19] += 60;
            }
            if(i == 20) {
                o[20] = o[20] + 61;
            }
        }
        for(int x:o){
        }
        System.out.println();

        for (Integer index:getSotterdArray(o));
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
