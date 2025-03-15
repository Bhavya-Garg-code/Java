public class main2{
    public static void main(String[] args){
        int a = 5;
        int b = 6;
        int sum = a+b;
        int mul = a*b;
        int div = a/b;
        int subt = a-b;
        String str = "Hello";
        System.out.println("Addition of a & b : "+sum);
        System.out.println("Subtraction of a & b : "+subt);
        System.out.println("Multiption of a & b : "+mul);
        System.out.println("Division of a & b : "+div);
        System.out.println("Method 2");
        System.out.println("Addition of a & b : "+(a+b));
        System.out.println("Subtraction of a & b : "+(a-b));
        System.out.println("Multiption of a & b : "+(a*b));
        System.out.println("Division of a & b : "+(a/b));
        System.out.println("Remainder of a & b : "+(a%b));
        System.out.println(a<b && b != a);
        System.out.println(str);
        System.out.println("Urinary Operator: "+ ++a);
        System.out.println("Urinary Operator: "+ b++);
        System.out.println("Urinary Operator: "+ a++ * ++b);
        String Large = (b>a)?"True":"False";
        System.out.println("Ternary Operator: "+ Large);
        maggie();
    }
    public static void maggie(){
        System.out.println("1. Boil the Water");
        System.out.println("2. Add Noodels");
    }
}

