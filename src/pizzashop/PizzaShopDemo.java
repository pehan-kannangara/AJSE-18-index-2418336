package pizzashop;

public class PizzaShopDemo {
    public static void main(String[] args) {
        PizzaShop pizzaShop = new PizzaShop();

        // Adding customers
        Customer goldCustomer = new GoldCustomer("Pehan", "0770734661");
        Customer normalCustomer = new NormalCustomer("Rithmal", "0702774158");
        pizzaShop.addCustomer(goldCustomer);
        pizzaShop.addCustomer(normalCustomer);

        // Creating and adding pizzas and beverages
        Pizza vegPizza = new VegPizza("Margherita", 2500);
        vegPizza.addIngredient("Tomato");
        vegPizza.addIngredient("Cheese");

        Pizza nonVegPizza = new NonVegPizza("Pepperoni", 3000);
        nonVegPizza.addIngredient("Pepperoni");
        nonVegPizza.addIngredient("Cheese");

        Beverage coke = new Beverage("Coke", 200);

        // Creating orders
        Order deliveryOrder = new DeliveryOrder(goldCustomer);
        deliveryOrder.addPizza(vegPizza);
        deliveryOrder.addPizza(nonVegPizza);
        deliveryOrder.addBeverage(coke);

        Order pickupOrder = new PickupOrder(normalCustomer);
        pickupOrder.addPizza(vegPizza);
        pickupOrder.addPizza(nonVegPizza);
        pickupOrder.addBeverage(coke);

        pizzaShop.addOrder(deliveryOrder);
        pizzaShop.addOrder(pickupOrder);

        // Calculate bills
        deliveryOrder.calculateBill();
        pickupOrder.calculateBill();

        // Display total pizzas made
        System.out.println("Total pizzas made: " + pizzaShop.getTotalPizzasMade());

        // Send promotions to gold customers
        pizzaShop.sendPromotions();

        // Display order bills
        System.out.println("Delivery Order Bill: " + deliveryOrder.totalBill);
        System.out.println("Pickup Order Bill: " + pickupOrder.totalBill);
    }
}
