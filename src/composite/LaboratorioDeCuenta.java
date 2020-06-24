package composite;

import java.util.ArrayList;
import java.util.List;

public class LaboratorioDeCuenta extends Computadora {

    private List<Computadora> list = new ArrayList<>();
    private int precioTotal =0;


    @Override
    public int precioTotal() {

        for (Computadora componente:list ) {
            precioTotal = precioTotal +componente.precioTotal();
        }
        System.out.println(" Precio Total : " + precioTotal);
        return precioTotal;
    }

    @Override
    public void add(Computadora computadora) {
        list.add(computadora);

    }

    @Override
    public void remove(Computadora computadora) {
        list.remove(computadora);
    }

    @Override
    public void getChild(int position) {
        System.out.println(list.get(position).getPrecio());
    }
}
