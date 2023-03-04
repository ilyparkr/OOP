import java.util.Scanner;
public class Lab2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 375.99;
        System.out.println("please insert your monitor size 38 or 43 only");
        int monitor = sc.nextInt();
        System.out.println("Do you want DVD-ROM? 1 is Yes / 0 is No");
        int dvd_rom = sc.nextInt();
        System.out.println("Do you want printer? 1 is Yes / 0 is No");
        int printer = sc.nextInt();
        System.out.println("======= Your order =======");
        System.out.println("* computer >>> 375.99$");
        if (monitor == 38){
            total += 75.99;
            System.out.println("* 38'Monitor >>> 75.99$");
        }
        else if (monitor == 43){
            total += 99.99;
            System.out.println("* 43'Monior >>> 99.99$");
        }
        if (dvd_rom == 1){
            total += 65.99;
            System.out.println("* DVD-Rom >>> 65.99$");
        }
        if (printer == 1){
            total += 125.00;
            System.out.println("* Printer >>> 125.00$");
        }
        System.out.println("======= Total price >>> "+total+" =======");
    }
}
