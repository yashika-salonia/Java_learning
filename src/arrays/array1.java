package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr; //declaration, compile time
        arr=new int[5]; //initialisation, obj is being created, run time, dynamic mem// ory allocation
//        int[] arr={1,2,3,4,5,6};
        String[] name={"joe","ram","ross"};
        System.out.println(name[2]);

        //input for the array
//        System.out.println("enter the elements: ");
//        for(int i = 0;i < arr.length;i++){
//            arr[i]=sc.nextInt();
//        }

        //printing array
        //1. by simple for loop

        //2. for(datatype reference_variable in array)
        //for every element in array, print element
//        for (int j : arr) {
//            System.out.print(j + " "); //here j represent the element of the array
//        } //23 43 23 54 67

        //3. to string method - printing without loop
//        System.out.println(Arrays.toString(arr));
        //[23, 43, 23, 54, 67]
        //it is best one


        //Array of objects
        String[] str=new String[5];
        for (int i=0;i<str.length;i++){
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));

        //modifiaction
        str[1]="bye";
        System.out.println(Arrays.toString(str));

    }
}
//array is collection of datatype
//all datatype should be same
//new is a keyword that is used to create an object
//null is a literal, special value, by default value
//primitive are stored in stack - int,char,boolean
//objects are stored in heap - (that can't be broken down)