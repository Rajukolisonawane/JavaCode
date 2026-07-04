package Java_practice1;

import java.lang.reflect.Method;

public class FinalVariable {
    final static int k=36;
    static void method1()
    {
            System.out.println(k);
    }
    static void method2()
    {   final String s="raju koli";
            System.out.println(s);

    }
    public static void main(String[] args) 
    {
    final int a=10;
            System.out.println(a);
            
            System.out.println(k);
           method2();

    
    }
}
