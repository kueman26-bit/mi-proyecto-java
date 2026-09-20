public class PracticaJavaBloque5 {

    public static void main(String[] args) {
        System.out.println("--- EJERCICIO 41 ---");
        ejercicio41();
        
        System.out.println("\n--- EJERCICIO 42 ---");
        ejercicio42();
        
        System.out.println("\n--- EJERCICIO 43 ---");
        ejercicio43();
        
        System.out.println("\n--- EJERCICIO 44 ---");
        ejercicio44();
        
        System.out.println("\n--- EJERCICIO 45 ---");
        ejercicio45();
        
        System.out.println("\n--- EJERCICIO 46 ---");
        ejercicio46();
        
        System.out.println("\n--- EJERCICIO 47 ---");
        ejercicio47();
        
        System.out.println("\n--- EJERCICIO 48 ---");
        ejercicio48();
        
        System.out.println("\n--- EJERCICIO 49 ---");
        ejercicio49();
        
        System.out.println("\n--- EJERCICIO 50 ---");
        ejercicio50();
    }

    // 41. Densidad
    public static void ejercicio41() {
        int masa = 540;
        int volumen = 60;
        double densidad = (double) masa / volumen;
        System.out.println("Densidad: " + densidad + " g/cm3");
    }

    // 42. Presión
    public static void ejercicio42() {
        int fuerza = 720;
        int area = 24;
        double presion = (double) fuerza / area;
        System.out.println("Presión: " + presion + " N/m2");
    }

    // 43. Trabajo mecánico
    public static void ejercicio43() {
        int fuerza = 150;
        int distancia = 18;
        int trabajo = fuerza * distancia;
        System.out.println("Trabajo mecánico (W): " + trabajo + " J");
    }

    // 44. Ley de Ohm
    public static void ejercicio44() {
        int voltaje = 220;
        int resistencia = 44;
        double corriente = (double) voltaje / resistencia;
        System.out.println("Corriente (I): " + corriente + " A");
    }

    // 45. Potencia eléctrica
    public static void ejercicio45() {
        int voltaje = 220;
        int corriente = 5;
        int potencia = voltaje * corriente;
        System.out.println("Potencia (P): " + potencia + " W");
    }

    // 46. Energía eléctrica
    public static void ejercicio46() {
        int potencia = 1200;
        int tiempo = 6;
        int energiaWh = potencia * tiempo;
        double energiaKWh = energiaWh / 1000.0;
        System.out.println("Energía en Wh: " + energiaWh + " Wh");
        System.out.println("Energía en kWh: " + energiaKWh + " kWh");
    }

    // 47. Índice de masa corporal
    public static void ejercicio47() {
        int peso = 72;
        double altura = 1.74;
        double imc = peso / (altura * altura);
        System.out.println("IMC: " + imc);
    }

    // 48. Hipotenusa
    public static void ejercicio48() {
        int a = 9;
        int b = 12;
        double hipotenusa = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenusa: " + hipotenusa);
    }

    // 49. Descomposición de tres cifras
    public static void ejercicio49() {
        int numero = 748;
        int centenas = numero / 100;
        int decenas = (numero % 100) / 10;
        int unidades = numero % 10;
        int sumaCifras = centenas + decenas + unidades;
        System.out.println("Centenas: " + centenas);
        System.out.println("Decenas: " + decenas);
        System.out.println("Unidades: " + unidades);
        System.out.println("Suma de cifras: " + sumaCifras);
    }

    // 50. Problema integrador
    public static void ejercicio50() {
        int unidades = 300;
        double costoCadaUna = 16.80;
        
        double costoTotal = unidades * costoCadaUna;
        double ganancia = costoTotal * 0.30; // 30% ganancia
        double valorVenta = costoTotal + ganancia;
        double igv = valorVenta * 0.18; // 18% IGV
        double precioTotal = valorVenta + igv;
        double precioPorUnidad = precioTotal / unidades;
        
        System.out.println("Costo Total: S/ " + costoTotal);
        System.out.println("Ganancia: S/ " + ganancia);
        System.out.println("Valor de Venta: S/ " + valorVenta);
        System.out.println("IGV: S/ " + igv);
        System.out.println("Precio Total: S/ " + precioTotal);
        System.out.println("Precio por Unidad: S/ " + precioPorUnidad);
    }
}