public class Main {
    public static void main(String[] args) {
        Product milk = new Product("Mjölk", 20.0, 3);
        Product apples = new Product("Äpplen", 5.0, 8);

        Discount fridayDiscount = new FridayDiscount(null);
        Discount milkDiscount = new MilkDiscount(fridayDiscount);
        Discount quantityDiscount = new QuantityDiscount(milkDiscount);

        double discountForMilk = milkDiscount.apply(milk);
        double discountForApples = quantityDiscount.apply(apples);

        System.out.println("Rabatt för Mjölk: " + discountForMilk);
        System.out.println("Rabatt för Äpplen: " + discountForApples);
    }
}
