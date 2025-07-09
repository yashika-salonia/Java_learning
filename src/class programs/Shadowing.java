public class Shadowing {
    static int x=90; //static for static use //known as class scope
    //the local scope in line 7 shadows the global scope in line 2
    public static void main(String[] args){
        System.out.println(x);
        //again declaring and initialising the object
        //**scope will begin when the value is initialised
        int x=40;
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
//shadowing does not work into methods
