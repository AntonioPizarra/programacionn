public class Ejercicio9 {
    public static void main(String[] args) {
        final double PI = 3.141592654;

        System.out.println("Volumen de un cono") ;
        System.out.println("------------------") ;
        System.out.print("Introduzca la altura (cm): ") ;
        double h = Double.parseDouble(System.console().readLine()) ;
        System.out.print("Introduzca el radio de la base (cm): ") ;
        double r = Double.parseDouble(System.console().readLine()) ;
        double v = (1.0/3.0) * PI * r * r * h;
        System.out.println("El volumen del cono es de " +  v + " cm³") ;
    }
}