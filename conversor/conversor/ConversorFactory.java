import java.util.HashMap;

public class ConversorFactory{

    private static HashMap<String, Conversor> conversor = new HashMap<>();

        static{
            conversor.put("K to C", ConversorKelvinparaCelsius.getInstance());
            conversor.put("K to F", ConversorKelvinparaFarenheit.getInstance());
            conversor.put("C to K", ConversorCelsiusparaKelvin.getInstance());
            conversor.put("C to F", ConversorCelsiusparaFarenheit.getInstance());
            conversor.put("F to C", ConversorFarenheitparaCelsius.getInstance());
            conversor.put("F to K", ConversorFarenheitparaKelvin.getInstance());
            conversor.put("KM to MI", ConversorKmparaMilhas.getInstance());
            conversor.put("MI to KM", ConversorMilhasparaKm.getInstance());
            conversor.put("I to I", ConversorIdentidade.getInstance());
        }

        public static Conversor getConversor(String key) {
            return conversor.get(key);
        }
    }
