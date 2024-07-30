package pizzashop;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    double price;
    List<String> ingredients;

    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }

    public abstract String getType();
}

class VegPizza extends Pizza {
    public VegPizza(String name, double price) {
        super(name, price);
    }

    @Override
    public String getType() {
        return "Veg";
    }
}

class NonVegPizza extends Pizza {
    public NonVegPizza(String name, double price) {
        super(name, price);
    }

    @Override
    public String getType() {
        return "Non-Veg";
    }
}
