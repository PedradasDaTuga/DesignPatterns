public class StringReplacer implements StringTransformer{
    private char a;
    private char b;
    StringReplacer(char a1, char b2){
        this.a=a1;
        this.b=b2;
    }
    @Override
    public void execute(StringDrink drink) {
        String bebida= drink.getText();
        String mudado=bebida.replace(this.a,this.b);
        drink.setText(mudado);
    }

    public void undo(StringDrink drink){
        String bebida= drink.getText();;
        String mudar=bebida.replace(this.b,this.a);
        drink.setText(mudar);
    }
}
