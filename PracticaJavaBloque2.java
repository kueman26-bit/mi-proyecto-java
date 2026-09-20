public class PracticaJavaBloque2 {

    public static void main(String[] args) {
        System.out.println("--- EJERCICIO 11 ---");
        ejercicio11();
        
        System.out.println("\n--- EJERCICIO 12 ---");
        ejercicio12();
        
        System.out.println("\n--- EJERCICIO 13 ---");
        ejercicio13();
        
        System.out.println("\n--- EJERCICIO 14 ---");
        ejercicio14();
        
        System.out.println("\n--- EJERCICIO 15 ---");
        ejercicio15();
        
        System.out.println("\n--- EJERCICIO 16 ---");
        ejercicio16();
        
        System.out.println("\n--- EJERCICIO 17 ---");
        ejercicio17();
        
        System.out.println("\n--- EJERCICIO 18 ---");
        ejercicio18();
        
        System.out.println("\n--- EJERCICIO 19 ---");
        ejercicio19();
        
        System.out.println("\n--- EJERCICIO 20 ---");
        ejercicio20();
    }

    // 11. Área de un cuadrado
    public static void ejercicio11() {
        int lado = 9;
        int area = lado * lado;
        System.out.println("Área del cuadrado: " + area);
    }

    // 12. Perímetro de un cuadrado
    public static void ejercicio12() {
        int lado = 12;
        int perimetro = 4 * lado;
        System.out.println("Perímetro del cuadrado: " + perimetro);
    }

    // 13. Área de un rectángulo
    public static void ejercicio13() {
        int base = 18;
        int altura = 7;
        int area = base * altura;
        System.out.println("Área del rectángulo: " + area);
    }

    // 14. Perímetro de un rectángulo
    public static void ejercicio14() {
        int largo = 22;
        int ancho = 9;
        int perimetro = 2 * (largo + ancho);
        System.out.println("Perímetro del rectángulo: " + perimetro);
    }

    // 15. Área de un triángulo
    public static void ejercicio15() {
        int base = 16;
        int altura = 11;
        double area = (base * altura) / 2.0;
        System.out.println("Área del triángulo: " + area);
    }

    // 16. Área de un trapecio
    public static void ejercicio16() {
        int baseMayor = 20;
        int baseMenor = 12;
        int altura = 8;
        double area = ((baseMayor + baseMenor) * altura) / 2.0;
        System.out.println("Área del trapecio: " + area);
    }

    // 17. Área de un rombo
    public static void ejercicio17() {
        int diagonalMayor = 18;
        int diagonalMenor = 10;
        double area = (diagonalMayor * diagonalMenor) / 2.0;
        System.out.println("Área del rombo: " + area);
    }

    // 18. Area de un círculo
    public static void ejercicio18() {
        int radio = 6;
        double area = Math.PI * radio * radio;
        System.out.println("Área del círculo: " + area);
    }

    // 19. Longitud de circunferencia
    public static void ejercicio19() {
        int radio = 8;
        double longitud = 2 * Math.PI * radio;
        System.out.println("Longitud de circunferencia: " + longitud);
    }

    // 20. Volumen de un cubo
    public static void ejercicio20() {
        int arista = 5;
        int volumen = arista * arista * arista;
        System.out.println("Volumen del cubo: " + volumen);
    }
}