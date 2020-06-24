package composite;

public class Computadora1 extends Computadora {




    @Override
    public int precioTotal() {
        System.out.println("Precio" + getPrecio());
        return this.getPrecio();
    }

    @Override
    public void add(Computadora computadora) {
        System.out.println("Not Applicable");
    }

    @Override
    public void remove(Computadora computadora) {
        System.out.println("Not Applicable");
    }

    @Override
    public void getChild(int position) {
        System.out.println("Not Applicable");
    }
}
