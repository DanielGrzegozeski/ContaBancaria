import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class ConversorMoedas {
    private static final DecimalFormat decimalFormat = new DecimalFormat("");
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;

    private static float converterRealParaDolar(float valorReal) {
        // Implemente a lógica de conversão de Real para Dólar
        return valorReal * 0.18f;
    }

    private static float converterRealParaEuro(float valorReal) {
        // Implemente a lógica de conversão de Real para Euro
        return valorReal * 0.15f;
    }

    private static float converterRealParaLibra(float valorReal) {
        // Implemente a lógica de conversão de Real para Libra
        return valorReal * 0.13f;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Conversor de Moedas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(null);

        JLabel labelValor = new JLabel("Valor em Reais:");
        labelValor.setBounds(20, 20, 100, 25);
        frame.add(labelValor);

        JTextField textFieldValor = new JTextField();
        textFieldValor.setBounds(120, 20, 100, 25);
        frame.add(textFieldValor);

        JLabel labelMoeda = new JLabel("Moeda:");
        labelMoeda.setBounds(20, 60, 100, 25);
        frame.add(labelMoeda);

        String[] moedas = {"Dólar", "Euro", "Libra"};
        JComboBox<String> comboBoxMoeda = new JComboBox<>(moedas);
        comboBoxMoeda.setBounds(120, 60, 100, 25);
        frame.add(comboBoxMoeda);

        JLabel labelResultado = new JLabel("Resultado:");
        labelResultado.setBounds(20, 100, 100, 25);
        frame.add(labelResultado);

        JLabel labelValorConvertido = new JLabel();
        labelValorConvertido.setBounds(120, 100, 100, 25);
        frame.add(labelValorConvertido);

        JButton buttonConverter = new JButton("Converter");
        buttonConverter.setBounds(230, 60, 100, 25);
        frame.add(buttonConverter);

        buttonConverter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valorString = textFieldValor.getText();
                float valorReal = Float.parseFloat(valorString);

                String moedaSelecionada = (String) comboBoxMoeda.getSelectedItem();
                float valorConvertido = 0.0f;

                switch (moedaSelecionada) {
                    case "Dólar":
                        valorConvertido = converterRealParaDolar(valorReal);
                        break;
                    case "Euro":
                        valorConvertido = converterRealParaEuro(valorReal);
                        break;
                    case "Libra":
                        valorConvertido = converterRealParaLibra(valorReal);
                        break;
                }

                String valorConvertidoString = decimalFormat.format(valorConvertido);
                labelValorConvertido.setText(valorConvertidoString);
            }
        });

        frame.setVisible(true);
    }
}