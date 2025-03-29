public class ACP3{
    public static void main(String[] args){
        int num = 345;
        int reve = 0;
        while (num != 0) {
            int di = num % 10;
            reve = reve * 10 + di;
            num /= 10; 
        }
        System.out.println(reve);

    }
}
