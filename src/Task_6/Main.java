package Task_6;

public class Main {
    public static void main(String[] args) {
        int n = 155;
        for(int i = 2; i <= n; i++){
            if (n % i == 0 && n != 2){
                System.out.println("Число составное n = " + n);}
            else
                System.out.println("Число простое n = " + n);
            break;
        }
    }
}
