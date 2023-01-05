package christmasPastryShop.entities.booths.interfaces;

public class PrivateBooth extends BaseBooth{

    private static final double PRICEPERPERSON = 3.50;

    public PrivateBooth(int boothNumber, int capacity, double pricePerPerson) {
        super(boothNumber, capacity, PRICEPERPERSON);
    }
}
