public class ConversorKelvinparaCelsius extends Conversor {

    @Override
    public double converte(double temperatura) {
        return temperatura - 273.15;   
    }

    static private ConversorKelvinparaCelsius instance = null;
    private ConversorKelvinparaCelsius() {}
    static ConversorKelvinparaCelsius getInstance() {
        if (instance == null) {
            instance = new ConversorKelvinparaCelsius();
        }
        return instance;
    }
}
