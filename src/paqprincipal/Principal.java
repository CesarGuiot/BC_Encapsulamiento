package paqprincipal;

public class Principal {
    public static void main(String[] args) {
        Persona cesar = new Persona();
        cesar.setEdad(30);
        cesar.setNombre("Cesar Andres");
        cesar.setTelefono("36455321");
        System.out.println("La persona se llama "+cesar.getNombre()+", tiene "+cesar.getEdad()+" años de edad, y su " +
                "teléfono es el "+cesar.getTelefono()+" de Colombia");
    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getTelefono(){
        return this.telefono;
    }
}

