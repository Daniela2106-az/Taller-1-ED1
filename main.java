import java.util.ArrayList;
import java.util.Scanner;

public class VentasTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ventas = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Crear nueva venta");
            System.out.println("2. Listar ventas");
            System.out.println("3. Buscar por ID");
            System.out.println("4. Modificar venta");
            System.out.println("5. Eliminar venta");
            System.out.println("6. Calcular ingreso total");
            System.out.println("7. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> {
                    System.out.print("ID: ");
                    String id = scanner.nextLine();

                    System.out.print("Producto: ");
                    String producto = scanner.nextLine();

                    System.out.print("Cantidad: ");
                    String cantidad = scanner.nextLine();

                    System.out.print("Precio unitario: ");
                    String precio = scanner.nextLine();

                    String venta = id + "," + producto + "," + cantidad + "," + precio;
                    ventas.add(venta);
                    System.out.println("Venta guardada.");
                }

                case 2 -> {
                    if (ventas.isEmpty()) {
                        System.out.println("No hay ventas.");
                    } else {
                        for (String v : ventas) {
                            String[] datos = v.split(",");
                            System.out.println("ID: " + datos[0] +
                                    ", Producto: " + datos[1] +
                                    ", Cantidad: " + datos[2] +
                                    ", Precio Unitario: $" + datos[3]);
                        }
                    }
                }

                case 3 -> {
                    System.out.print("Buscar ID: ");
                    String idBuscado = scanner.nextLine();
                    boolean encontrado = false;

                    for (String v : ventas) {
                        String[] datos = v.split(",");
                        if (datos[0].equals(idBuscado)) {
                            System.out.println("ID: " + datos[0] +
                                    ", Producto: " + datos[1] +
                                    ", Cantidad: " + datos[2] +
                                    ", Precio Unitario: $" + datos[3]);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Venta no encontrada.");
                    }
                }

                case 4 -> {
                    System.out.print("ID de venta a modificar: ");
                    String idMod = scanner.nextLine();
                    boolean modificado = false;

                    for (int i = 0; i < ventas.size(); i++) {
                        String[] datos = ventas.get(i).split(",");
                        if (datos[0].equals(idMod)) {
                            System.out.print("Nuevo producto: ");
                            String nuevoProd = scanner.nextLine();

                            System.out.print("Nueva cantidad: ");
                            String nuevaCant = scanner.nextLine();

                            System.out.print("Nuevo precio: ");
                            String nuevoPrecio = scanner.nextLine();

                            String nuevaVenta = idMod + "," + nuevoProd + "," + nuevaCant + "," + nuevoPrecio;
                            ventas.set(i, nuevaVenta);
                            modificado = true;
                            System.out.println("Venta modificada.");
                            break;
                        }
                    }
                    if (!modificado) {
                        System.out.println("Venta no encontrada.");
                    }
                }

                case 5 -> {
                    System.out.print("ID de venta a eliminar: ");
                    String idDel = scanner.nextLine();
                    boolean eliminado = false;

                    for (int i = 0; i < ventas.size(); i++) {
                        String[] datos = ventas.get(i).split(",");
                        if (datos[0].equals(idDel)) {
                            ventas.remove(i);
                            eliminado = true;
                            System.out.println("Venta eliminada.");
                            break;
                        }
                    }
                    if (!eliminado) {
                        System.out.println("Venta no encontrada.");
                    }
                }

                case 6 -> {
                    double total = 0;
                    for (String v : ventas) {
                        String[] datos = v.split(",");
                        int cantidad = Integer.parseInt(datos[2]);
                        double precio = Double.parseDouble(datos[3]);
                        total += cantidad * precio;
                    }
                    System.out.println("Ingreso total: $" + total);
                }

                case 7 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }

        } while (opcion != 7);
    }
}
