public class ConversorFarenheitparaCelsius extends Conversor {

    @Override
    public double converte(double temperatura) {
        return 5*(temperatura-32)/9;    
    }
    
    static private ConversorFarenheitparaCelsius instance = null;
    private ConversorFarenheitparaCelsius() {}
    static ConversorFarenheitparaCelsius getInstance() {
        if (instance == null) {
            instance = new ConversorFarenheitparaCelsius();
        }
        return instance;
    }
}
