import java.util.Scanner;

public class Videojuego {

    private String nombre;
    private Integer categoria;
    private Double tamano;
    private Double precio;
    private Integer lic_disponibles;
    private Integer lic_vendidas;

    Scanner sc = new Scanner(System.in);


    public Videojuego() {
    }

    public Videojuego(String nombre, Integer categoria, Double tamano, Double precio, Integer lic_disponibles, Integer lic_vendidas) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.tamano = tamano;
        this.precio = precio;
        this.lic_disponibles = lic_disponibles;
        this.lic_vendidas = lic_vendidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }

    public Double getTamano() {
        return tamano;
    }

    public void setTamano(Double tamano) {
        this.tamano = tamano;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getLic_disponibles() {
        return lic_disponibles;
    }

    public void setLic_disponibles(Integer lic_disponibles) {
        this.lic_disponibles = lic_disponibles;
    }

    public Integer getLic_vendidas() {
        return lic_vendidas;
    }

    public void setLic_vendidas(Integer lic_vendidas) {
        this.lic_vendidas = lic_vendidas;
    }

    public void IniciarVJ(){
        String Nnombre;
        int Ncategoria;

        System.out.println("Nombre: ");
        Nnombre = sc.nextLine();
        this.nombre=Nnombre;

        System.out.println("Categorias");
        System.out.println("1. Rompecabezas");
        System.out.println("2. Accion");
        System.out.println("3. Deportes");
        Ncategoria = sc.nextInt();
        this.categoria=Ncategoria;

        System.out.println("Defina el tamano en KB: ");
        Double Ntamano=sc.nextDouble();
        this.tamano = Ntamano;

        System.out.println("Defina el precio del juego: ");
        Double Nprecio=sc.nextDouble();
        this.precio = Nprecio;

        System.out.println("Defina la cantidad de licencias disponibles: ");
        int Nlic_disponibles=sc.nextInt();
        this.lic_disponibles=Nlic_disponibles;
    }


    public void ComprarLicencias(){

        int nLic;
        System.out.println("Ingrese la cantidad de licencias a comprar: ");
        nLic = sc.nextInt();
        this.lic_disponibles+=nLic;
    }

    public void VenderLicencias() {
        int nLic;
        System.out.println("Ingrese la cantidad de licencias a vender: ");
        nLic = sc.nextInt();
        this.lic_disponibles-=nLic;
        this.lic_vendidas+=nLic;
    }

    public String CategoriaJG(){
        if(this.categoria==1){
            return "Rompecabezas";
        }
        if(this.categoria==2){
            return "Accion";
        }
        if(this.categoria==3){
            return "Deportes";
        }
        return "NADA";
    }
}
