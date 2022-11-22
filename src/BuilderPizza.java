import java.util.List;

public class BuilderPizza {
    public Pizza pizza;
    public BuilderPizza(){}

    public BuilderPizza makePeppyPaneer(){
        pizza = FactoryPizza.makePeppyPaneerPizza();
        return this;
    }

    public BuilderPizza makeFarmHouse(){
        pizza = FactoryPizza.makeFarmHousePizza();
        return this;
    }

    public BuilderPizza makeMargherita(){
        pizza = FactoryPizza.makeMargheritaPizza();
        return this;
    }

    public BuilderPizza makeChickenFiesta(){
        pizza = FactoryPizza.makeChickenFiestaPizza();
        return this;
    }

    public BuilderPizza makeSimplePizza(){
        pizza = FactoryPizza.makeSimplePizzaPizza();
        return this;
    }

    public BuilderPizza addIngredient(String ingr){
        pizza.addIngredient(ingr);
        return this;
    }

    public BuilderPizza addPizza(List<String> ingr){
        pizza.addPizza(ingr);
        return this;
    }

    public Pizza build(){
        return this.pizza;
    }
}
