package christmasPastryShop.entities.delicacies.interfaces;

import static christmasPastryShop.common.ExceptionMessages.INVALID_NAME;

public abstract class BaseDelicacy implements Delicacy{

    private String name;
    private double portion;
    private double price;

    public BaseDelicacy(String name, double portion, double price) {
        setName(name);
        this.portion = portion;
        this.price = price;
    }

    public void setName(String name) {
        if (name==null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(INVALID_NAME);
        }
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getPortion() {
        return 0;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
