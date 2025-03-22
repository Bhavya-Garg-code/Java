class Employee{
    int empno;
    String name;
    double sal;
    Employee(){
        name = "Hi";
        sal = 34000;
        empno = 200;
    }
    void Print(){
        System.out.println("name: "+name+" | Salary: "+sal+" | Employee No.:"+empno);
    }
}
class Count{
    static int num = 10;
    void increase(){
        num = num+1;
    }
}
public class main4{
    public static void main(String[] args){
        Employee em1 = new Employee();
        Employee em2 = new Employee();
        Employee em3 = new Employee();
        Count co1 = new Count();
        Count co2 = new Count();
        Count co3 = new Count();
        co1.increase();
        co2.increase();
        co3.increase();
        em1.Print();
        em2.Print();
        em3.Print();
        System.out.println(co1.num);
        System.out.println(co2.num);
        System.out.println(co3.num);

        String fr = "Cod";
        String se = "Ing";
        String total = fr+se;
        String a = "Welcome here";
        String up = a.toUpperCase();
        String do1 = a.toLowerCase();
        int len = a.length();
        int len2 = total.length();
        System.out.println(total);
        System.out.println(up);
        System.out.println(do1);
        System.out.println(len);
        System.out.println(len2);
    }
}