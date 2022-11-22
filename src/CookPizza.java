public class CookPizza {
    public static void Cook(){
        BuilderPizza pb = new BuilderPizza();
        Pizza pizzaPeppyPaneer = pb.makePeppyPaneer().addIngredient("Barbeque").build();
        Print.Print(pizzaPeppyPaneer);

        Pizza pizzaMargherita = pb.makeMargherita().addIngredient("FreshTomato").build();
        Print.Print(pizzaMargherita);

    }
}
