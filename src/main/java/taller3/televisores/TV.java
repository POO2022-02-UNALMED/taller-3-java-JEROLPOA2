package taller3.televisores;

public class TV {

    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;

    TV(Marca marca, boolean estado){

        this.marca = marca;
        this.estado = estado;
        this.canal = 1;
        this.volumen = 1;
        this.precio = 500;
    }

    void setMarca(Marca marca){
        this.marca = marca;
    }

    void setControl(Control control){
        this.control = control;
    }

    void setPrecio(int precio){
        this.precio = precio;
    }

    void setVolumen(int volumen){
        this.volumen = volumen;
    }

    void setCanal(int canal){
        this.canal = canal;
    }

    private static int numTV;

    void setNumTV(int numTV){
        this.numTV = numTV;
    }

    void turnOn(){
        this.estado = true;
    }

    void turnOff(){
        this.estado = false;
    }

    boolean getEstado(){
        return this.estado;
    }

    int getVolumen(){
        return this.volumen;
    }

    int getPrecio(){
        return this.precio;
    }

    int getCanal(){
        return this.canal;
    }

    Marca getMarca(){
        return this.marca;
    }

    void canalUp(){
        
        if(this.canal >= 0 && this.canal <= 120){
            this.canal++;
        }
        else{
        }        
    }

    void canalDown(){        
        if(this.canal >= 0 && this.canal <= 120){
            this.canal--;
        }
        else{
        }        
    }

    void volumenUp(){       
        if(this.volumen >= 0 && this.volumen <= 7){
            this.volumen++;
        }
        else{
        }    
    }

    void volumenDown(){   
        if(this.volumen >= 0 && this.volumen <= 7){
            this.volumen--;
        }
        else{
        }  
    }
}
