import java.util.Scanner;

class GetArrayMean {
  
    static float getArrayMean(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (float) sum / array.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] numArray = new int[n];

        for (int ctr = 0; ctr < n; ctr++) {
            System.out.print("Enter number: ");
            numArray[ctr] = input.nextInt();
        }

        System.out.printf("Mean of array is: %.2f%n", getArrayMean(numArray));

        input.close();
    }
}
