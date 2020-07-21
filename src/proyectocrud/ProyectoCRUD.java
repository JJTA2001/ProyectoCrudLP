package proyectocrud;

import Utils.leer;

/*
Estudiante:
Codigo de estudiante
Nombres
Apellidos
Edad
Carrera
Telefono
*/

public class ProyectoCRUD {
    public static String Codigo[] = new String[1000];
    public static String Nombre[] = new String[1000];
    public static String Apellido[] = new String[1000];
    public static int Edad[] = new int[1000];
    public static String Carrera[] = new String[1000];
    public static String Telefono[] = new String[1000];
    public static int posicion=-1;
    public static void error(){
        System.out.println("Opcion Invalida");
    }
    public static void salir(){
        System.out.println("Muchas Gracias por utilizar el programa.");
    }
    public static void agregarestudiante(){
        String continuar;
        do {
            posicion++;
            System.out.println("Agregar Estudiante");
            System.out.println("Codigo de estudiante: ");
            Codigo[posicion] = leer.cadena();
            System.out.println("Nombres: ");
            Nombre[posicion] = leer.cadena();
            System.out.println("Apellidos: ");
            Apellido[posicion]= leer.cadena();
            System.out.println("Edad: ");
            Edad[posicion] = leer.entero();
            System.out.println("Carrera: ");
            Carrera[posicion] = leer.cadena();
            System.out.println("Telefono: ");
            Telefono[posicion] = leer.cadena();
            System.out.println("Deseas agregar otro[S/N]: ");
            continuar = leer.cadena();
        } while (continuar.equalsIgnoreCase("S"));            
    }
    public static void eliminarestudiante(){
            String continuar;
        do {
            listarestudiante();
            System.out.println("Ingrese el numero del estudiante a eliminar: ");
            int numero = leer.entero();
            numero--;
            for (int i = numero; i < posicion; i++) {
               Codigo[i] = Codigo[i+1];
               Nombre[i] = Nombre[i+1];
               Apellido[i] = Apellido[i+1];
               Edad[i] = Edad[i+1];
               Carrera[i] = Carrera[i+1];
               Telefono[i] = Telefono[i+1];
            }
               Codigo[posicion] = "";
               Nombre[posicion] = "";
               Apellido[posicion] = "";
               Edad[posicion] = 0;
               Carrera[posicion] = "";
               Telefono[posicion] = "";
               posicion--;   
            System.out.println("Desea eliminar otro[S/N]: ");
            continuar = leer.cadena();
        } while (continuar.equalsIgnoreCase("S"));
        
    }
    public static void listarestudiante(){
        System.out.println("Listado");
        System.out.println("N°\t\tCodigo\t\tNombres\t\tApellidos\tEdad\t\tCarrera\t\tTelefono");
        for (int i = 0; i <= posicion; i++) {
            System.out.println((i+1)+"\t\t"+Codigo[i]+"\t\t"+Nombre[i]+"\t\t"+Apellido[i]+"\t\t"+Edad[i]+"\t\t"+Carrera[i]+"\t\t"+Telefono[i]);
        }        
    }
    public static void actualizarestudiante(){
        String continuar;
        do {
            listarestudiante();
            System.out.println("Ingrese el numero de la persona a editar: ");
            int numero = leer.entero();
            numero --;
            System.out.println("Resultado: "+Codigo[numero]+" - "+ Nombre[numero] +" - "+ Apellido[numero]+" - "+Edad[numero]+" - "+Carrera[numero]+" - "+Telefono[numero]);
            System.out.print("Nuevo Codigo: ");
            Codigo[numero] = leer.cadena();
            System.out.print("Nuevos Nombres: ");  
            Nombre[numero] = leer.cadena();
            System.out.print("Nuevos Apellidos: ");
            Apellido[numero] = leer.cadena();
            System.out.print("Nueva Edad: ");
            Edad[numero] = leer.entero();            
            System.out.print("Nueva Carrera: ");
            Carrera[numero] = leer.cadena();           
            System.out.print("Nuevo Telefono: ");
            Telefono[numero] = leer.cadena();
            System.out.println("Desea editar a otra persona[S/N]: ");
            continuar = leer.cadena();
        } while (continuar.equalsIgnoreCase("S"));        
    }
    public static void inicio(){
        int opcion;
        do {
            menu();
            opcion = leer.entero();
            switch(opcion){
                case 1: agregarestudiante();
                break;
                case 2: eliminarestudiante();
                break;
                case 3: actualizarestudiante();
                break;
                case 4: listarestudiante();
                break;
                case 5: salir();
                break;
                default: error();
                break;
            }
        } while (opcion != 5);
        
    }
    public static void menu(){
        System.out.println("MENU PRINCIPAL");
        System.out.println("1. Agregar Datos: ");
        System.out.println("2. Eliminar Datos: ");
        System.out.println("3. Actualizar Datos");
        System.out.println("4. Listar Datos ");
        System.out.println("5. Salir");
        System.out.println("Elija una opcion: ");
    }

    public static void main(String[] args) {
        inicio();
    }
    
}
