import java.util.Scanner;
class Tempconvert {
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter a Celsius value: ");
        int celsius = scanner.nextInt();
        int fahrenheit = celsius * 9/5 + 32;
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
        scanner.close();
    }
}
