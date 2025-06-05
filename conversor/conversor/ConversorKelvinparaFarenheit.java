public class ConversorKelvinparaFarenheit extends Conversor {

    @Override
    public double converte(double temperatura) {
        return (temperatura - 273.15) * 9 / 5 + 32;    
    }
    
    static private ConversorKelvinparaFarenheit instance = null;
    private ConversorKelvinparaFarenheit() {}
    static ConversorKelvinparaFarenheit getInstance() {
        if (instance == null) {
            instance = new ConversorKelvinparaFarenheit();
        }
        return instance;
    }
}

