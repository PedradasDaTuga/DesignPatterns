import java.util.ArrayList;
import java.util.List;

public class StringBar extends Bar{
    private boolean estado;

    StringBar(){
        this.estado=false;
    }
    @Override
    public boolean isHappyHour() {
        return estado;
    }

    @Override
    public void startHappyHour() {
        this.estado=true;
        notifyObservers();
    }


    @Override
    public void endHappyHour() {
        this.estado=false;
        notifyObservers();
    }

}
