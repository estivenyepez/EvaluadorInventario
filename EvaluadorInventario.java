import java.util.Scanner;

public class EvaluadorInventario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuantos productos ingresaran al lote?: ");
        int cantidadProductos = scanner.nextInt();

       
        double acumuladorCostos = 0;
        int contadorCategoriaAlta = 0;

        
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println("\n--- Producto " + (i + 1) + " ---");
            System.out.print("Ingrese el nombre del producto: ");
            scanner.nextLine(); 
            String nombreProducto = scanner.nextLine();

            System.out.print("Ingrese el costo base del producto: ");
            double costoBase = scanner.nextDouble();

            
            if (costoBase < 10000) {
                System.out.println("Alerta: Categoria baja");
            } else if (costoBase >= 10000 && costoBase <= 50000) {
                System.out.println("Alerta: Categoria media");
            } else if (costoBase > 50000) {
                System.out.println("Alerta: Categoria alta");
                contadorCategoriaAlta++; 
            }

           
            acumuladorCostos += costoBase;
        }

        double costoPromedio = 0;
        if (cantidadProductos > 0) {
            costoPromedio = acumuladorCostos / cantidadProductos;
        }

       4
        System.out.println("\n========================================");
        System.out.println("        REPORTE FINAL DE AUDITORÍA      ");
        System.out.println("========================================");
        System.out.println("Costo promedio del lote: $" + costoPromedio);
        System.out.println("Total de productos en categoría alta: " + contadorCategoriaAlta);
        System.out.println("========================================");

        scanner.close();
    }
}