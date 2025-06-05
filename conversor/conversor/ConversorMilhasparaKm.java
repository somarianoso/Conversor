public class ConversorMilhasparaKm extends Conversor {

    @Override
    public double converte(double distancia) {
        return distancia * 1.60934; // 1 milha = 1.60934 km
    }

    
    static private ConversorMilhasparaKm instance = null;
    private ConversorMilhasparaKm() {}
    static ConversorMilhasparaKm getInstance() {
        if (instance == null) {
            instance = new ConversorMilhasparaKm();
        }
        return instance;
    }
}
