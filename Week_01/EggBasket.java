/**
 * EggBasket
 */
public class EggBasket {

    public static void main(String[] args) {
        int numberOfBaskets, eggPerBasket, totalEggs; // declaring multiple variables in the same line since they have
                                                      // the same data type
        numberOfBaskets = 10; // Assignment Statements
        eggPerBasket = 6;
        totalEggs = numberOfBaskets * eggPerBasket;

        System.out.println("If you have");
        System.out.println(eggPerBasket + " eggs per basket and");
        System.out.println(numberOfBaskets + " baskets, then");
        System.out.println("the total number of eggs is " + totalEggs);

    }
}