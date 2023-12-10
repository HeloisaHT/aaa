import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InterfacePaciente extends JFrame {

    private JTextField campoNome;
    private JTextField campoCpf;
    private JTextField campoTipoSanguineo;
    private ArrayList<Paciente> listaPacientes;

    public InterfacePaciente() {
        super("Cadastro de Paciente");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        listaPacientes = new ArrayList<>();


        JPanel painel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 0.5;

        JLabel labelNome = new JLabel("Nome:");
        painel.add(labelNome, constraints);

        campoNome = new JTextField(20);
        constraints.gridx = 1;
        painel.add(campoNome, constraints);

        JLabel labelCpf = new JLabel("CPF:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        painel.add(labelCpf, constraints);

        campoCpf = new JTextField(20);
        constraints.gridx = 1;
        painel.add(campoCpf, constraints);

        JLabel labelTipoSanguineo = new JLabel("Tipo Sanguíneo:");
        constraints.gridx = 0;
        constraints.gridy = 2;
        painel.add(labelTipoSanguineo, constraints);

        campoTipoSanguineo = new JTextField(20);
        constraints.gridx = 1;
        painel.add(campoTipoSanguineo, constraints);

        JButton botaoCadastrar = new JButton("Cadastrar Paciente");
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        painel.add(botaoCadastrar, constraints);

        botaoCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarPaciente();
            }
        });

        add(painel);
        setVisible(true);
    }

    private void cadastrarPaciente() {
        String nome = campoNome.getText();
        String cpf = campoCpf.getText();
        String tipoSanguineo = campoTipoSanguineo.getText();

        // Verifica se os campos estão preenchidos
        if (nome.isEmpty() || cpf.isEmpty() || tipoSanguineo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
        } else {
            // Cria uma instância de Paciente com os dados fornecidos
            Paciente novoPaciente = new Paciente(nome, cpf, tipoSanguineo);
            listaPacientes.add(novoPaciente);


            // Adicione a lógica para salvar o paciente ou realizar ações necessárias
            // ...

            JOptionPane.showMessageDialog(null, "Paciente cadastrado com sucesso!");

            // Limpa os campos após o cadastro
            campoNome.setText("");
            campoCpf.setText("");
            campoTipoSanguineo.setText("");

        
        }
    }

    public static void main(String[] args) {
        new InterfacePaciente();
    }
}
