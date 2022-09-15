public class FunctionOverloading {
    public static void main(String[] args) {
        fun(32,67);
        fun(45);
        fun("Vijayshiv");
    }
    // we can have same names of function with differebt types and quantity of function

    static void fun(int a){         // this has only one argument with int data type
        System.out.println(a);
    }

    static void fun(int a,int b){   // It has two arguments with int data type
        System.out.println(a+ " " +b);
    }

    static void fun(String n){      // it has string data type 
        System.out.println(n);
    }
}
