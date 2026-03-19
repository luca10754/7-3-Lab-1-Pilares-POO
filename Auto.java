public class Auto extends Vehiculo{

    private int revoluciones;

    public Auto(String marca, String modelo, int revoluciones){
        super(marca, modelo);
        this.marca=marca;
        this.modelo=modelo;
        this.revoluciones=revoluciones;
    }

    @Override
    public void arrancar() {
       System.out.println("El auto marca " + marca + " modelo " + modelo + " tiene revoluciones " + revoluciones + " va a las chapas y hace RUM RUM");
    }
    
}
