package christmasPastryShop.entities.cocktails.interfaces;

public class MulledWine extends BaseCocktail{

    private static final double PRICE = 3.50;

    public MulledWine(String name, int size, double price, String brand) {
        super(name, size, PRICE, brand);
    }
}
