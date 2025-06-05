
public class ConversorCelsiusparaFarenheit extends Conversor {

    @Override
    public double converte(double temperatura) {
        return 9*temperatura/5 + 32;
    }
    
    static private ConversorCelsiusparaFarenheit instance = null;
    private ConversorCelsiusparaFarenheit() {}
    static ConversorCelsiusparaFarenheit getInstance() {
        if (instance == null) {
            instance = new ConversorCelsiusparaFarenheit();
        }
        return instance;
}
}
