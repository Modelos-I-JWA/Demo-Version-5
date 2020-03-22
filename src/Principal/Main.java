package Principal;


import Builder.Builder;
import Builder.ConstructorElfo;
import Builder.ConstructorHumano;
import Builder.ConstructorOrco;
import Vista.SeleccionPersonajes;
import Vista.Vista1;


public class Main {

	public static void main (String[]ARG) {
        SeleccionPersonajes ventana = new SeleccionPersonajes();
        ventana.setVisible(true);
	}
}
