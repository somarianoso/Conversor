public class ConversorFarenheitparaKelvin implements Conversor {

    @Override
    public double converte(double temperatura) {
        return (temperatura - 32) * 5 / 9 + 273.15;    
    }
    
}

