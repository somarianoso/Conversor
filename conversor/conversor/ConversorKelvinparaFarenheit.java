public class ConversorKelvinparaFarenheit implements Conversor {

    @Override
    public double converte(double temperatura) {
        return (temperatura - 273.15) * 9 / 5 + 32;    
    }
    
}

