package creationalPatterns.builder;

public class BurgerMealBuilder {
    private String burger_name;
    private String addOn;
    private String drink;
    private String side;
    private String dessert;

    public BurgerMealBuilder(String burger_name) {
        this.burger_name = burger_name;
    }

    public BurgerMealBuilder setBurger_name(String burger_name) {
        this.burger_name = burger_name;
        return this;
    }

    public BurgerMealBuilder setAddOn(String addOn) {
        this.addOn = addOn;
        return this;
    }

    public BurgerMealBuilder setDrink(String drink) {
        this.drink = drink;
        return this;
    }

    public BurgerMealBuilder setSide(String side) {
        this.side = side;
        return this;
    }

    public BurgerMealBuilder setDessert(String dessert) {
        this.dessert = dessert;
        return this;
    }

    public BurgerMeal prepareBurgerMeal() {
        return new BurgerMeal(burger_name, addOn, drink, side, dessert);
    }
}
