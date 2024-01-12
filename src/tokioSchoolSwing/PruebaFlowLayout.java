package tokioSchoolSwing;

import javax.swing.*;
import java.awt.*;

import static java.lang.String.valueOf;

public class PruebaFlowLayout extends JFrame  {
    private JTextField texto;
    private JTextField texto3;
    private JButton suma;
    private JButton resta;
    private JButton multiplicacion;
    private JButton dividir;
    private JTextField resultado;
    private JLabel texto1, texto2;
    private JPanel jPanel;
    private JButton limpiar;
    private Operaciones op;

    public PruebaFlowLayout(){
        setLayout(new FlowLayout());
        iniciarComponentes();
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }
    public void iniciarComponentes(){


        suma = new JButton("Suma");
        suma.addActionListener(evento ->{
           op = new Operaciones(texto3,texto);
            double n1 = Double.parseDouble(texto3.getText());
            double n2 = Double.parseDouble(texto.getText());
           double res = op.suma(n1,n2);
           resultado.setText(String.valueOf(res));

        });
        resta = new JButton("Resta");
        resta.addActionListener(evento ->{
           op = new Operaciones(texto3,texto);
            double n1 = Double.parseDouble(texto3.getText());
            double n2 = Double.parseDouble(texto.getText());
            double res = op.resta(n1,n2);
            resultado.setText(String.valueOf(res));

        });
        multiplicacion = new JButton("Multiplicacion");
        multiplicacion.addActionListener(evento ->{
             op = new Operaciones(texto3,texto);
            double n1 = Double.parseDouble(texto3.getText());
            double n2 = Double.parseDouble(texto.getText());
            double res = op.multiplicacion(n1,n2);
            resultado.setText(String.valueOf(res));

        });
        dividir = new JButton("Division");
        dividir.addActionListener(evento ->{
             op = new Operaciones(texto3,texto);
            double n1 = Double.parseDouble(texto3.getText());
            double n2 = Double.parseDouble(texto.getText());
            double res = op.division(n1,n2);
            resultado.setText(String.valueOf(res));

        });
        limpiar = new JButton("Limpiar");
        limpiar.addActionListener(event->{
            texto.setText("");
            texto3.setText("");
        });
        jPanel = new JPanel();
        jPanel.add(suma);
        jPanel.add(resta);
        jPanel.add(multiplicacion);
        jPanel.add(dividir);
        texto = new JTextField(10);
        texto3 = new JTextField(10);
        resultado = new JTextField(10);
        texto1 = new JLabel("Cifras");
        texto2 = new JLabel("Resultado");


        getContentPane().add(texto1);
        getContentPane().add(texto3);
        getContentPane().add(texto);
        getContentPane().add(texto2);
        getContentPane().add(resultado);
        getContentPane().add(jPanel);
        getContentPane().add(limpiar);


    }





}
