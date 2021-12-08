
public class StringInverter implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        StringBuilder bebida= new StringBuilder(drink.getText());
        StringBuilder invertido=bebida.reverse();
        drink.setText(invertido.toString());
    }
    public void undo(StringDrink drink){
        StringBuilder bebida= new StringBuilder(drink.getText());
        StringBuilder invertido=bebida.reverse();
        drink.setText(invertido.toString());
    }
}
