public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Área de un rectángulo") ;
        System.out.println("---------------------");
        System.out.print("Introduzca la longitud de la base (cm): ") ;
        double base = Double.parseDouble(System.console().readLine()) ;
        System.out.print("Introduzca la altura (cm): ") ;
        double altura = Double.parseDouble(System.console().readLine()) ;
        System.out.println("El área del rectángulo es " + (base * altura) + " cm²") ;
    }
}