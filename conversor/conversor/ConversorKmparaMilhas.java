public class ConversorKmparaMilhas extends Conversor {

    @Override
    public double converte(double distancia) {
        return distancia * 0.621371;   
    }

    
    static private ConversorKmparaMilhas instance = null;
    private ConversorKmparaMilhas() {}
    static ConversorKmparaMilhas getInstance() {
        if (instance == null) {
            instance = new ConversorKmparaMilhas();
        }
        return instance;
    }
}
