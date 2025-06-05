public class ConversorKelvinparaCelsius implements Conversor {

    @Override
    public double converte(double temperatura) {
        return temperatura - 273.15;   
    }
    
}
