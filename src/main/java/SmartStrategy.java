import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmartStrategy implements OrderingStrategy{
    private final List<List<Object>> orders = new ArrayList<List<Object>>();
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar){
        if(bar.isHappyHour()){
            bar.order(drink,recipe);
        }
        else
             addDrink(drink, recipe, bar);
    }
    public void happyHourStarted(StringBar bar){
        serveDrinks(bar);
    }
    public  void happyHourEnded(StringBar bar){

    }

    public void addDrink(StringDrink drink, StringRecipe recipe, StringBar bar){
        List<Object> drinkOrder = Arrays.asList(drink, recipe, bar);
        orders.add(drinkOrder);
    }

    public void serveDrinks(StringBar bar){
        for (List<Object> order : orders){
            if(order.get(2)==bar)
           bar.order((StringDrink) order.get(0),(StringRecipe) order.get(1));
        }
    }
}
