package br.sc.senac.perfil.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



    public class SystemView extends JFrame {

        JPanel pnlSystemView =  new JPanel();
        JMenuBar menuBar = new JMenuBar();
        public SystemView(){

            initComponents();
            initMenuBar();
            listener();
        }
        public void initComponents(){
            setTitle("Tela de sistema");
            setSize(1280,800);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setContentPane(pnlSystemView);
            setVisible(true);
            pnlSystemView.setLayout(null);
            setJMenuBar(menuBar);
        }
        public void initMenuBar() {
            JMenu cadastrosMenu = new JMenu("Cadastrar Pessoa");
            JMenu pesquisarMenu = new JMenu("Fazer o teste");
            JMenu sairMenu = new JMenu("Sair");

            JMenuItem cadastrarItem = new JMenuItem("Cadastrar Pessoa");
            JMenuItem testarItem = new JMenuItem("Fazer o teste");
            JMenuItem sairItem = new JMenuItem("Sair");

            cadastrosMenu.add(cadastrarItem);
            pesquisarMenu.add(testarItem);
            sairMenu.add(sairItem);


            menuBar.add(cadastrosMenu);
            menuBar.add(pesquisarMenu);
            menuBar.add(sairMenu);

            cadastrarItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    new PerfilView();
                    dispose();
                }
            });

            cadastrarItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    new QuestionarioView();
                    dispose();
                }
            });
            sairItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String msg = "Deseja sair do sistema?";
                    int opcaoEscolhida = JOptionPane.showConfirmDialog(null, msg, "Sistema", JOptionPane.YES_NO_OPTION);
                    if (opcaoEscolhida == JOptionPane.YES_OPTION) {
                        System.exit(0);
                    }

                }
            });
        }
        public void listener(){

            ImageIcon addUser =  new ImageIcon("C:\\Users\\luana.santos15\\IdeaProjects\\PerfilAluno\\src\\br\\sc\\senac\\perfil\\img\\cadastrar");
            JButton btnCadastrar = new JButton("Cadastrar Pessoa", addUser);
            btnCadastrar.setBounds(450,300,150, 100);
            pnlSystemView.add(btnCadastrar);

            btnCadastrar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    PerfilView perfilView = new PerfilView();
                    dispose();
                }
            });
            ImageIcon searchUser =  new ImageIcon("C:\\Users\\luana.santos15\\IdeaProjects\\PerfilAluno\\src\\br\\sc\\senac\\perfil\\img\\testar");
            JButton btnTestar = new JButton("Fazer o teste", searchUser);
            btnTestar.setBounds(650,300,150, 100);
            pnlSystemView.add(btnTestar);

            btnCadastrar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    QuestionarioView questionarioView = new QuestionarioView();
                    dispose();
                }
            });
        }



        public static void main(String[] args) {
            SystemView sw = new SystemView();
        }
    }


