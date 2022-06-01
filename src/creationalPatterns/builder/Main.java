package creationalPatterns.builder;

public class Main {
    public static void main(String[] args) {
        BurgerMeal order1 = new BurgerMealBuilder("Premium Veg Burger").prepareBurgerMeal();
        System.out.println("Order 1 :" + order1.toString());

        BurgerMeal order2 = new BurgerMealBuilder("Chicken Burger").setAddOn("Cheese").setDrink("Coke").setSide("Fries").prepareBurgerMeal();
        System.out.println("Order 2 :" + order2.toString());

        BurgerMeal order3 = new BurgerMealBuilder("McEgg Burger").setDessert("Brownie").prepareBurgerMeal();
        System.out.println("Order 3 :" + order3.toString());
    }
}
