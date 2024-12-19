public class TypeCasting {
    public static void main(String[] args) {
        //java typecasting primitive data type 
        //widening and narrowing type casting

        //Implicit typecasting
        byte a = 20;
        System.out.println("\noriginal value of varaiable \'a\': " + a);
        float b = a;
        System.out.println("implicit type casting to float of varaiable \'a\': " + b);


        //Explixit typecasting
        double d = 10.5;
        System.out.println("\noriginal value of varaiable \'d\': " + d);
        int e = (int) d;
        System.out.println("explicit type casting to int of varaiable \'d\': " + e + "\n");
        

        //sequence for implicit typecasting 
        //byte -> short -> char -> int -> long -> float -> double 


        float m = 1 / 2f;
        System.out.println("\noriginal value of varaiable \'m\': " + m);


    }
}
