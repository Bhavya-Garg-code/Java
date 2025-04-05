class HillStations{
    void location(){
        System.out.println("Located in: ");
    }
    void famousFor(){
        System.out.println("Famous for: ");
    }
}
class Manali extends HillStations{
    void location(){
        System.out.println("Located in Himachal Pradesh");
    }
    void famousFor(){
        System.out.println("Famous for Temples ");
    }
}
class Mussorie extends HillStations{
    void location(){
        System.out.println("Located in Uttar Pradesh ");
    }
    void famousFor(){
        System.out.println("Famous for Institutes ");
    }
}
class shimla extends HillStations{
    void location(){
        System.out.println("Located in Himachal Pradesh ");
    }
    void famousFor(){
        System.out.println("Famous for Hilly areas ");
    }
}
abstract class ab{
    abstract void showShape();
    void shape(){
        System.out.println("It is a shape");
    }
}
class cube extends ab{
    void showShape(){
        System.out.println("It is a cube");
    }
}
class pyramid extends ab{
    void showShape(){
        System.out.println("It is a pyramid");
    }
}
class main7{
    public static void main(String[] args){
        HillStations H = new HillStations();
        HillStations M = new Manali();
        HillStations Mu = new Mussorie();
        HillStations Sh = new shimla();
        H.location();
        M.location();
        Mu.location();
        Sh.location();
        H.famousFor();
        M.famousFor();
        Mu.famousFor();
        Sh.famousFor();
        ab a = new cube();
        a.showShape();
        a= new pyramid();
        a.showShape();
    }
}