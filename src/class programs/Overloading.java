public class Overloading {
    public static void main(String[] args) {
        fun(1);
        fun(1020,"Ram");

    }

    static void fun(int a){
        System.out.println("S.no. "+a);
    }

    static void fun(int x,String name){
        System.out.println("Roll no. "+x);
        System.out.println("Name: "+name);
    }
}
//same function name and return type, different no of arguments or different dataypes of arguments is also allowed
//in overloading, at compile time it is decided which function will run