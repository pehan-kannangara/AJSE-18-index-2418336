package pizzashop;

import java.util.ArrayList;
import java.util.List;

public class PizzaShop {
    List<Customer> customers;
    List<Order> orders;
    int totalPizzasMade;

    public PizzaShop() {
        this.customers = new ArrayList<>();
        this.orders = new ArrayList<>();
        this.totalPizzasMade = 0;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addOrder(Order order) {
        orders.add(order);
        totalPizzasMade += order.pizzas.size();
    }

    public int getTotalPizzasMade() {
        return totalPizzasMade;
    }

    public void sendPromotions() {
        for (Customer customer : customers) {
            if (customer.receivesPromotion()) {
                System.out.println("Sending promotion to " + customer.name);
            }
        }
    }
}
