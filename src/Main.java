public class Main {
    public static void main(String[] args) {

        /*Crear clase Persona.
         Crear variables las privadas edad, nombre y telefono de la clase Persona.
         Crear gets y sets de cada propiedad.
         Crear un objeto persona en el main.
         Utiliza los gets y sets para darle valores a las propiedades edad, nombre y
         telefono, por último muéstralas por consola.*/

        Person persona = new Person();

        persona.setEdad(20);
        persona.setNombre("Pablo");
        persona.setTel(375732227);

        System.out.println("NOMBRE:"+persona.getNombre()+", EDAD:"+persona.getEdad()+", TEL:"+persona.getTel());


    }
}

class Person{
    private int edad;
    private String nombre;
    private int tel;

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}