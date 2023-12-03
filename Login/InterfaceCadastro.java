package Login;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class InterfaceCadastro extends JFrame {
    private JLabel labelNome;
    private JTextField campoNome;
    private JLabel labelTelefone;
    private JTextField campoTelefone;
    private JLabel labelEndereco;
    private JTextField campoEndereco;
    private JLabel labelCpf;
    private JTextField campoCpf;
    private JLabel labelTipoSanguineo;
    private JTextField campoTipoSanguineo;
    private JLabel labelEmail;
    private JTextField campoEmail;
    private JLabel labelSenha;
    private JPasswordField campoSenha;
    private JButton botaoCadastrar;

    private ArrayList<Usuario> usuariosCadastrados = new ArrayList<>();

    public InterfaceCadastro() {
        super("Cadastro de usuário");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 0.5;

        labelNome = new JLabel("Nome completo:");
        painel.add(labelNome, constraints);

        campoNome = new JTextField(20);
        constraints.gridx = 1;
        painel.add(campoNome, constraints);

        labelTelefone = new JLabel("Telefone:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        painel.add(labelTelefone, constraints);

        campoTelefone = new JTextField(20);
        constraints.gridx = 1;
        painel.add(campoTelefone, constraints);

        labelEndereco = new JLabel("Endereço:");
        constraints.gridx = 0;
        constraints.gridy = 2;
        painel.add(labelEndereco, constraints);

        campoEndereco = new JTextField(20);
        constraints.gridx = 1;
        painel.add(campoEndereco, constraints);

        labelCpf = new JLabel("CPF:");
        constraints.gridx = 0;
        constraints.gridy = 3;
        painel.add(labelCpf, constraints);

        campoCpf = new JTextField(20);
        constraints.gridx = 1;
        painel.add(campoCpf, constraints);

        labelTipoSanguineo = new JLabel("Tipo sanguíneo:");
        constraints.gridx = 0;
        constraints.gridy = 4;
        painel.add(labelTipoSanguineo, constraints);

        campoTipoSanguineo = new JTextField(20);
        constraints.gridx = 1;
        painel.add(campoTipoSanguineo, constraints);

        labelEmail = new JLabel("E-mail:");
        constraints.gridx = 0;
        constraints.gridy = 5;
        painel.add(labelEmail, constraints);

        campoEmail = new JTextField(20);
        constraints.gridx = 1;
        painel.add(campoEmail, constraints);

        labelSenha = new JLabel("Senha:");
        constraints.gridx = 0;
        constraints.gridy = 6;
        painel.add(labelSenha, constraints);

        campoSenha = new JPasswordField(20);
        constraints.gridx = 1;
        painel.add(campoSenha, constraints);

        botaoCadastrar = new JButton("Cadastrar");
        constraints.gridx = 0;
        constraints.gridy = 7;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.CENTER;
        painel.add(botaoCadastrar, constraints);

        add(painel);
        setVisible(true);

        botaoCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Usuario novoUsuario = new Usuario(
                        campoNome.getText(),
                        campoTelefone.getText(),
                        campoEndereco.getText(),
                        campoCpf.getText(),
                        campoTipoSanguineo.getText(),
                        campoEmail.getText(),
                        new String(campoSenha.getPassword()));

                usuariosCadastrados.add(novoUsuario);

                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");

                dispose();
                new InterfaceLogin(usuariosCadastrados);
            }
        });
        JButton botaoVoltar = new JButton("Voltar");
        constraints.gridx = 0;
        constraints.gridy = 8;
        constraints.gridwidth = 2;
        painel.add(botaoVoltar, constraints);

        botaoVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (usuariosCadastrados.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nenhum usuário cadastrado.");
                } else {

                    dispose();
                    InterfacePrincipal interfacePrincipal = new InterfacePrincipal();
                    interfacePrincipal.setVisible(true);
                }
            }
        });
    }

    public static void main(String[] args) {
        new InterfaceCadastro();
    }
}