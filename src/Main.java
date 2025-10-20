import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            Videojuego vj1 = new Videojuego();
            Videojuego vj2 = new Videojuego();
            Videojuego vj3 = new Videojuego();
            Videojuego vj4 = new Videojuego();

            String nombre;
            int opc, opc2, categoria, lic_disponibles, lic_vendidas;
            double precio, tamano;

            /**Inicializacion de cada una de los atributos de los 4 juegos, sin esto no se seguria al menu*/

        System.out.println("Inicialice los primeros 4 videjuegos para la tienda: ");

        System.out.println("Videjuego 1: ");
            vj1.IniciarVJ();

        System.out.println("Videjuego 2: ");
            vj2.IniciarVJ();

        System.out.println("Videjuego 3: ");
            vj3.IniciarVJ();

        System.out.println("Videjuego 4: ");
            vj4.IniciarVJ();

/**Menu con opciones del programa*/

        System.out.println("----Venta de Videojuegos----");
        System.out.println("1. Comprar licencias.");
        System.out.println("2. Vender licencias.");
        System.out.println("3. Consultar descuentos aplicados por un volumen de compra.");
        System.out.println("4. Visualizar informacion de cada juego.");
        System.out.println("5. Consultar juego mas vendido.");
        System.out.println("6. Salir");
            opc= sc.nextInt();

            switch (opc){
                case 1:
                    /**Debera escoger cual de los 4 juegos debe modificar*/

                    System.out.println("Ingrese el juego al que va a comprar las licencias");
                        System.out.println("" + vj1.getNombre());
                        System.out.println("" + vj2.getNombre());
                        System.out.println("" + vj3.getNombre());
                        System.out.println("" + vj4.getNombre());
                            opc2 = sc.nextInt();
                            switch (opc2) {

                                case 1:

                                    vj1.ComprarLicencias();
                                    break;

                                case 2:
                                    vj2.ComprarLicencias();
                                    break;
                                case 3:
                                    vj3.ComprarLicencias();
                                    break;
                                case 4:
                                    vj4.ComprarLicencias();
                                    break;
                            }

                case 2:
                    /**Debera escoger cual de los 4 juegos debe modificar*/
                    System.out.println("Ingrese el juego al que va a vender las licencias");
                        System.out.println("" + vj1.getNombre());
                        System.out.println("" + vj2.getNombre());
                        System.out.println("" + vj3.getNombre());
                        System.out.println("" + vj4.getNombre());
                        opc2 = sc.nextInt();

                    switch (opc2) {

                        case 1:
                            vj1.VenderLicencias();
                            break;
                        case 2:
                            vj2.VenderLicencias();
                            break;
                        case 3:
                            vj3.VenderLicencias();
                            break;
                        case 4:
                            vj4.VenderLicencias();
                            break;

                    }
                case 4:

                    System.out.println("Videjuego 1: ");
                    System.out.println("Nombre" + vj1.getNombre());
                    System.out.println("Categoria: " + vj1.CategoriaJG());
                    System.out.println("Precio: " + vj1.getPrecio());
                    System.out.println("Tamano: " + vj1.getTamano());
                    System.out.println("Licencias disponibles: " + vj1.getLic_disponibles());
                    System.out.println("Licencias Vendidas: " + vj1.getLic_vendidas());

                    System.out.println("Videjuego 2: ");
                    System.out.println("Nombre" + vj2.getNombre());
                    System.out.println("Categoria: " + vj2.CategoriaJG());
                    System.out.println("Precio: " + vj2.getPrecio());
                    System.out.println("Tamano: " + vj2.getTamano());
                    System.out.println("Licencias disponibles: " + vj2.getLic_disponibles());
                    System.out.println("Licencias Vendidas: " + vj2.getLic_vendidas());

                    System.out.println("Videjuego 3: ");
                    System.out.println("Nombre" + vj3.getNombre());
                    System.out.println("Categoria: " + vj3.CategoriaJG());
                    System.out.println("Precio: " + vj3.getPrecio());
                    System.out.println("Tamano: " + vj3.getTamano());
                    System.out.println("Licencias disponibles: " + vj3.getLic_disponibles());
                    System.out.println("Licencias Vendidas: " + vj3.getLic_vendidas());

                    System.out.println("Videjuego 4: ");
                    System.out.println("Nombre" + vj4.getNombre());
                    System.out.println("Categoria: " + vj4.CategoriaJG());
                    System.out.println("Precio: " + vj4.getPrecio());
                    System.out.println("Tamano: " + vj4.getTamano());
                    System.out.println("Licencias disponibles: " + vj4.getLic_disponibles());
                    System.out.println("Licencias Vendidas: " + vj4.getLic_vendidas());

                    break;




            }

    }
}