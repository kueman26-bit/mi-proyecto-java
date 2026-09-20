public class PracticaJavaBloque1 {

    public static void main(String[] args) {
        System.out.println("--- EJERCICIO 1 ---");
        ejercicio1();
        
        System.out.println("\n--- EJERCICIO 2 ---");
        ejercicio2();
        
        System.out.println("\n--- EJERCICIO 3 ---");
        ejercicio3();
        
        System.out.println("\n--- EJERCICIO 4 ---");
        ejercicio4();
        
        System.out.println("\n--- EJERCICIO 5 ---");
        ejercicio5();
        
        System.out.println("\n--- EJERCICIO 6 ---");
        ejercicio6();
        
        System.out.println("\n--- EJERCICIO 7 ---");
        ejercicio7();
        
        System.out.println("\n--- EJERCICIO 8 ---");
        ejercicio8();
        
        System.out.println("\n--- EJERCICIO 9 ---");
        ejercicio9();
        
        System.out.println("\n--- EJERCICIO 10 ---");
        ejercicio10();
    }

    // 1. Suma y diferencia
    public static void ejercicio1() {
        int a = 48;
        int b = 17;
        int suma = a + b;
        int diferencia = a - b;
        System.out.println("Suma: " + suma);
        System.out.println("Diferencia: " + diferencia);
    }

    // 2. Producto y cociente
    public static void ejercicio2() {
        int a = 36;
        int b = 6;
        int producto = a * b;
        int cociente = a / b;
        System.out.println("Producto: " + producto);
        System.out.println("Cociente: " + cociente);
    }

    // 3. Residuo de una división
    public static void ejercicio3() {
        int dividendo = 157;
        int divisor = 12;
        int cocienteEntero = dividendo / divisor;
        int residuo = dividendo % divisor;
        System.out.println("Cociente entero: " + cocienteEntero);
        System.out.println("Residuo: " + residuo);
    }

    // 4. Doble, triple y mitad
    public static void ejercicio4() {
        int numero = 24;
        int doble = numero * 2;
        int triple = numero * 3;
        double mitad = numero / 2.0;
        System.out.println("Doble: " + doble);
        System.out.println("Triple: " + triple);
        System.out.println("Mitad: " + mitad);
    }

    // 5. Cuadrado y cubo
    public static void ejercicio5() {
        int numero = 7;
        int cuadrado = numero * numero;
        int cubo = numero * numero * numero;
        System.out.println("Cuadrado: " + cuadrado);
        System.out.println("Cubo: " + cubo);
    }

    // 6. Promedio de tres notas
    public static void ejercicio6() {
        int nota1 = 14;
        int nota2 = 17;
        int nota3 = 16;
        double promedio = (nota1 + nota2 + nota3) / 3.0;
        System.out.println("Promedio aritmético: " + promedio);
    }

    // 7. Promedio de cuatro prácticas
    public static void ejercicio7() {
        int p1 = 15;
        int p2 = 13;
        int p3 = 18;
        int p4 = 16;
        double promedio = (p1 + p2 + p3 + p4) / 4.0;
        System.out.println("Promedio de prácticas: " + promedio);
    }

    // 8. Operaciones combinadas
    public static void ejercicio8() {
        int a = 12;
        int b = 8;
        int c = 4;
        double r = (a + b) * c / 2.0;
        System.out.println("Resultado R: " + r);
    }

    // 9. Expresión con paréntesis
    public static void ejercicio9() {
        int a = 20;
        int b = 6;
        int c = 3;
        int r = (a - b) * (a + c);
        System.out.println("Resultado R: " + r);
    }

    // 10. Expresión fraccionaria
    public static void ejercicio10() {
        int a = 18;
        int b = 7;
        int c = 3;
        // Se usa 3.0 o (double) para forzar la división decimal exacta
        double r = (a - b) / (double)c;
        System.out.println("Resultado R: " + r);
    }
}