import java.util.List;

public class StringRecipe{
    private List<StringTransformer>  transformer;

    StringRecipe(List<StringTransformer> transformers){
                this.transformer=transformers;
    }
    public void mix(StringDrink drink){
            for( StringTransformer action: transformer)
                action.execute(drink);
    }
}
