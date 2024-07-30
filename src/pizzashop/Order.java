package pizzashop;

import java.util.ArrayList;
import java.util.List;

public abstract class Order {
    Customer customer;
    List<Pizza> pizzas;
    List<Beverage> beverages;
    double totalBill;

    public Order(Customer customer) {
        this.customer = customer;
        this.pizzas = new ArrayList<>();
        this.beverages = new ArrayList<>();
        this.totalBill = 0.0;
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
        totalBill += pizza.price;
    }

    public void addBeverage(Beverage beverage) {
        beverages.add(beverage);
        totalBill += beverage.price;
    }

    public void applyDiscount() {
        if (totalBill > 5000) {
            totalBill *= 0.9; // added 10% discount
        }
    }

    public abstract void calculateBill();

    public abstract boolean isDelivery();
}

class DeliveryOrder extends Order {
    public DeliveryOrder(Customer customer) {
        super(customer);
    }

    @Override
    public void calculateBill() {
        applyDiscount();
    }

    @Override
    public boolean isDelivery() {
        return true;
    }
}

class PickupOrder extends Order {
    public PickupOrder(Customer customer) {
        super(customer);
    }

    @Override
    public void calculateBill() {
        applyDiscount();
    }

    @Override
    public boolean isDelivery() {
        return false;
    }
}
