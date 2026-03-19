public class Moto extends Vehiculo{

    private int cilindrada;
    
    public Moto(String marca, String modelo, int cilindrada){
        super(marca, modelo);
        this.marca=marca; //llama al atributode la super clase
        this.modelo=modelo; //llama al atributo de la super clase
        this.cilindrada=cilindrada; //llama al objeto de esta clase
    }

    @Override
    public void arrancar(){  
        //METODO
        System.out.println("La moto marca " + marca + " modelo " + modelo + " cilindrada " +cilindrada + " arranca con patada");
        

    }

}
