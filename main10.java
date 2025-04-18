import java.util.ArrayList;
public class main10{
    public static void main(String[] args){
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Wolf");
        animals.add("Elephant");
        System.out.println("ArrayList: "+animals);
        animals.clear();
        System.out.println("Cleared ArrayList: "+animals);
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Wolf");
        System.out.println("Size of ArrayList: "+animals.size());
        System.out.println("Removal of 2nd element of ArrayList: "+animals.remove(2));
        System.out.println(animals);
        System.out.println("Size of ArrayList: "+animals.size());
        animals.add("Wolf");
        animals.add("Elephant");
        System.out.println(animals);
        animals.forEach((x)->{System.out.println(x);});
        animals.forEach((a)->{if(a == "Tiger"){System.out.println("Yes");};});
    }
}