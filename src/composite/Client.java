package composite;

public class Client {
    public static void main (String [] args){
        Computadora1 computadora1 = new Computadora1();
        Computadora1 computadora2 = new Computadora1();
        Computadora1 computadora3 = new Computadora1();



        LaboratorioDeCuenta laboratorioDeCuenta1 =new LaboratorioDeCuenta();
        laboratorioDeCuenta1.add(computadora1);
        laboratorioDeCuenta1.add(computadora2);
        laboratorioDeCuenta1.add(computadora3);

        LaboratorioDeCuenta laboratorioDeCuenta2  =new LaboratorioDeCuenta();
        laboratorioDeCuenta2.add(computadora1);
        laboratorioDeCuenta2.add(computadora2);
        laboratorioDeCuenta2.add(computadora3);

        LaboratorioDeCuenta laboratorioDeCuenta3 =new LaboratorioDeCuenta();
        laboratorioDeCuenta3.add(computadora1);
        laboratorioDeCuenta3.add(computadora2);
        laboratorioDeCuenta3.add(computadora3);

        LaboratorioDeCuenta ContenedorDeComputadoras = new LaboratorioDeCuenta();
        ContenedorDeComputadoras.add(laboratorioDeCuenta1);
        ContenedorDeComputadoras.add(laboratorioDeCuenta2);
        ContenedorDeComputadoras.add(laboratorioDeCuenta3);

        ContenedorDeComputadoras.precioTotal();
    }

}
