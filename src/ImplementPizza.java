import java.util.ArrayList;
import java.util.List;

public class ImplementPizza implements Pizza{
    private PizzaType type;
    private double price;
    private List<String> ingredients;

    public ImplementPizza(PizzaType type){
        if(type == null)
            type = PizzaType.UnknownPizza;
        this.type = type;
        this.price = PizzaPrice.getPrice(type.toString());
        ingredients = new ArrayList<>();
    }

    public void addPizza(List<String> pizza){
        for(String p : pizza){
            ingredients.add(p);
            price += PriceIngredient.getPrice(p);
        }
    }

    public void addIngredient(String ingr){
        ingredients.add(ingr);
        price += PriceIngredient.getPrice(ingr);
    }



    @Override
    public String toString() {
        return "Your order: "
                + type  +
                " with additional" + ingredients +
                ". Price = " + price;
    }
}
