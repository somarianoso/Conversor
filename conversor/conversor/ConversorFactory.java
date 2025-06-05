import java.util.HashMap;

public class ConversorFactory {

    public static HashMap<String, Conversor> conversor = new HashMap<>();

        public ConversorFactory(){
            conversor.put("KelvinparaCelsius", new ConversorKelvinparaCelsius());
            conversor.put("KelvinparaFarenheit", new ConversorKelvinparaFarenheit());
            conversor.put("CelsiusparaKelvin", new ConversorCelsiusparaKelvin());
            conversor.put("CelsiusparaFarenheit", new ConversorCelsiusparaFarenheit());
            conversor.put("FarenheitparaCelsius", new ConversorFarenheitparaCelsius());
            conversor.put("FarenheitparaKelvin", new ConversorFarenheitparaKelvin());
        }
        public Conversor newConversor(String tipo) {
            return conversor.get(tipo).clone();
        }
        
    }
