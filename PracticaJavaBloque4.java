public class PracticaJavaBloque4 {

    public static void main(String[] args) {
        System.out.println("--- EJERCICIO 31 ---");
        ejercicio31();
        
        System.out.println("\n--- EJERCICIO 32 ---");
        ejercicio32();
        
        System.out.println("\n--- EJERCICIO 33 ---");
        ejercicio33();
        
        System.out.println("\n--- EJERCICIO 34 ---");
        ejercicio34();
        
        System.out.println("\n--- EJERCICIO 35 ---");
        ejercicio35();
        
        System.out.println("\n--- EJERCICIO 36 ---");
        ejercicio36();
        
        System.out.println("\n--- EJERCICIO 37 ---");
        ejercicio37();
        
        System.out.println("\n--- EJERCICIO 38 ---");
        ejercicio38();
        
        System.out.println("\n--- EJERCICIO 39 ---");
        ejercicio39();
        
        System.out.println("\n--- EJERCICIO 40 ---");
        ejercicio40();
    }

    // 31. Sueldo semanal
    public static void ejercicio31() {
        double pagoPorHora = 22.50;
        int horasTrabajadas = 44;
        double sueldo = pagoPorHora * horasTrabajadas;
        System.out.println("Sueldo semanal: S/ " + sueldo);
    }

    // 32. Importe de una compra
    public static void ejercicio32() {
        int cuadernos = 18;
        double precioCadaUno = 7.80;
        double importeTotal = cuadernos * precioCadaUno;
        System.out.println("Importe total: S/ " + importeTotal);
    }

    // 33. Descuento comercial
    public static void ejercicio33() {
        double precio = 1200.0;
        double descuentoPorcentaje = 0.15; // 15%
        double descuento = precio * descuentoPorcentaje;
        double precioFinal = precio - descuento;
        System.out.println("Descuento: S/ " + descuento);
        System.out.println("Precio final: S/ " + precioFinal);
    }

    // 34. Precio con IGV
    public static void ejercicio34() {
        double valorDeVenta = 850.0;
        double igvPorcentaje = 0.18; // 18%
        double igv = valorDeVenta * igvPorcentaje;
        double precioTotal = valorDeVenta + igv;
        System.out.println("IGV: S/ " + igv);
        System.out.println("Precio total: S/ " + precioTotal);
    }

    // 35. Descuento e IGV
    public static void ejercicio35() {
        double precio = 1600.0;
        double descuento = precio * 0.10; // 10%
        double precioConDescuento = precio - descuento;
        double igv = precioConDescuento * 0.18; // 18%
        double precioFinal = precioConDescuento + igv;
        System.out.println("Precio con descuento: S/ " + precioConDescuento);
        System.out.println("IGV aplicado: S/ " + igv);
        System.out.println("Precio final: S/ " + precioFinal);
    }

    // 36. Comisión de venta
    public static void ejercicio36() {
        double venta = 12500.0;
        double sueldoBase = 1400.0;
        double comision = venta * 0.06; // 6%
        double ingresoTotal = sueldoBase + comision;
        System.out.println("Comisión: S/ " + comision);
        System.out.println("Ingreso total: S/ " + ingresoTotal);
    }

    // 37. Interés simple
    public static void ejercicio37() {
        double capital = 5000.0;
        double tasaAnual = 0.08; // 8%
        int tiempo = 3;
        double interes = capital * tasaAnual * tiempo;
        double monto = capital + interes;
        System.out.println("Interés generado: S/ " + interes);
        System.out.println("Monto total (M): S/ " + monto);
    }

    // 38. Reparto porcentual
    public static void ejercicio38() {
        double total = 9000.0;
        double p1 = total * 0.40; // 40%
        double p2 = total * 0.35; // 35%
        double p3 = total * 0.25; // 25%
        System.out.println("Cantidad Participante 1 (40%): S/ " + p1);
        System.out.println("Cantidad Participante 2 (35%): S/ " + p2);
        System.out.println("Cantidad Participante 3 (25%): S/ " + p3);
    }

    // 39. Costo de producción
    public static void ejercicio39() {
        int unidades = 250;
        double precioPorUnidad = 18.50;
        double costoTotal = unidades * precioPorUnidad;
        System.out.println("Costo total de producción: S/ " + costoTotal);
    }

    // 40. Precio de venta
    public static void ejercicio40() {
        double costoTotal = 4625.0;
        double ganancia = costoTotal * 0.25; // 25%
        double precioDeVenta = costoTotal + ganancia;
        System.out.println("Ganancia estimada: S/ " + ganancia);
        System.out.println("Precio de venta final: S/ " + precioDeVenta);
    }
}