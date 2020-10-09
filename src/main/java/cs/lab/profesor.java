


public class profesor implements observable(){
    private static profesor instance=null;
    private ArrayList<observador> observadores;
    private String nombre;

    public name(String n){
        nombre=n;
        }

    private profesor(){
    
    }

    public static profesor getInstance() {
        if (instance == null){
        instance = new Singleton(); 
        }
        return instance;
    }

    public enlazarobservador(Obaservador o){
        observadores.add(o);
    }


    public void validar(){
        notificar;
    }

    @Override
    public void notificar(){
        for(observador o: observadores){
            o.update();
        }
    }


}