public class ConversorFarenheitparaCelsius extends Conversor {

    @Override
    public double converte(double temperatura) {
        return 5*(temperatura-32)/9;    
    }
    @Override
    public Conversor clone() {
        return new ConversorFarenheitparaCelsius();
    }
    
}
