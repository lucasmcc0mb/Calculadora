package Calculadora;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class FrameCalc extends JFrame {

  private JPanel contentPane;
  private JTextFieldNumeros Visor;
  Calculos calculos = new Calculos();
  String resultado;
  
  public static void main(String[] args) {
    EventQueue.invokeLater(
      new Runnable() {
        public void run() {
          try {
            FrameCalc frame = new FrameCalc();
            frame.setVisible(true);
          } catch (Exception e) {
            e.printStackTrace();
          }
        }
      }
    );
  }

  public FrameCalc() {
	setTitle("Calculadora");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 257, 401);
    contentPane = new JPanel();
    contentPane.setBackground(SystemColor.inactiveCaption);

    setContentPane(contentPane);
    contentPane.setLayout(null);

    JButton btAC = new JButton("AC");
    btAC.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          Visor.setText("");
          Visor.requestFocus();
        }
      }
    );
    btAC.setFont(new Font("Tahoma", Font.BOLD, 19));
    btAC.setBackground(Color.WHITE);
    btAC.setBounds(0, 302, 60, 60);
    contentPane.add(btAC);

    JButton btDelete = new JButton("DEL");
    btDelete.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String valor = Visor.getText();
          valor = valor.substring(0, valor.length() - 1);
          Visor.setText(valor);
          Visor.requestFocus();
        }
      }
    );
    btDelete.setFont(new Font("Tahoma", Font.BOLD, 13));
    btDelete.setBackground(Color.WHITE);
    btDelete.setBounds(180, 182, 60, 60);
    contentPane.add(btDelete);

    JButton btDecimal = new JButton(",");
    btDecimal.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String valor = Visor.getText();
          Visor.setText(valor + ",");
        }
      }
    );
    btDecimal.setFont(new Font("Tahoma", Font.BOLD, 22));
    btDecimal.setBackground(Color.WHITE);
    btDecimal.setBounds(120, 302, 60, 60);
    contentPane.add(btDecimal);

    JButton btResul = new JButton("=");
    btResul.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String valor = Visor.getText();
          System.out.println(">>>" + valor);
          resultado = calculos.calculadora(valor);
          Visor.setText(resultado);
          Visor.requestFocus();
        }
      }
    );

    JButton bt0 = new JButton("0");
    bt0.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String valor = Visor.getText();
          Visor.setText(valor + "0");
          Visor.requestFocus();
        }
      }
    );
    bt0.addActionListener(checaLimpar);
    bt0.setFont(new Font("Tahoma", Font.BOLD, 22));
    bt0.setBackground(Color.WHITE);
    bt0.setBounds(60, 302, 60, 60);
    contentPane.add(bt0);

    btResul.setFont(new Font("Tahoma", Font.BOLD, 22));
    btResul.setBackground(Color.WHITE);
    btResul.setBounds(180, 242, 60, 120);
    contentPane.add(btResul);

    JButton bt1 = new JButton("1");
    bt1.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String valor = Visor.getText();
          Visor.setText(valor + "1");
          Visor.requestFocus();
        }
      }
    );
    bt1.addActionListener(checaLimpar);
    bt1.setFont(new Font("Tahoma", Font.BOLD, 22));
    bt1.setBackground(Color.WHITE);
    bt1.setBounds(0, 242, 60, 60);
    contentPane.add(bt1);

    JButton bt2 = new JButton("2");
    bt2.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String valor = Visor.getText();
          Visor.setText(valor + "2");
          Visor.requestFocus();
        }
      }
    );
    bt2.addActionListener(checaLimpar);
    bt2.setFont(new Font("Tahoma", Font.BOLD, 22));
    bt2.setBackground(Color.WHITE);
    bt2.setBounds(60, 242, 60, 60);
    contentPane.add(bt2);

    JButton bt3 = new JButton("3");
    bt3.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String valor = Visor.getText();
          Visor.setText(valor + "3");
          Visor.requestFocus();
        }
      }
    );
    bt3.addActionListener(checaLimpar);
    bt3.setFont(new Font("Tahoma", Font.BOLD, 22));
    bt3.setBackground(Color.WHITE);
    bt3.setBounds(120, 242, 60, 60);
    contentPane.add(bt3);

    JButton bt4 = new JButton("4");
    bt4.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String valor = Visor.getText();
          Visor.setText(valor + "4");
          Visor.requestFocus();
        }
      }
    );
    bt4.addActionListener(checaLimpar);
    bt4.setFont(new Font("Tahoma", Font.BOLD, 22));
    bt4.setBackground(Color.WHITE);
    bt4.setBounds(0, 182, 60, 60);
    contentPane.add(bt4);

    JButton bt5 = new JButton("5");
    bt5.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String valor = Visor.getText();
          Visor.setText(valor + "5");
          Visor.requestFocus();
        }
      }
    );
    bt5.addActionListener(checaLimpar);
    bt5.setFont(new Font("Tahoma", Font.BOLD, 22));
    bt5.setBackground(Color.WHITE);
    bt5.setBounds(60, 182, 60, 60);
    contentPane.add(bt5);

    JButton bt6 = new JButton("6");
    bt6.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String valor = Visor.getText();
          Visor.setText(valor + "6");
          Visor.requestFocus();
        }
      }
    );
    bt6.addActionListener(checaLimpar);
    bt6.setFont(new Font("Tahoma", Font.BOLD, 22));
    bt6.setBackground(Color.WHITE);
    bt6.setBounds(120, 182, 60, 60);
    contentPane.add(bt6);

    JButton bt7 = new JButton("7");
    bt7.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String valor = Visor.getText();
          Visor.setText(valor + "7");
          Visor.requestFocus();
        }
      }
    );
    bt7.addActionListener(checaLimpar);
    bt7.setFont(new Font("Tahoma", Font.BOLD, 22));
    bt7.setBackground(Color.WHITE);
    bt7.setBounds(0, 122, 60, 60);
    contentPane.add(bt7);

    JButton bt8 = new JButton("8");
    bt8.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String valor = Visor.getText();
          Visor.setText(valor + "8");
          Visor.requestFocus();
        }
      }
    );
    bt8.addActionListener(checaLimpar);
    bt8.setFont(new Font("Tahoma", Font.BOLD, 22));
    bt8.setBackground(Color.WHITE);
    bt8.setBounds(60, 122, 60, 60);
    contentPane.add(bt8);

    JButton bt9 = new JButton("9");
    bt9.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String valor = Visor.getText();
          Visor.setText(valor + "9");
          Visor.requestFocus();
        }
      }
    );
    bt9.addActionListener(checaLimpar);
    bt9.setFont(new Font("Tahoma", Font.BOLD, 22));
    bt9.setBackground(Color.WHITE);
    bt9.setBounds(120, 122, 60, 60);
    contentPane.add(bt9);

    JButton btPotenciacao = new JButton("^");
    btPotenciacao.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String valor = Visor.getText();
          if (!valor.equals("")) {
            Visor.setText(valor + "^");
          }
          Visor.requestFocus();
        }
      }
    );
    btPotenciacao.setFont(new Font("Tahoma", Font.BOLD, 22));
    btPotenciacao.setBackground(Color.WHITE);
    btPotenciacao.setBounds(180, 122, 60, 60);
    contentPane.add(btPotenciacao);

    JButton btSoma = new JButton("+");
    btSoma.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String valor = Visor.getText();
          if (!valor.equals("")) {
            Visor.setText(valor + "+");
          }
          Visor.requestFocus();
        }
      }
    );
    btSoma.setFont(new Font("Tahoma", Font.BOLD, 22));
    btSoma.setBackground(Color.WHITE);
    btSoma.setBounds(0, 62, 60, 60);
    contentPane.add(btSoma);

    JButton btSubtracao = new JButton("-");
    btSubtracao.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String valor = Visor.getText();
          Visor.setText(valor + "-");
          Visor.requestFocus();
        }
      }
    );
    btSubtracao.setFont(new Font("Tahoma", Font.BOLD, 22));
    btSubtracao.setBackground(Color.WHITE);
    btSubtracao.setBounds(60, 62, 60, 60);
    contentPane.add(btSubtracao);

    JButton btMultiplicacao = new JButton("*");
    btMultiplicacao.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String valor = Visor.getText();
          if (!valor.equals("")) {
            Visor.setText(valor + "*");
          }
          Visor.requestFocus();
        }
      }
    );
    btMultiplicacao.setFont(new Font("Tahoma", Font.BOLD, 22));
    btMultiplicacao.setBackground(Color.WHITE);
    btMultiplicacao.setBounds(120, 62, 60, 60);
    contentPane.add(btMultiplicacao);

    JButton btDivisao = new JButton("÷");
    btDivisao.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String valor = Visor.getText();
          if (!valor.equals("")) {
            Visor.setText(valor + "/");
          }
          Visor.requestFocus();
        }
      }
    );
    btDivisao.setFont(new Font("Tahoma", Font.BOLD, 17));
    btDivisao.setBackground(Color.WHITE);
    btDivisao.setBounds(180, 62, 60, 60);
    contentPane.add(btDivisao);

    Visor = new JTextFieldNumeros();
    Visor.setFont(new Font("Tahoma", Font.BOLD, 24));
    Visor.setHorizontalAlignment(SwingConstants.RIGHT);
    Visor.setBounds(5, 5, 231, 51);
    Visor.addKeyListener(
      new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
          if (Visor.getText().equals("")) {
            Visor.setPrimeiraPos(0);
          }
          if (Visor.getText().equals(resultado)) {
            limpar();
          } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String valor = Visor.getText();
            System.out.println(">>>" + valor);
            resultado = calculos.calculadora(valor);
            Visor.setText(resultado);
          }
        }
      }
    );
    contentPane.add(Visor);
    Visor.setColumns(10);
  }

  public void limpar() {
    Visor.setText("");
  }

  private ActionListener checaLimpar = new ActionListener() {
    public void actionPerformed(ActionEvent ae) {
      if (Visor.getText().equals("")) {
        Visor.setPrimeiraPos(0);
      }
      if (Visor.getText().equals(resultado)) {
        limpar();
      }
    }
  };
}
