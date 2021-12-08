import java.util.List;

public class StringTransformerGroup implements StringTransformer {
    private List<StringTransformer> transformer;

    StringTransformerGroup(List<StringTransformer> transformers){
        this.transformer=transformers;
    }

    public void execute(StringDrink drink){
        for( StringTransformer action: transformer)
            action.execute(drink);
    }
}
