package taller3.televisores;
public class Marca{

    private String nombre;

    Marca(String nombre){
        this.nombre = nombre;
    }

    String getNombre(){
        return this.nombre;
    }

    void Set(String nombre){
        this.nombre = nombre;
    }
}