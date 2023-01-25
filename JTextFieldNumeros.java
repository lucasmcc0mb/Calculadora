package Calculadora;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class JTextFieldNumeros extends JTextField {

  private int primeiraPos;
  private String digitados = "";
  private String ultDigitado = "";

  public int getPrimeiraPos() {
    return primeiraPos;
  }

  public void setPrimeiraPos(int primeiraPos) {
    this.primeiraPos = primeiraPos;
  }

  public JTextFieldNumeros() {
    super();
    addKeyListener(
      new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
          jTextFieldKeyTyped(evt);
        }
      }
    );
  }

  private void jTextFieldKeyTyped(KeyEvent evt) {
    String caracteres = "";
    digitados = digitados.concat(evt.getKeyChar()+"");
    if(digitados.length() >= 2) {
    	ultDigitado = "" + digitados.charAt(digitados.length()-2);
    }else {
    	ultDigitado = "" + digitados.charAt(digitados.length()-1);
    }
    
    System.out.println(digitados);
    System.out.println(ultDigitado);
    System.out.println("\n---------------------------------\n");
    if (primeiraPos == 0) {
      caracteres = "0987654321-.,";
      primeiraPos = 1;
    } else if (primeiraPos == 1) {
    	String ops = "+-*/";
    	if(ops.contains(ultDigitado)) {
    		caracteres = "0123456789";
    	}else {
      caracteres = "0987654321,.+-/*";
    	}
    }
    if (!caracteres.contains(evt.getKeyChar() + "")) {
      evt.consume();
    }
  }
}
