
public class RegistraApp{

         public observador  CE2A= new observador;
         public observador  CounterAlumnos= new observador;
         public observador  DGA= new observador;
         public observador  CounterDocentes= new observador;
         public profesor profe= profesor.getInstance();

         public void log(String n){
               profe.name(n);
               profe.enlazarObservador(CE2A);
               profe.enlazarObservador(DGA);
               profe.enlazarObservador(CounterAlumnos);
               profe.enlazarObservador(CounterDocentes);
           }

        public void tituloyEnlace(String titulo, String Enlace){
            validar();

        }

        public validar(){
            ///No llegue a validar para expresiones regulares
            //No llegue a hacer la excepecion
            profe.validar();
        }


}   