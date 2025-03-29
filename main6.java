class employee{
    int no;
    String name;
    double sal;
    employee(){}
    employee(int no, String name){
        this.no = no;
        this.name = name;
    }
    employee(int no, String name, double sal){
        this.no = no;
        this.name = name;
        this.sal = sal;
    }
    void details(){
        System.out.println("Name: "+this.name+" Salaray: "+this.sal+" No. "+this.no);
    }
}
class a{
    public void hi(){
        System.out.println("Hello from a");
    }
}
class b extends a{
    public void hi(){
        System.out.println("Hello from b");
    }
}

class Suclass{
    int num = 45;
}
class subClass extends Suclass{
    int num = 56;
    void nums(){
        System.out.println(num);
        System.out.println(super.num);
    }
} 
class pro{
    protected void a(){
        System.out.println("Protected!");
    }
}
class pri extends pro{
    private void b(){
        System.out.println("I am Private");
    }
}
class main6{
    public  static void main(String[] args){
        employee emp = new employee();
        employee emp1 = new employee(23455433,"Hello");
        employee emp2 = new employee(2355794,"Hello",123554.56);
        emp.details();
        emp1.details();
        emp2.details();
        a obj = new a();
        //a obj2 = new b();
        obj.hi();
        subClass sc = new subClass();
        sc.nums();
        pri y = new pri();
        y.b();
    }
}

