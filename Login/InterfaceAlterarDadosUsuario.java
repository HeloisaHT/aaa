package Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceAlterarDadosUsuario extends JFrame {
    private JTextField campoNovoNome;
    private JTextField campoNovoTelefone;
    private JTextField campoNovoEndereco;
    private JTextField campoNovoCpf;
    private JTextField campoNovoTipoSanguineo;
    private JTextField campoNovoEmail;
    private JPasswordField campoNovaSenha;
    private JButton botaoSalvar;

    public InterfaceAlterarDadosUsuario() {
        super("Alterar Dados do Usuário");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(1, 45, 1, 50);

        adicionarCampo("Novo Nome:", campoNovoNome, painel, constraints);
        adicionarCampo("Novo Telefone:", campoNovoTelefone, painel, constraints);
        adicionarCampo("Novo Endereço:", campoNovoEndereco, painel, constraints);
        adicionarCampo("Novo CPF:", campoNovoCpf, painel, constraints);
        adicionarCampo("Novo Tipo Sanguíneo:", campoNovoTipoSanguineo, painel, constraints);
        adicionarCampo("Novo E-mail:", campoNovoEmail, painel, constraints);

        JLabel labelNovaSenha = new JLabel("Nova Senha:");
        constraints.gridx = 0; 
        constraints.gridy++;   
        painel.add(labelNovaSenha, constraints);
        constraints.gridx++;
        campoNovaSenha = new JPasswordField(20);
        painel.add(campoNovaSenha, constraints);

        botaoSalvar = new JButton("Salvar Alterações");
        constraints.gridx = 0;
        constraints.gridy++;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.CENTER;
        painel.add(botaoSalvar, constraints);

        add(painel);
        setVisible(true);

        botaoSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aqui você deve pegar os novos dados dos campos de texto e fazer as alterações no objeto Usuario
                // Exemplo:
                Usuario usuario = new Usuario(
                        campoNovoNome.getText(),
                        campoNovoTelefone.getText(),
                        campoNovoEndereco.getText(),
                        campoNovoCpf.getText(),
                        campoNovoTipoSanguineo.getText(),
                        campoNovoEmail.getText(),
                        new String(campoNovaSenha.getPassword()));

                // Lógica para salvar ou atualizar o usuário no sistema
                // ...

                JOptionPane.showMessageDialog(null, "Alterações salvas com sucesso!");
                dispose(); // Fecha a janela após salvar as alterações
            }
        });
    }

    private void adicionarCampo(String labelText, JTextField textField, JPanel panel, GridBagConstraints constraints) {
        JLabel label = new JLabel(labelText);
        panel.add(label, constraints);

        constraints.gridx++;  // Mude para a próxima coluna
        textField = new JTextField(20);
        panel.add(textField, constraints);

        constraints.gridx = 0; // Reinicie a contagem das colunas
        constraints.gridy++;   // Mude para a próxima linha
    }

    public static void main(String[] args) {
        new InterfaceAlterarDadosUsuario();
    }
}
