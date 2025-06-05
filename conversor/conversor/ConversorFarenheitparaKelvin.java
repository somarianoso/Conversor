public class ConversorFarenheitparaKelvin extends Conversor {

    @Override
    public double converte(double temperatura) {
        return (temperatura - 32) * 5 / 9 + 273.15;    
    }
    @Override
    public Conversor clone() {
        return new ConversorFarenheitparaKelvin();
    }
    
}

