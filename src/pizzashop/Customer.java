package pizzashop;

public abstract class Customer {
    String name;
    String contact;

    public Customer(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public abstract boolean receivesPromotion();
}

class GoldCustomer extends Customer {
    public GoldCustomer(String name, String contact) {
        super(name, contact);
    }

    @Override
    public boolean receivesPromotion() {
        return true;
    }
}

class NormalCustomer extends Customer {
    public NormalCustomer(String name, String contact) {
        super(name, contact);
    }

    @Override
    public boolean receivesPromotion() {
        return false;
    }
}
