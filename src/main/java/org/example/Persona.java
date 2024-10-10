package org.example;

public class Persona {
    String nombre;
    int edad;
    String ocupacion;
    String sexo;
    int telefono;

    // Constructor
    public Persona(String nombre, int edad, String ocupacion, String sexo, int telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.sexo = sexo;
        this.telefono = telefono;
    }

    public void presentarse(){
        System.out.println("Hola mi nombre es: " + nombre +
                " y mi sexo es " + sexo +
                " Mi ocupacion es " + ocupacion +
                " tengo " + edad +
                " años y mi telefono es " + telefono);
    }

    public void correr(){
        System.out.println("Soy " + nombre + " tengo " + edad + " años de edad, voy a correr!");
    }

    public static void main(String [] args) {

        //Creamos instancias
        Persona estudiante = new Persona("Pepito", 20, "Estudiante", "Masculino", 987544446);

        Persona Docente = new Persona("Jorge", 35, "Docente", "Masculino", 988885546);

        Persona Secretaria = new Persona("Conchita", 28, "Secretaria", "Femenino", 987783346);

        Persona Corredor1 = new Persona("Steve", 25, "", "",1 );

        Persona Corredor2 = new Persona("Alberto", 26, "", "" ,1);

        //Invocamos instancias
        estudiante.presentarse();
        Docente.presentarse();
        Secretaria.presentarse();
        Corredor1.correr();
        Corredor2.correr();
    }
}
