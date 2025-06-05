public class ConversorIdentidade extends Conversor {

    @Override
    public double converte(double temperatura) {
        return temperatura;
    }
    
    static private ConversorIdentidade instance = null;
    private ConversorIdentidade() {}
    static ConversorIdentidade getInstance() {
        if (instance == null) {
            instance = new ConversorIdentidade();
        }
        return instance;
}
}
