package newton;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

public class Newton extends JFrame {

    JLabel txtTitu = new JLabel("Metodos de Newton");
    JLabel txtNum = new JLabel("Numeros de XI");
    JTextField ParaNum = new JTextField(6);
    JLabel txtInter = new JLabel("Numero de iteracciones");
    JTextField ParaInter = new JTextField(6);
    JButton lblCalcular = new JButton("Calcular");
    JScrollPane rr;
    JTable tabla;
    String[] cabeza = {"Interacciones", "X", "F(X)", "F'(X)", "Nueva Raiz", "Error"};
    Metodos cal = new Metodos();

    public Newton() {
        super("Metodo de Newton");
        lblCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evento) {
                rr.setViewportView(tablaNu(ParaNum.getText(), ParaInter.getText()));
            }
        }
        );
        JPanel t = new JPanel();
        t.setLayout(new FlowLayout());
        t.add(txtTitu);
        JPanel boton = new JPanel();
        boton.setLayout(new BorderLayout());
        boton.add(lblCalcular, BorderLayout.NORTH);
        boton.setBorder(BorderFactory.createEmptyBorder(5, 5, 10, 5));

        JPanel borde = new JPanel();
        GridLayout g = new GridLayout(4, 2);
        g.setVgap(-4);
        borde.setLayout(g);

        borde.add(txtNum);
        borde.add(ParaNum);
        borde.add(txtInter);
        borde.add(ParaInter);
        borde.setBorder(BorderFactory.createEmptyBorder(20, 20, 50, 20));

        tabla = new JTable(cal.Calculo("0", "0"), cabeza);
        rr = new JScrollPane(tabla);
        rr.setPreferredSize(new Dimension(300, 150));
        JPanel gene = new JPanel();
        BorderLayout bord = new BorderLayout();
        gene.setLayout(bord);
        gene.add(t, BorderLayout.NORTH);
        gene.add(borde, BorderLayout.CENTER);
        gene.add(boton, BorderLayout.EAST);
        gene.add(rr, BorderLayout.SOUTH);
        gene.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));
        
        Container cont = getContentPane();
        cont.add(gene);
        setLayout(new FlowLayout());
        setSize(350, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//termino del constructor

    public JTable tablaNu(String numeros, String interacciones) {
        return tabla = new JTable(cal.Calculo(numeros, interacciones), cabeza);
    }


}
