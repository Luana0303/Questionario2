package br.sc.senac.perfil.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class PerfilView extends JFrame {
    private JPanel pnlPerfil;
    private JTextField txtnome;
    private JTextField txtnascimento;
    private JTextField txtcurso;
    private JButton btnenviar;
    private JTextField txtfase;

    public PerfilView() {
        initComponents();
        addListeners();
    }

    private void initComponents() {
        setTitle("Perfil de Usuário");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlPerfil);
        setVisible(true);
    }

    private void addListeners() {
        btnenviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtnome.setText("");
                txtcurso.setText("");
                txtnascimento.setText("");
                txtfase.setText("");

                try {


                } catch (SQLException ex) {
                    ex.printStackTrace();
                } catch (ClassNotFoundException ex) {
                    System.out.println("Classe não encontrada");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PerfilView();
            }
        });

    }
}
