import java.util.Scanner;

public class ExponentBul_2 {
    public static void main(String[] args) {
        int maxNumber, exponentBase = 2, exponent = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Kendisine kadar olan 2'nin üslerini istediğiniz sayıyı giriniz: ");
        maxNumber = input.nextInt();

        int i = 0;
        while(maxNumber > exponent){
            exponent = (int) Math.pow(exponentBase, i);
            if (maxNumber > exponent)
                System.out.print(exponent + ", ");
            i++;
        }
    }
}
