package TemelVeriTipleriVeKullaniciGirisleri;
import java.util.Scanner;
public class GroceryCase {
    public static void main(String[] args) {
        double tomatoesPrice=7,cherryPrice=12.79, applePrice=4.89, pearPrice=9.50, spinachPrice=4.25, bananaPrice=9.99,
                tomatoesAmount, cherryAmount, appleAmount, pearAmount, spinachAmount, bananaAmount,tomatoesSum,cherrySum,appleSum,pearSum,
                spinachSum,bananaSum,total;
        Scanner input = new Scanner(System.in);

        System.out.println("How many kilograms of Tomatoes did you buy ? : ");
        tomatoesAmount= input.nextDouble();
        tomatoesSum=tomatoesAmount*tomatoesPrice;
        System.out.println("The amount that you have to pay for the Tomatoes you bought:  " +tomatoesSum);

        System.out.println("How many kilograms of Cherries did you buy ? : ");
        cherryAmount=input.nextDouble();
        cherrySum=cherryAmount*cherryPrice;
        System.out.println("The amout that you have to pay for the Cherries you bought:" +cherrySum);

        System.out.println("How many kilograms of Apples did you buy ? : ");
        appleAmount= input.nextDouble();
        appleSum=appleAmount*applePrice;
        System.out.println("The amount that you have to pay for the Apples you bought: " +appleSum);

        System.out.println("How many kilograms of Pears did you buy ? : ");
        pearAmount= input.nextDouble();
        pearSum=pearAmount*pearPrice;
        System.out.println("The amount that you have to pay for the Pears you bought: " +pearSum);


        System.out.println("How many kilograms of Spinaches did you buy ? : ");
        spinachAmount= input.nextDouble();
        spinachSum=spinachAmount*spinachPrice;
        System.out.println("The amount that you have to pay for the Spinaches you bought: " +spinachSum);


        System.out.println("How many kilograms of Bananas did you buy ? : ");
        bananaAmount= input.nextDouble();
        bananaSum=bananaAmount*bananaPrice;
        System.out.println("The amount that you have to pay for the Bananas you bought: " +bananaSum);


        total=tomatoesSum+cherrySum+appleSum+pearSum+spinachSum+bananaSum;

        System.out.println("The amount you have to pay for all the goods you bought:" +total );

        System.out.println("Thank you !");










    }

}
