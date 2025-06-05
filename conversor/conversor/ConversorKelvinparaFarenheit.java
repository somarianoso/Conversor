public class ConversorKelvinparaFarenheit extends Conversor {

    @Override
    public double converte(double temperatura) {
        return (temperatura - 273.15) * 9 / 5 + 32;    
    }
    @Override
    public Conversor clone() {
        return new ConversorKelvinparaFarenheit();
    }
}

