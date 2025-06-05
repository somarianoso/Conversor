import java.util.HashMap;

public class ConversorFactory {

    public static HashMap<String, Conversor> conversor = new HashMap<>();

        public ConversorFactory(){
            conversor.put("C to F", new ConversorCelsiusParaFarenheit());
            conversor.put("C to K", new ConversorCelsiusParaKelvin());
            conversor.put("F to C", new ConversorFarenheitParaCelsius());
            conversor.put("F to K", new ConversorFarenheitParaKelvin());
            conversor.put("K to C", new ConversorKelvinParaCelsius());
            conversor.put("K to F", new ConversorKelvinParaFarenheit());
            conversor.put("km to miles", new ConversorKilometrosParaMilhas());
            conversor.put("miles to km", new ConversorMilhasParaKilometros());
        }
    }
