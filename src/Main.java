public class Main {
    public void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "Oscar Escob";
        cliente.edad = 30;
        cliente.telefono = 321251;
        cliente.credito = "consumo";
            System.out.println(cliente.nombre + cliente.edad);
    }
    class Persona {
        int edad;
        String nombre;
        int telefono;
    }
    class Cliente extends Persona {
        String credito;
    }
}
