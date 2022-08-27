package taller3.televisores;

public class TV {

    Marca marca;
    int canal;
    int precio;
    boolean estado;
    int volumen;
    Control control;

    public TV(Marca marca, boolean estado){

        this.marca = marca;
        this.estado = estado;
        this.canal = 1;
        this.volumen = 1;
        this.precio = 500;
        numTV++;
    }

    public void setMarca(Marca marca){
        this.marca = marca;
    }

    public void setControl(Control control){
        this.control = control;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }

    public void setVolumen(int volumen){
        this.volumen = volumen;
    }

    public void setCanal(int canal){
        this.canal = canal;
    }

    private static int numTV;

    public void turnOn(){
        this.estado = true;
    }

    public void turnOff(){
        this.estado = false;
    }

    public boolean getEstado(){
        return this.estado;
    }

    public int getVolumen(){
        return this.volumen;
    }

    public int getPrecio(){
        return this.precio;
    }

    public int getCanal(){
        return this.canal;
    }

    public Marca getMarca(){
        return this.marca;
    }

    public Control getControl(){
        return this.control;
    }

    public static int getNumTV(){
        return numTV;
    }

    public void canalUp(){
        
        if(this.canal >= 0 && this.canal <= 120){
            this.canal++;
        }
        else{
        }        
    }

    public void canalDown(){        
        if(this.canal >= 0 && this.canal <= 120){
            this.canal--;
        }
        else{
        }        
    }

    public void volumenUp(){       
        if(this.volumen >= 0 && this.volumen <= 7){
            this.volumen++;
        }
        else{
        }    
    }

    public void volumenDown(){   
        if(this.volumen >= 0 && this.volumen <= 7){
            this.volumen--;
        }
        else{
        }  
    }
}
