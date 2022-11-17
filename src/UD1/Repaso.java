/*

FIFO - EN FUNCIÓN DEL TIEMPO DE LLEGADA
LIFO - ULTIMO EN ENTRAR, PRIMERO EN SALIR
SJF - PRIMERO TRABAJO MAS CORTO, EN FUNCIÓN DEL TIEMPO DE LLEGADA
ROUND-ROBIN X - TIEMPO LIMITADO A (X).

CALCULADORA
public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        LanzarCalculadoraPB calc = new LanzarCalculadoraPB();

        int opcion = calc.menu();
        System.out.print("Numero 1: ");
        int num1 = Integer.parseInt(br.readLine());
        System.out.print("Numero 2: ");
        int num2 = Integer.parseInt(br.readLine());

        String clase = "Calculadora.java";
        File carpeta = new File("C:\\Users\\Alvaro\\Documents\\NetBeansProjects\\ServiciosYProcesos\\src\\UD1\\");

        ProcessBuilder pb;
        try {
            pb = new ProcessBuilder("java",
                    clase,
                    Integer.toString(opcion),
                    Integer.toString(num1),
                    Integer.toString(num2));
            pb.directory(carpeta);
            pb.redirectError(new File("errores.txt"));
            pb.redirectOutput(new File("Resultado.txt"));
            pb.start();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

FICHEROS
public static void lanzarProceso(String ruta, String nombreFichero) {
        String clase = "Ejercicio2.java";

        File carpeta = new File("C:\\Users\\Alvaro\\Documents\\NetBeansProjects\\ServiciosYProcesos\\src\\UD1");

        ProcessBuilder pb;

        try {
            pb = new ProcessBuilder("java",
                    clase,
                    ruta);
            pb.directory(carpeta);
            pb.redirectError(new File("erroresEjercicio2.txt"));
            pb.redirectOutput(new File(nombreFichero));
            pb.start();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

public static void leerFicheros(String ruta) {
        File carpeta = new File(ruta);

        String[] ficheros = carpeta.list();

        if (ficheros.length == 0) {
            System.out.println("Este fichero está vacio.");
            System.exit(0);
        } else {
            for (int i = 0; i < ficheros.length; i++) {
                if (ficheros[i].contains(".txt")) {
                    try {
                        archivo = new File(ruta + "\\" + ficheros[i]);
                        fr = new FileReader(archivo);
                        br = new BufferedReader(fr);

                        String linea;

                        while ((linea = br.readLine()) != null) {
                            suma = suma + Integer.parseInt(linea);
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    } finally {
                        try {
                            if (null != fr) {
                                fr.close();
                            }
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        String ruta = args[0];

        leerFicheros(ruta);

        System.out.println("La suma de todos los ficheros es: " + suma);
    }

MOSTRAR TEXTO Y ESCRIBIR
public static String leerTexto() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Inserta cadena de texto: ");
        String texto = br.readLine();
        return texto;
    }

    public static int menu() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean bandera = true;
        int opcion = 0;
        do {
            System.out.println("**********************************");
            System.out.println("************** MENU **************");
            System.out.println("**********************************");
            System.out.println("******* 1. INTRODUCIR TEXTO ******");
            System.out.println("* 2. MOSTRAR CARACTER A CARACTER *");
            System.out.println("************ 3. SALIR ************");
            System.out.println("**********************************");
            System.out.print("Elige una opcion: ");
            opcion = Integer.parseInt(br.readLine());
            if (opcion >= 1 && opcion <= 4) {
                bandera = false;
            } else {
                bandera = true;
            }
        } while (bandera != false);

        return opcion;
    }

    public static void lanzarProceso(int opcion, String txt, String nombreFichero) throws IOException {
        String clase = "EjercicioRepaso.java";
        File carpeta = new File("C:\\Users\\Alvaro\\Documents\\NetBeansProjects\\ServiciosYProcesos\\src\\UD1");

        ProcessBuilder pb;
        try {
            pb = new ProcessBuilder("java",
                    clase,
                    Integer.toString(opcion),
                    txt);
            pb.directory(carpeta);
            pb.redirectError(new File("errores.txt"));
            pb.redirectOutput(new File(nombreFichero));
            
            pb.start();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        int opcion = 0;
        String texto = "";

        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    texto = leerTexto();
                    opcion = 0;
                    break;
                case 2:
                    if (texto.equals("")) {
                        System.out.println("No existe texto.");
                        opcion = 0;
                    } else {
                        lanzarProceso(opcion, texto, "resultado.txt");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Saliendo...");
                    break;
            }
        } while (opcion == 0);
    }

public static void recorrerTexto(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            System.out.println("Letra " + (i + 1) + ": " + texto.substring(i, (i + 1)));
        }
    }
    
    public static void main(String[] args) {
        String opcion = args[0];
        String texto = args[1];
        
        if (texto.equals("")){
            System.out.println("No existe texto.");
        }else{
            recorrerTexto(texto);
        }
    }

*/
