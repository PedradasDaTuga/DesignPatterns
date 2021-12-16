public class ImpatientStrategy implements OrderingStrategy{
    private boolean happyHour;
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar){
        bar.order(drink,recipe);
    }
    public void happyHourStarted(StringBar bar){
        happyHour = true;
    }
    public  void happyHourEnded(StringBar bar){
        happyHour = false;
    }
}
