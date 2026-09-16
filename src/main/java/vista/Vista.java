package vista;

//Importaciones para componentes graficos.
import javax.swing.*;
import java.awt.*;

//Se usa herencia de JFrame para obtener el comportamiento de ventana de escritorio.
public class Vista extends JFrame {

    //Ingreso de numeros por el usuario.
    public JTextField Num1 = new JTextField(10);
    public JTextField Num2 = new JTextField(10);
    public JLabel lblResultado = new JLabel("R//");

    //Botones para las operaciones.
    public JButton bSuma = new JButton("+");
    public JButton bResta = new JButton("-");
    public JButton bMulti = new JButton("X");
    public JButton bDivis = new JButton("/");

    public Vista(){
        setTitle("Mi Primer Calculadora");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2, 5, 5));

        add(new JLabel("Número 1:"));
        add(Num1);
        add(new JLabel("Número 2:"));
        add(Num2);

        add(bSuma);
        add(bResta);
        add(bMulti);
        add(bDivis);

        add(lblResultado);

    }

}
