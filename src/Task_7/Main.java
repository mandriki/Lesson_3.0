package Task_7;

public class Main {
    public static int facFor (int n) {
        int resultFac = 1;
        n = 4; // чило n!
        for (int i = 1; i <= n; ++i) {
            resultFac *= i;
        }
        return resultFac;
    }
    public static int facWhile (int n) {
        int i = 1, resultFac = 1; n = 4;
        while (i <= n) {
            resultFac *= i;
            i++;
        }
        return resultFac;
    }
    public static void main(String[] args) {
        int resultFac = 0; int n = 4;
        System.out.println("resultFor "+ n +"! = " + facFor(resultFac));
        System.out.println("resultWhile "+ n +"! = " + facWhile(resultFac));
    }

}
