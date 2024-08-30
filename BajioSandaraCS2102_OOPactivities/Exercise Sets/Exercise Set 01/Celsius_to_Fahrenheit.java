import java.util.Scanner;
class Celsius_to_Fahrenheit {
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter a Celsius value: ");
        int celsius = scanner.nextInt();
        int fahrenheit = celsius * 9/5 + 32;
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
        scanner.close();
    }
}
