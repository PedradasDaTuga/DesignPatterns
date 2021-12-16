public class HumanClient implements Client{
    private OrderingStrategy estrategia;
    HumanClient(OrderingStrategy strategy){
        this.estrategia=strategy;
    }
   public void wants(StringDrink drink, StringRecipe recipe, StringBar bar){
        estrategia.wants(drink,recipe,bar);
   };
    @Override
    public void happyHourStarted(Bar bar) {
               estrategia.happyHourStarted((StringBar) bar);
    }

    @Override
    public void happyHourEnded(Bar bar) {
        estrategia.happyHourStarted((StringBar) bar);
    }
}
