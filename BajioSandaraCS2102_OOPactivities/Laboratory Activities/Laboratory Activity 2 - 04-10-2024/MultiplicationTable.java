import java.util.Scanner;

class MultiplicationTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the multiplication table: ");
        int tableSize = input.nextInt();

        int[][] table = new int[tableSize + 1][tableSize + 1];

        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                table[i][j] = i * j;
            }
        }
       
        System.out.println("Multiplication Table:");
        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                System.out.printf("%4d", table[i][j]); 
            }
            System.out.println(); 
        }

        input.close();
    }
}
