package composite;

abstract class Computadora {

    private int precio =100;



    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public abstract  int precioTotal();
    public abstract  void add(Computadora computadora);
    public abstract  void remove(Computadora computadora);
    public abstract  void getChild(int position);

}
