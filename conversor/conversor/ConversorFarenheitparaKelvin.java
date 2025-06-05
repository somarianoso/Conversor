public class ConversorFarenheitparaKelvin extends Conversor {

    @Override
    public double converte(double temperatura) {
        return (temperatura - 32) * 5 / 9 + 273.15;    
    }
    
    static private ConversorFarenheitparaKelvin instance = null;
    private ConversorFarenheitparaKelvin() {}
    static ConversorFarenheitparaKelvin getInstance() {
        if (instance == null) {
            instance = new ConversorFarenheitparaKelvin();
        }
        return instance;
    }
}
    

