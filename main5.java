class Pa{
    int age;
    String name;
    void Names(String name){
        System.out.println("Your name is : "+name);
    }

    }
class Child extends Pa{
    void ages(int age){
        System.out.println("Your age is :"+age);
    }
}
class Animal{
    void eats(){
        System.out.println("An animal is eating");
    }
}
class panda extends Animal{
    void sleeps(){
        System.out.println("A panda is sleeping");
    }
}
class babyPanda extends panda{
    void weep(){
        System.out.println("Baby Panda is weeping");
    }
}
class grandf{
    void gfstatus(){
        System.out.println("Highest status");
    }
}
class father extends grandf{
    void fstatus(){
        System.out.println("Higher status");
    }
}
class childs extends grandf{
    void cstatus(){
        System.out.println("High Status");
    }
}
class main5{
    public static void main(String[] args){
        Child ca = new Child();
        babyPanda bp = new babyPanda();
        childs ob = new childs();
        ob.gfstatus();
        ob.cstatus();
        bp.eats();
        bp.sleeps();
        bp.weep();
        ca.ages(15);
        ca.Names("tr");
    }
}