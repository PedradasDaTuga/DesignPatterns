public class HumanClient implements Client{

   public void wants(StringDrink drink, StringRecipe recipe, StringBar bar){

   };
    @Override
    public void happyHourStarted(Bar bar) {
                bar.notifyObservers();
    }

    @Override
    public void happyHourEnded(Bar bar) {
        bar.notifyObservers();
    }
}
