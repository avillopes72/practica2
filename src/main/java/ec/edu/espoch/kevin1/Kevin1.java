package ec.edu.espoch.kevin1;
public class Kevin1 {

    public class student{
       public String nombreEst;
       public boolean estadotarj;
       public boolean ingresar(boolean estadoTarj){
           return estadoTarj==true;
       }
       public boolean pedirLibro(boolean estadoLibro){
           return estadoLibro==true;
       }
       public boolean conducir(boolean estadoCar){
           return estadoCar==true;
       }
       public boolean enviarMendaje(boolean estadoCell){
           return estadoCell==true;
       }
       public boolean enviarTarea(boolean estadoLaptop){
           return estadoLaptop==true;
       }
    }
    public class book{
        public String nombreLibro;
        public boolean estadoLibro;
        public String prestar(){
            return nombreLibro.equalsIgnoreCase("luna de ora");
       }
    }
    public class car{
        public boolean estadoCar;
        public int combustible;
        public float velocidad;
        
    }
    public class phone{
        public boolean estadoCell;
        public boolean red;
        public int bateriaCell;
    }
    public class laptop{
        public boolean estadoLaptop;
        public float almacen;
        public boolean red;
        public int baterialap;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
    }
}
