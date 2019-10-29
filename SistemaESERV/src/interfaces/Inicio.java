package interfaces;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Tela de ínicio
 */
public class Inicio implements ActionListener {

    public JPanel panel;
    public static JFrame frame;
    private JLabel lTitulo;

    private JButton bGerenciamento;
    private JButton bPrestacaoContas;
    private JButton bRelatorios;

    public Inicio() {

        frame = new JFrame("ESERV");
        frame.getContentPane().setBackground(new Color(70, 130, 180));
        frame.setSize(1280, 768);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        lTitulo = new JLabel("ESERV");
        lTitulo.setBounds(200, 80, 200, 60);
        lTitulo.setFont(new Font("Arial", Font.PLAIN, 35));
        lTitulo.setForeground(new Color(255, 255, 255));
        frame.getContentPane().add(lTitulo);
        
        lTitulo = new JLabel("Sistema para prestação de serviços");
        lTitulo.setBounds(100, 140, 400, 60);
        lTitulo.setFont(new Font("Arial", Font.PLAIN, 20));
        lTitulo.setForeground(new Color(255, 255, 255));
        frame.getContentPane().add(lTitulo);

        panel = new JPanel();
		panel.setBounds(550, 0, 820, 768);
        panel.setBackground(new Color(255, 255, 255));
        panel.setLayout(null);
        frame.getContentPane().add(panel);

        bGerenciamento = new JButton("  Gerenciamento");
        bGerenciamento.setBounds(0, 300, 300, 60);
        bGerenciamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/settings.png")));
        bGerenciamento.setFont(new Font("Arial", Font.PLAIN, 25));
        bGerenciamento.setForeground(new Color(255, 255, 255));
        bGerenciamento.setBorderPainted(false);
        bGerenciamento.addActionListener(this);
        frame.getContentPane().add(bGerenciamento);

        bPrestacaoContas = new JButton("  Prestação de contas");
        bPrestacaoContas.setBounds(0, 400, 360, 60);
        bPrestacaoContas.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/share.png")));
        bPrestacaoContas.setFont(new Font("Arial", Font.PLAIN, 25));
        bPrestacaoContas.setForeground(new Color(255, 255, 255));
        bPrestacaoContas.addActionListener(this);
        bPrestacaoContas.setBorderPainted(false);
        frame.getContentPane().add(bPrestacaoContas);

        bRelatorios = new JButton("  Central de Relatórios");
        bRelatorios.setBounds(0, 500, 370, 60);
        bRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/list.png")));
        bRelatorios.setFont(new Font("Arial", Font.PLAIN, 25));
        bRelatorios.setForeground(new Color(255, 255, 255));
        bRelatorios.addActionListener(this);
        bRelatorios.setBorderPainted(false);
        frame.getContentPane().add(bRelatorios);

        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == bGerenciamento) {

            panel.setVisible(false);
            PanelGerenciamento pg = new PanelGerenciamento();

            frame.getContentPane().add(pg);
            pg.setVisible(true);
        }

        if (ae.getSource() == bPrestacaoContas) {

            panel.setVisible(false);
            PanelPrestacaoConta pc = new PanelPrestacaoConta();

            frame.getContentPane().add(pc);
            pc.setVisible(true);
        }

        if (ae.getSource() == bRelatorios) {

            panel.setVisible(false);
            PanelRelatorio pr = new PanelRelatorio();

            frame.getContentPane().add(pr);
            pr.setVisible(true);
        }

    }

    public static void panelInicio(JPanel j) {
        frame.add(j);
        j.setVisible(true);
    }

}
