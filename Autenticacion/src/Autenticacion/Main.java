package Autenticacion;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main {

    public static void main(String[] args) {

        Registro frame = new Registro();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel tituloLabel = new JLabel("Nuevo Usuario");
        tituloLabel.setFont(new Font("Arial", Font.BOLD, 20));
        tituloLabel.setBounds(150, 10, 200, 30);
        frame.add(tituloLabel);

        JLabel usuarioLabel = new JLabel("Usuario:");
        usuarioLabel.setBounds(50, 50, 80, 20);
        frame.add(usuarioLabel);

        JTextField usuarioTextField = new JTextField();
        usuarioTextField.setBounds(150, 50, 150, 20);
        frame.add(usuarioTextField);

        JLabel correoLabel = new JLabel("Correo:");
        correoLabel.setBounds(50, 80, 80, 20);
        frame.add(correoLabel);

        JTextField correoTextField = new JTextField();
        correoTextField.setBounds(150, 80, 150, 20);
        frame.add(correoTextField);

        JLabel contrasenaLabel = new JLabel("Contraseña:");
        contrasenaLabel.setBounds(50, 110, 80, 20);
        frame.add(contrasenaLabel);

        JPasswordField contrasenaPasswordField = new JPasswordField();
        contrasenaPasswordField.setBounds(150, 110, 150, 20);
        frame.add(contrasenaPasswordField);

        JCheckBox aceptoCheckBox = new JCheckBox("Acepto términos y condiciones");
        aceptoCheckBox.setBounds(50, 140, 250, 20);
        frame.add(aceptoCheckBox);

        JButton cancelarButton = new JButton("Cancelar");
        cancelarButton.setBounds(50, 170, 100, 30);
        frame.add(cancelarButton);

        JButton aceptarButton = new JButton("Aceptar");
        aceptarButton.setBounds(160, 170, 100, 30);
        frame.add(aceptarButton);
    }
}

class Registro extends JFrame {
    public Registro() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();

        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        int posWidth = screenWidth / 2;
        int posHeight = screenHeight / 2;

        setBounds(200, 200, posWidth, posHeight);
        setLocationRelativeTo(null);
    }
}