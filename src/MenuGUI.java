import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuGUI extends JFrame {
    public MenuGUI() {
        // Configurações da janela
        setTitle("Menu do Restaurante");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        // Botão Sanduíche
        JButton btnSanduiche = new JButton("Sanduíche");
        btnSanduiche.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MenuGUI.this, "Você pegou um sanduíche");
            }
        });

        // Botão Pizza
        JButton btnPizza = new JButton("Pizza");
        btnPizza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MenuGUI.this, "Você pegou uma pizza");
            }
        });

        // Botão Sorvete
        JButton btnSorvete = new JButton("Sorvete");
        btnSorvete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MenuGUI.this, "Você pegou um sorvete");
            }
        });

        // Botão Sair
        JButton btnSair = new JButton("Sair");
        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MenuGUI.this, "Saindo do sistema...");
                System.exit(0); // Fecha o aplicativo
            }
        });

        // Adiciona os botões à janela
        add(btnSanduiche);
        add(btnPizza);
        add(btnSorvete);
        add(btnSair);
    }

    public static void main(String[] args) {
        // Cria e exibe a GUI na thread de eventos do Swing
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuGUI().setVisible(true);
            }
        });
    }
}
