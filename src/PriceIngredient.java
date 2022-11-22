public class PriceIngredient {

    public static double getPrice(String type){
        double price = 0;
        switch (type){
            case "FreshTomato": price = 0.4; break;
            case "Barbeque": price = 0.9; break;
            case "Paneer": price = 0.7; break;
        }
        return price;
    }
}
