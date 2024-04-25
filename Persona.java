class Persona{
    String nombre,apellido;
    int edad;
    double altura;

    Persona(){
        System.out.println("SE ESTÀ CONSTRUYENDO EL PERSONA");
    }
    public void mostrarNombreCompleto(){
        System.out.println("!HOLAA SOY " + this.nombre + " " + this.apellido);
    }
    public void mostrarEdad(){
        System.out.println("Tengo " + this.edad + " años");
    }
    public void mostrarAltura(){
        System.out.println("Mido " + this.altura + "m");
    }
}