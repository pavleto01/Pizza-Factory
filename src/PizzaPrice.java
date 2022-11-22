public class PizzaPrice {
    public static double getPrice(String type){
        double price = 0;
        switch (type){
            case "PeppyPaneer": price = 10; break;
            case "FarmHouse": price = 20; break;
            case " Margherita": price = 10; break;
            case "ChickenFiesta": price = 20; break;
            case "SimplePizza": price = 5; break;
            case "UnknownPizza": price = 0; break;
        }
        return price;
    }
}
