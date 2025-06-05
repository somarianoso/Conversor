public class ConversorCelsiusparaKelvin extends Conversor {

    @Override
    public double converte(double temperatura) {
        return temperatura + 273.15;   
    }
   
    static private ConversorCelsiusparaKelvin instance = null;
    private ConversorCelsiusparaKelvin() {}
    static ConversorCelsiusparaKelvin getInstance() {
        if (instance == null) {
            instance = new ConversorCelsiusparaKelvin();
        }
        return instance;
    }
}

