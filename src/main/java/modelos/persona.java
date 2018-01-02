package modelos;

import java.util.ArrayList;

public class persona {
    public String nombre;
    public String apellido;
    public String edad;

    public persona(String nombre, String apellido, String edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public ArrayList listar(){
        ArrayList l=new ArrayList();
        l.add(new persona("rubena","otro","55"));
        l.add(new persona("rubenb","otro","53"));
        l.add(new persona("rubenc","otro","52"));
        l.add(new persona("rubend","otro","51"));
        return l;
    }
}
