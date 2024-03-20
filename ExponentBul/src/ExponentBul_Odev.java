import java.util.Scanner;

public class ExponentBul_Odev {
    public static void main(String[] args) {
        int maxNumber, exponentBase1 = 4, exponentBase2 = 5, exponent1 = 0, exponent2 = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Kendisine kadar olan " + exponentBase1 + " ve " + exponentBase2 + " sayılarının üslerini istediğiniz sayıyı giriniz: ");
        maxNumber = input.nextInt();

        for(int i = 0; (maxNumber > exponent1) || (maxNumber > exponent2); i++){
            exponent1 = (int) Math.pow(exponentBase1, i);
            if (maxNumber > exponent1)
                System.out.print(exponent1 + ", ");
            exponent2 = (int) Math.pow(exponentBase2, i);
            if (maxNumber > exponent2)
                System.out.print(exponent2 + ", ");
        }
    }
}
