public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");
        Vehiculo moto = new Moto("Honda", "CVR 200", 1000);
        moto.arrancar();
        System.out.println("\n");
        Vehiculo auto = new Auto("Audi", "A5", 50000);
        auto.arrancar();
        System.out.println("\n");
    }

}
