package classroom;
public class Persona {

    long cedula=1;
    String nombre;
    static int totalPersonas=0;


    Persona( String nombre) {
        this.nombre = nombre;
        totalPersonas++;
    }
    
    Persona(String nombre, long cedula) {
       this.nombre = nombre;
       this.cedula=cedula;
   }

    Persona(long cedula) {
       this.cedula = cedula;
       this.nombre = "";
       totalPersonas++;
   }
    
   Persona(){
	   this("",0);
   }
   

  //  Persona(String nombre) {
   //     this.nombre = "";
   //     totalPersonas++;
   // }
    
    long getCedula() {
        return cedula;
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }
}