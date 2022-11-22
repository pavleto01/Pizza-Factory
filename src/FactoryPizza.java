public class FactoryPizza {
    public static Pizza makePeppyPaneerPizza(){
        return new ImplementPizza(PizzaType.PeppyPaneer);
    }

    public static Pizza makeFarmHousePizza(){
        return new ImplementPizza(PizzaType.FarmHouse);
    }

    public static Pizza makeMargheritaPizza(){
        return new ImplementPizza(PizzaType.Margherita);
    }

    public static Pizza makeChickenFiestaPizza(){
        return new ImplementPizza(PizzaType.ChickenFiesta);
    }

    public static Pizza makeSimplePizzaPizza(){
        return new ImplementPizza(PizzaType.SimplePizza);
    }
}
