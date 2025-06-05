public class ConversorCelsiusparaKelvin extends Conversor {

    @Override
    public double converte(double temperatura) {
        return temperatura + 273.15;   
    }
    @Override
    public Conversor clone() {
        return new ConversorCelsiusparaKelvin();
    }
}

