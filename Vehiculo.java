public abstract class Vehiculo {

 //#private si se usa una sola clase
 //#protected si usamos varias
 //#public todos tienen alcance a los objetos
    protected String modelo;
    protected String marca;

 //el constructor es el metodo que me permite crear objetos de la clase y por defecto tiene el mismo nombre de la clase
    public Vehiculo(String marca, String modelo){
        this.marca=marca;//con this llamamos al objeto marca y lo definimos igual a la variable que esta dentro del constructor
        this.modelo=modelo;
    }

    
    public abstract void arrancar();

}
