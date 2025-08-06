import java.ArrayList;
import java.utilScanner;

public lass ventas {
    public static void main (string[]args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String>ventas = newArrayList <>();
        int opcion; 

        do{
            System.out.println ("\n --- Menu ---")
            System.out.println ("1. Crear nueva venta")
            System.out.println ("2. Listar ventas")
            System.out.println ("3. Buscar por ID")
            System.out.println ("4. Modificar venta")
            System.out.println ("5. Eliminar venta")
            System.out.println ("6. Calcular totales (Ingreso total)")
            System.out.println ("7. Salir")
            System.out.println ("8. Opcion:")
            opcion = scanner.nextInt();

            scanner.nextLine();

            switch(opcion); {
                case 1-> {
                    System.out.print ("ID:");
                    String id = scanner.nextLine ();

                    System.out.print ("Producto:")
                    String producto = scanner.nextLine();

                    System.out.print ("Cantidad:");
                    String cantidad = scanner.nextLine();

                    System.out.print ("Precio Unitario");
                    String precio = scanner.nextLine();

                    String venta = id + ","+producto+","+cantidad+","+precio;
                    ventas.add(venta);
                    System.out.println ("Venta guardada");
                }
                case 2-> {
                    if (ventas.isEmpty()){
                        System.out.print ("No hay ventas");
                    } else {
                        for (string v: ventas){
                            String[] datos= v.split(",");
                            System.out.print ("ID:"+datos[0]+", Producto:"+datos[1]+", Cantidad:"+datos[2]+", Precio Unitario: $"+datos[3]);
                        }
                    }
                }
                case 3-> {
                    System.out.print ("Buscar ID:");
                    String idBuscado = scanner.nextLine();
                    boolean encontrado=false;

                    for (String v : ventas);
                    String [] datos = v.split (",");
                    if (datos[0].equals(idBuscado)){
                        System.out.println("ID:"+datos[0]+", Producto:"+datos[1]+", Cantidad:"+datos[2]+(", Precio Unitario: $")+datos[3]);
                        encontrado = true;
                        break;
                        }
                    }
                    if (!encontrado){
                        System.out.println ("Venta no encontrada");
                    }                    ]
                    }
                case 4->{
                    System.out.print ("ID de venta a modificar");
                    String idMod = scanner.nextLine();
                    booleano modificado= false;

                    for (int i=0; i < ventas.size();i++){
                        String []datos = ventas.get(i),split(",");
                        if (datos[0].equls(idMod)){
                            System.out.print ("Nuevo producto:");
                            String nuevoProd = scanner.nextLine();
                            System.out.print ("Nueva cantidad:");
                            String nuevaCant = scanner.nextLine();
                            System.out.print ("Nuevo precio:");
                            String nuevoPrecio = scanner.nextLine ();
                            
                        }
                    }
                }    

                }

            }

        }
    }

}