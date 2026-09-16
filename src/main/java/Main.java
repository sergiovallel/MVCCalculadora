import vista.Vista;
import modelo.Modelo;
import controlador.Controlador;

public class Main {
    public static void main(String[] args){
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista, modelo);
        //Para hacer visible la ventana al usuario.
        vista.setVisible(true);

    }
}
