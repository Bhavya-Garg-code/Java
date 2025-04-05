class Encap{
    private String name;
    public String getName(){
        return name;
    }
    public void name(String name){
        this.name = name;
    }
}
class Area{
    public double getArea(){
        return 0;
    }
}
class triangle extends Area{
    private double base;
    private double height;
    public triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    public double getArea(){
        return 0.5*base*height; 
    }
}
class square extends Area{
    private double side;
    public square(double side){
        this.side = side;
    }
    public double getArea(){
        return side*side;
    }
}
class main8{
    public static void main(String[] args){
        Encap a = new Encap();
        a.name("Ab");
        System.out.println(a.getName());

        Area[] an = new Area[2];
        an[0] = new triangle(2,3);
        an[1] = new square(4); 
        System.out.println(an[0].getArea());
        System.out.println(an[1].getArea());
    }
}