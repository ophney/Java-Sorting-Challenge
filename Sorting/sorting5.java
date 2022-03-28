import java.util.Arrays;
public class sorting5 {
    public static  void main(String [] g){

        Integer [] myArray=new Integer[50];
        Integer [] o=getRandomArray(myArray);
        System.out.println("original elements: ");
        for(int x:o){

            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Adding 60 to element 20 and 61 to element 21: ");

        for(int i = 0; i < 50; i++){
            if(i == 19) {
                o[19] += 60;
            }
            if(i == 20) {
                o[20] = o[20] + 61;
            }
        }
        for(int x:o){
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Sorted elements in Ascending order: ");
        for (Integer index:getSotterdArray(o))
            System.out.print(index + " ");
    }

    public static Integer [] getSotterdArray(Integer [] Arr){
        Arrays.sort(Arr);
        return Arr;
    }

    public static Integer [] getRandomArray(Integer [] arr){
        for(int i=0;i<arr.length;i++)
            arr[i]=(int)(Math.random()*50);
        return arr;
    }
}
