public class PracticaJavaBloque3 {

    public static void main(String[] args) {
        System.out.println("--- EJERCICIO 21 ---");
        ejercicio21();
        
        System.out.println("\n--- EJERCICIO 22 ---");
        ejercicio22();
        
        System.out.println("\n--- EJERCICIO 23 ---");
        ejercicio23();
        
        System.out.println("\n--- EJERCICIO 24 ---");
        ejercicio24();
        
        System.out.println("\n--- EJERCICIO 25 ---");
        ejercicio25();
        
        System.out.println("\n--- EJERCICIO 26 ---");
        ejercicio26();
        
        System.out.println("\n--- EJERCICIO 27 ---");
        ejercicio27();
        
        System.out.println("\n--- EJERCICIO 28 ---");
        ejercicio28();
        
        System.out.println("\n--- EJERCICIO 29 ---");
        ejercicio29();
        
        System.out.println("\n--- EJERCICIO 30 ---");
        ejercicio30();
    }

    // 21. Volumen de un prisma rectangular
    public static void ejercicio21() {
        int largo = 12;
        int ancho = 6;
        int altura = 4;
        int volumen = largo * ancho * altura;
        System.out.println("Volumen del prisma: " + volumen);
    }

    // 22. Volumen de un cilindro
    public static void ejercicio22() {
        int radio = 4;
        int altura = 10;
        double volumen = Math.PI * radio * radio * altura;
        System.out.println("Volumen del cilindro: " + volumen);
    }

    // 23. Distancia recorrida
    public static void ejercicio23() {
        int velocidad = 85;
        double tiempo = 3.5;
        double distancia = velocidad * tiempo;
        System.out.println("Distancia recorrida: " + distancia + " km");
    }

    // 24. Velocidad promedio
    public static void ejercicio24() {
        int distancia = 540;
        int tiempo = 6;
        double velocidad = (double) distancia / tiempo;
        System.out.println("Velocidad promedio: " + velocidad + " km/h");
    }

    // 25. Tiempo de viaje
    public static void ejercicio25() {
        int distancia = 360;
        int velocidad = 80;
        double tiempo = (double) distancia / velocidad;
        System.out.println("Tiempo de viaje: " + tiempo + " h");
    }

    // 26. Conversion de horas
    public static void ejercicio26() {
        double horas = 7.5;
        double minutos = horas * 60;
        double segundos = horas * 3600;
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
    }

    // 27. Conversion de segundos
    public static void ejercicio27() {
        int totalSegundos = 10000;
        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundosRestantes = totalSegundos % 60;
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos restantes: " + segundosRestantes);
    }

    // 28. Celsius a Fahrenheit
    public static void ejercicio28() {
        int c = 24;
        double f = (c * 9.0 / 5.0) + 32;
        System.out.println("Temperatura en Fahrenheit: " + f + " °F");
    }

    // 29. Fahrenheit a Celsius
    public static void ejercicio29() {
        int f = 95;
        double c = (f - 32) * 5.0 / 9.0;
        System.out.println("Temperatura en Celsius: " + c + " °C");
    }

    // 30. Consumo de combustible
    public static void ejercicio30() {
        int km = 525;
        int litros = 35;
        double rendimiento = (double) km / litros;
        System.out.println("Rendimiento: " + rendimiento + " km/litros");
    }
}