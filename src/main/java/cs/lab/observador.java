
public interface observador{
    
    private boolean notificado;
    
    public observador(){
        notificado=false;
    }

    public void update(){
        notificado=true;
    }

    public boolean estaNotificado(){
        return notificado;
    }    
}