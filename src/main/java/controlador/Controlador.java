package controlador;

import vista.Vista;
import modelo.Modelo;
import java.awt.event.ActionEvent; //evento de hacer click en un boton.
import java.awt.event.ActionListener; //"Escucha" y resacciona a las acciones del usuario.
import javax.swing.JOptionPane; //Esto es para los cuadros de dialogo flotantes con mensajes de error.

// captura la interaccion con los botones de la vista.
public class Controlador implements ActionListener {

    private final Vista vista;
    private final Modelo modelo;

    public Controlador (Vista vista, Modelo modelo){

        this.vista = vista;
        this.modelo = modelo;

        this.vista.bSuma.addActionListener(this);
        this.vista.bResta.addActionListener(this);
        this.vista.bMulti.addActionListener(this);
        this.vista.bDivis.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        try {
            //Convierte el texto de las cajas a numero tipo double.
            double n1 = Double.parseDouble(vista.Num1.getText());
            double n2 = Double.parseDouble(vista.Num2.getText());
            double result = 0;

            //Llamar al metodo dependiendo de la operacion seleccionada:
            if (e.getSource() == vista.bSuma) {
                result = modelo.suma(n1, n2);
            } else if (e.getSource() == vista.bResta) {
                result = modelo.resta(n1, n2);
            } else if (e.getSource() == vista.bMulti) {
                result = modelo.multiplicacion(n1, n2);
            } else if (e.getSource() == vista.bDivis) {
                result = modelo.division(n1, n2);
            }
            vista.lblResultado.setText("R// " + result);
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vista, ex.getMessage(),"Ingrese solo numeros", JOptionPane.ERROR_MESSAGE);
        }catch (ArithmeticException ex){
            JOptionPane.showMessageDialog(vista, ex.getMessage(), "No se puede dividir entre Cero", JOptionPane.ERROR_MESSAGE);

        }

    }

}
