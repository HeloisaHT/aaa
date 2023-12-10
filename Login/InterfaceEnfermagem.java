package Login;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Login.InterfaceLogin;

public class InterfaceEnfermagem extends JFrame {

    public InterfaceEnfermagem() {
        super("Interface Enfermagem");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 0.5;

        JButton botaoCadastrarPaciente = new JButton("Cadastrar Paciente");
        painel.add(botaoCadastrarPaciente, constraints);

        JButton botaoTransferirDoacao = new JButton("Transferir Doação");
        constraints.gridy = 1;
        painel.add(botaoTransferirDoacao, constraints);

        JButton botaoSair = new JButton("Sair");
        constraints.gridy = 2;
        painel.add(botaoSair, constraints);

        botaoCadastrarPaciente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Adicione a lógica para abrir a interface de cadastro de paciente
                dispose();  // Fecha a janela atual
                // Coloque o código para abrir a Interface de Cadastro de Paciente aqui
            }
        });

        botaoTransferirDoacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Adicione a lógica para abrir a interface de transferência de doação
                dispose();  // Fecha a janela atual
                // Coloque o código para abrir a Interface de Transferência de Doação aqui
            }
        });

        botaoSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Adicione a lógica para voltar à tela de login
                dispose();  // Fecha a janela atual
                new InterfaceLogin(null);  // Abre a Interface de Login
            }
        });

        add(painel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new InterfaceEnfermagem();
    }
}

