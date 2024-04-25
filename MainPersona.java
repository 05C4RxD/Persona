import java.util.Scanner;
class MainPersona{
    public void main(String [] args){
        Persona oscar = new Persona();
        Scanner a = new Scanner(System.in);

        String nombre;
        String apellido;
        int edad;
        double altura;
        
        

        oscar.mostrarNombreCompleto();
        oscar.mostrarEdad();
        oscar.mostrarAltura();
        System.out.print("INGRESA TU NOMBRE: ");
        nombre = a.nextLine();
        System.out.print("INGRESA TU APELLIDO: ");
        apellido = a.nextLine();
        System.out.print("INGRESA TU EDAD: ");
        edad = a.nextInt();
        System.out.println("INGRSA ALTURA: ");
        altura = a.nextDouble();

        oscar.nombre = nombre;
        oscar.apellido = apellido;
        oscar.edad = edad;
        oscar.altura = altura;

    }
}