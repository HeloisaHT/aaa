package Login;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class InterfaceLogin extends JFrame {
    private JLabel labelUsuario;
    private JTextField campoUsuario;
    private JLabel labelSenha;
    private JPasswordField campoSenha;
    private JButton botaoEntrar;
    private JButton botaoCadastrar;

    private static ArrayList<Usuario> usuariosCadastrados = new ArrayList<>();

    public InterfaceLogin(ArrayList<Usuario> usuariosCadastrados) {
        InterfaceLogin.usuariosCadastrados = usuariosCadastrados;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 0.5;

        labelUsuario = new JLabel("Usuário:");
        painel.add(labelUsuario, constraints);

        campoUsuario = new JTextField(20);
        constraints.gridx = 1;
        painel.add(campoUsuario, constraints);

        labelSenha = new JLabel("Senha:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        painel.add(labelSenha, constraints);

        campoSenha = new JPasswordField(20);
        constraints.gridx = 1;
        painel.add(campoSenha, constraints);

        botaoEntrar = new JButton("Entrar");
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.CENTER;
        painel.add(botaoEntrar, constraints);

        botaoCadastrar = new JButton("Cadastrar");
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.CENTER;
        painel.add(botaoCadastrar, constraints);

        botaoEntrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuarioInformado = campoUsuario.getText();
                String senhaInformada = new String(campoSenha.getPassword());

                boolean credenciaisValidas = false;
                for (Usuario usuario : usuariosCadastrados) {
                    if (usuario.getNome().equals(usuarioInformado) && usuario.getSenha().equals(senhaInformada)) {
                        credenciaisValidas = true;
                        break;
                    }
                }

                if (credenciaisValidas) {
                    JOptionPane.showMessageDialog(null, "Login bem-sucedido!");
                    dispose();
                    new InterfacePrincipal();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos. Tente novamente.");
                }
            }
        });

        botaoCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new InterfaceCadastro();
                
            }
        });

        add(painel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new InterfaceLogin(usuariosCadastrados);
        });
    }
}
