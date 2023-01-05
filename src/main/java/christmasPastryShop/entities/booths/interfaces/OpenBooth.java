package christmasPastryShop.entities.booths.interfaces;

public class OpenBooth extends BaseBooth{

    private static final double PRICEPERPERSON = 2.50;

    public OpenBooth(int boothNumber, int capacity, double pricePerPerson) {
        super(boothNumber, capacity, PRICEPERPERSON);
    }
}
