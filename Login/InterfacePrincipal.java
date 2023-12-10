package Login;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Doacoes.InterfaceDoacao;
import Exames.InterfacePreTriagem;

public class InterfacePrincipal extends JFrame {
    private JButton botaoPreTriagem;
    private JButton botaoHistorico;
    private JButton botaoPerfilDoador;
    private JButton botaoDoacao;
    private JButton botaoHospital;
    private JButton botaoPaciente;
    private JButton botaoPesquisa;
    private JButton botaoAlterarDadosUsuario; // Adicionando o botão aqui


    public InterfacePrincipal() {
        super("Sistema de doação de sangue");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 0.5;

        botaoAlterarDadosUsuario = new JButton("Alterar Dados do Usuário");
        constraints.gridx = 0;
        constraints.gridy = 3;
        painel.add(botaoAlterarDadosUsuario, constraints);

        botaoPreTriagem = new JButton("Pré-Triagem");
        constraints.gridx = 1;
        painel.add(botaoPreTriagem, constraints);

        botaoHistorico = new JButton("Histórico");
        constraints.gridx = 0;
        constraints.gridy = 1;
        painel.add(botaoHistorico, constraints);

        botaoPerfilDoador = new JButton("Perfil doador");
        constraints.gridx = 1;
        painel.add(botaoPerfilDoador, constraints);

        botaoDoacao = new JButton("Doação");
        constraints.gridx = 0;
        constraints.gridy = 2;
        painel.add(botaoDoacao, constraints);

        botaoHospital = new JButton("Hospital");
        constraints.gridx = 1;
        painel.add(botaoHospital, constraints);

        botaoPaciente = new JButton("Paciente");
        constraints.gridx = 0;
        constraints.gridy = 3;
        painel.add(botaoPaciente, constraints);

        botaoPesquisa = new JButton("Pesquisa de perfis");
        constraints.gridx = 1;
        painel.add(botaoPesquisa, constraints);


    

        add(painel);
        setVisible(true);

        botaoDoacao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new InterfaceDoacao();
            }
        });

        botaoPreTriagem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new InterfacePreTriagem();
            }
        });

        botaoAlterarDadosUsuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Chame o método para alterar os dados do usuário
                alterarDadosUsuario();
            }
        });
    }

    private void alterarDadosUsuario() {
        
        new InterfaceAlterarDadosUsuario();
    

    }
    public static void main(String[] args) {
        new InterfacePrincipal();
    }
}