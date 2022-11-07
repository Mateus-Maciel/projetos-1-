
package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import maquina.de.doce.Maquina;

public class Tela  extends JFrame implements ActionListener{
    
    Maquina m = new Maquina();   
  
    
     
    JButton btnDoceA = new JButton("Doce A");
    JButton btnDoceB = new JButton("Doce B");
    JButton btnDoceC = new JButton("Doce C");
    
    JButton btn1Real = new JButton("1 Real");
    JButton btn2Reais = new JButton("2 Reais");
    JButton btn5Reais = new JButton("5 Reais");
    
    JLabel lbltitu = new JLabel("Selecionar Doce");
    JLabel lblNotas = new JLabel("Notas");
    JLabel lblSaldo = new JLabel("Saldo:");
    JLabel lblValor = new JLabel("0");
    JLabel lblMsgTroco = new JLabel("Seu Troco é: " );
    JLabel lblValorTroco = new JLabel("0" );
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1Real) {
            m.inserirNota(1);
            trocarCor();
            
        } if (e.getSource() == btn2Reais){
            m.inserirNota(2);
            trocarCor();
            
        } if(e.getSource() == btn5Reais){
            m.inserirNota(5);
            trocarCor();
        
        }  
         if(e.getSource() == btnDoceA){
            m.opcao = 1;
            lblValorTroco.setText(Integer.toString(m.troco()));
           System.out.print(m.opcao);
        }
         if (e.getSource() == btnDoceB){
            m.opcao = 2;
            lblValorTroco.setText(Integer.toString(m.troco()));   
            System.out.print(m.opcao);
        }
         if(e.getSource() == btnDoceC){
            m.opcao = 3;
            lblValorTroco.setText(Integer.toString(m.troco()));
            System.out.print(m.opcao);
        }
        lblValor.setText(Integer.toString(m.getSaldo()));
    }
  
    public Tela() {
    
        setLayout(null);
       
        btn1Real.addActionListener(this);
        btn2Reais.addActionListener(this);
        btn5Reais.addActionListener(this);
        
        
        btnDoceA.addActionListener(this);
        btnDoceB.addActionListener(this);
        btnDoceC.addActionListener(this);
        
        
        btnDoceA.setBounds(30,50,100,30);
        btnDoceB.setBounds(300, 50, 100, 30);
        btnDoceC.setBounds(550, 50, 100, 30);
        
        
      
        lblNotas.setBounds(65, 190, 100, 30);
        btn1Real.setBounds(30,220,100,30);
        btn2Reais.setBounds(30, 260, 100, 30);
        btn5Reais.setBounds(30, 300, 100, 30);
        
        lbltitu.setBounds(300, 20, 300, 40);
        lbltitu.setSize(100, 30);
        lblSaldo.setBounds(300, 300, 50, 20);
        lblValor.setBounds(360, 300, 50, 20);
        
        lblMsgTroco.setBounds(300, 400, 100, 20);
        lblValorTroco.setBounds(350, 450, 100, 20);
        
        
        
        add(btnDoceA);
        add(btnDoceB);
        add(btnDoceC);
        add(btn1Real);
        add(btn2Reais);
        add(btn5Reais);
        add(lbltitu);
        add(lblNotas);
        add(lblSaldo);
        add(lblValor);
        add(lblMsgTroco);
        add(lblValorTroco);
        
        setTitle("Título da Janela");
        setSize(700,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
             
                
    }
    
    public void trocarCor() {

        if (m.getSaldo() >= 6) {
            btnDoceA.setBackground(Color.green);
        }
        if (m.getSaldo() >= 7) {
            btnDoceB.setBackground(Color.green);
        }
        if (m.getSaldo() >= 8) {
            btnDoceA.setBackground(Color.green);
            btnDoceB.setBackground(Color.green);
            btnDoceC.setBackground(Color.green);
        }

    }
    
    
}
