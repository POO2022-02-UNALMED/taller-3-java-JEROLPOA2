package taller3.televisores;
public class Control {
    
    private TV tv;

    void enlazar(TV tv){
        this.tv = tv;
        tv.setControl(this);
    }

    void setTV(TV tv){
        this.tv = tv;
    }

    TV getTV(){
        return tv;
    }

    void turnOn(){
        tv.turnOn();
    }

    void turnOff(){
        tv.turnOff();
    }

    void setCanal(int canal){
        tv.setCanal(canal);
    }

    void canalUp(){
        tv.canalUp();
    }

    void canalDown(){
        tv.canalDown();
    }

    void volumenUp(){
        tv.volumenUp();
    }

    void volumenDown(){
        tv.volumenDown();
    }
}
