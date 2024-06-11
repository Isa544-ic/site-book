import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class zaza {
    private JButton CadastrarButton;
    private JPanel panel1;
    private JTextField usuarioTextField;
    private JButton EntrarButton;
    private JFormattedTextField formattedTextField1;
    private JTextField senhaTextField;
    private JPasswordField PasswordField;

    public static void main(String[] args) {
        //import javax.swing*;
//import java.awt.event.*;

        public class TelaZaza extends JFrame {
            public zaza.() {
                super("zaza2.java");
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JPanel panel = new JPanel();
                JButton cadastrarButton = new JButton("Cadastrar");
                cadastrarButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Ao clicar no botão, vamos abrir a tela zaza3
                        dispose(); // fecha a tela atual
                        new zaza2.().setVisible(true); // abre a tela zaza2
                    }
                });

                panel.add(cadastrarButton);
                getContentPane().add(panel);

                pack();
                setLocationRelativeTo(null);
            }

            public static void main(String[] args) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        new TelaZaza().setVisible(true);
                    }
                });
            }
        }

        class TelaZaza3 extends JFrame {
            public TelaZaza3() {
                super("zaza2.java");
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JLabel label = new JLabel("Você está na tela zaza2!");
                getContentPane().add(label);

                pack();
                setLocationRelativeTo(null);
            }
        }
    }