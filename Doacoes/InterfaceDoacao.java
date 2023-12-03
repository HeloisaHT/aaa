package Doacoes;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InterfaceDoacao extends JFrame {
    private JCheckBox habilitadoTriagemCheckBox;
    private JTextField cpfDoadorTextField;
    private JTextField tipoSanguineoTextField;
    private JTextField sangueDoadoTextField;
    private JTextField quantidadeSangueTextField;
    private JTextField dataDoacaoTextField;
    private JTextField ruaHospitalTextField;
    private JTextField numeroHospitalTextField;
    private JTextField bairroHospitalTextField;
    private JTextField cidadeHospitalTextField;
    private JTextField estadoHospitalTextField;
    private JTextField nomePacienteTextField;
    private JTextField cpfPacienteTextField;
    private JCheckBox transfusaoFeitaCheckBox;
    private JTextArea observacaoPacienteTextArea;

    public InterfaceDoacao() {
        super("Doação de sangue");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 600);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 0.5;
        

        JLabel habilitadoTriagemLabel = new JLabel("Habilitado para triagem:");
        painel.add(habilitadoTriagemLabel, constraints);

        habilitadoTriagemCheckBox = new JCheckBox();
        constraints.gridx = 1;
        painel.add(habilitadoTriagemCheckBox, constraints);

        JLabel cpfDoadorLabel = new JLabel("CPF do doador:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        painel.add(cpfDoadorLabel, constraints);

        cpfDoadorTextField = new JTextField(20);
        constraints.gridx = 1;
        painel.add(cpfDoadorTextField, constraints);

        JLabel tipoSanguineoLabel = new JLabel("Tipo sanguíneo:");
        constraints.gridx = 0;
        constraints.gridy = 2;
        painel.add(tipoSanguineoLabel, constraints);

        tipoSanguineoTextField = new JTextField(20);
        constraints.gridx = 1;
        painel.add(tipoSanguineoTextField, constraints);

        JLabel sangueDoadoLabel = new JLabel("Sangue doado:");
        constraints.gridx = 0;
        constraints.gridy = 3;
        painel.add(sangueDoadoLabel, constraints);

        sangueDoadoTextField = new JTextField(20);
        constraints.gridx = 1;
        painel.add(sangueDoadoTextField, constraints);

        JLabel quantidadeSangueLabel = new JLabel("Quantidade de sangue:");
        constraints.gridx = 0;
        constraints.gridy = 4;
        painel.add(quantidadeSangueLabel, constraints);

        quantidadeSangueTextField = new JTextField(20);
        constraints.gridx = 1;
        painel.add(quantidadeSangueTextField, constraints);

        JLabel dataDoacaoLabel = new JLabel("Data da doação:");
        constraints.gridx = 0;
        constraints.gridy = 5;
        painel.add(dataDoacaoLabel, constraints);

        dataDoacaoTextField = new JTextField(20);
        constraints.gridx = 1;
        painel.add(dataDoacaoTextField, constraints);

        JLabel ruaHospitalLabel = new JLabel("Rua do hospital:");
        constraints.gridx = 0;
        constraints.gridy = 6;
        painel.add(ruaHospitalLabel, constraints);

        ruaHospitalTextField = new JTextField(20);
        constraints.gridx = 1;
        painel.add(ruaHospitalTextField, constraints);

        JLabel numeroHospitalLabel = new JLabel("Número do hospital:");
        constraints.gridx = 0;
        constraints.gridy = 7;
        painel.add(numeroHospitalLabel, constraints);

        numeroHospitalTextField = new JTextField(20);
        constraints.gridx = 1;
        painel.add(numeroHospitalTextField, constraints);

        JLabel bairroHospitalLabel = new JLabel("Bairro do hospital:");
        constraints.gridx = 0;
        constraints.gridy = 8;
        painel.add(bairroHospitalLabel, constraints);

        bairroHospitalTextField = new JTextField(20);
        constraints.gridx = 1;
        painel.add(bairroHospitalTextField, constraints);

        JLabel cidadeHospitalLabel = new JLabel("Cidade do hospital:");
        constraints.gridx = 0;
        constraints.gridy = 9;
        painel.add(cidadeHospitalLabel, constraints);

        cidadeHospitalTextField = new JTextField(20);
        constraints.gridx = 1;
        painel.add(cidadeHospitalTextField, constraints);

        JLabel estadoHospitalLabel = new JLabel("Estado do hospital:");
        constraints.gridx = 0;
        constraints.gridy = 10;
        painel.add(estadoHospitalLabel, constraints);

        estadoHospitalTextField = new JTextField(20);
        constraints.gridx = 1;
        painel.add(estadoHospitalTextField, constraints);

        JLabel nomePacienteLabel = new JLabel("Nome do paciente:");
        constraints.gridx = 0;
        constraints.gridy = 11;
        painel.add(nomePacienteLabel, constraints);

        nomePacienteTextField = new JTextField(20);
        constraints.gridx = 1;
        painel.add(nomePacienteTextField, constraints);

        JLabel cpfPacienteLabel = new JLabel("CPF do paciente:");
        constraints.gridx = 0;
        constraints.gridy = 12;
        painel.add(cpfPacienteLabel, constraints);

        cpfPacienteTextField = new JTextField(20);
        constraints.gridx = 1;
        painel.add(cpfPacienteTextField, constraints);

        JLabel transfusaoFeitaLabel = new JLabel("Transfusão feita:");
        constraints.gridx = 0;
        constraints.gridy = 13;
        painel.add(transfusaoFeitaLabel, constraints);

        transfusaoFeitaCheckBox = new JCheckBox();
        constraints.gridx = 1;
        painel.add(transfusaoFeitaCheckBox, constraints);

        JLabel observacaoPacienteLabel = new JLabel("Observação do paciente:");
        constraints.gridx = 0;
        constraints.gridy = 14;
        painel.add(observacaoPacienteLabel, constraints);

        observacaoPacienteTextArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(observacaoPacienteTextArea);
        constraints.gridx = 1;
        painel.add(scrollPane, constraints);

        add(painel);
        setVisible(true);
        
    }
}