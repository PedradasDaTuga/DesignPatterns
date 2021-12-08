public class StringCaseChanger implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        String bebida= drink.getText();
        char letra;
        String alterada="";
        for (int i=0;i<bebida.length();i++){
            letra=bebida.charAt(i);
            if(Character.isLowerCase(letra)){
                letra=Character.toUpperCase(letra);
            }
            else{
                letra=Character.toLowerCase(letra);
            }
            alterada=alterada+letra;
        }
        drink.setText(alterada);
    }
    public void undo(StringDrink drink){
        String bebida= drink.getText();
        char letra;
        String alterada="";
        for (int i=0;i<bebida.length();i++){
            letra=bebida.charAt(i);
            if(Character.isLowerCase(letra)){
                letra=Character.toUpperCase(letra);
            }
            else{
                letra=Character.toLowerCase(letra);
            }
            alterada=alterada+letra;
        }
        drink.setText(alterada);
    }
}
