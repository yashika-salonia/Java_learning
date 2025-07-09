import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,7,8,313,5,65);
        vname("Ram", "s","ravi","k" + "ishan", "t");
        multiple(10,20,"tom","have","job");
    }
    //variable length arguments - can take any no of arguments in the function
    static void fun(int ...y){
        System.out.println(Arrays.toString(y));
    }
    static void vname(String ...n){
        System.out.println(Arrays.toString(n));
    }

    //mix args
    static void multiple(int a,int b, String ...c){
        System.out.println();
    }
}
//variable length arguments always come at the end
