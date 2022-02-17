package CreationalPatterns.builder;

public class BurgerMeal {
    private String burger_name;
    private String addOn;
    private String drink;
    private String side;
    private String dessert;

    public BurgerMeal(String burger_name, String addOn, String drink, String side, String dessert) {
        this.burger_name = burger_name;
        this.addOn = addOn;
        this.drink = drink;
        this.side = side;
        this.dessert = dessert;
    }

    public String getBurger_name() {
        return burger_name;
    }

    public String getAddOn() {
        return addOn;
    }

    public String getDrink() {
        return drink;
    }

    public String getSide() {
        return side;
    }

    public String getDessert() {
        return dessert;
    }

    @Override
    public String toString() {
        return "BurgerMeal{" +
                "burger_name='" + burger_name + '\'' +
                ", addOn='" + addOn + '\'' +
                ", drink='" + drink + '\'' +
                ", side='" + side + '\'' +
                ", dessert='" + dessert + '\'' +
                '}';
    }
}
