
package br.instumentosmusicais.pdv.utils;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Validador {
    
    public ArrayList<String> mensagensErro = new ArrayList<>();
    

        public void ValidarNumero(JTextField txt){
    
        try{
            
            int valorConvertido = Integer.parseInt(txt.getText());
            txt.setBackground(Color.WHITE);
            
        }catch(NumberFormatException e){
            txt.setBackground(Color.red);
        }
    
    }
    public void CampoVazio( JTextField txt, JLabel jbl){
        try{
            
            //Verifico se o campo está vazio
            if(txt.getText().trim().equals("")){
                throw new IllegalArgumentException();
                
            }
            txt.setBackground(Color.WHITE);
            jbl.setText("");
            }
        catch(IllegalArgumentException e){
            txt.setBackground(Color.red);
            jbl.setText("Campo Obrigatório");
        }
    } 
    
        public void CampoVazioFormatado( JFormattedTextField txt, JLabel jbl){
        try{
            
            //Verifico se o campo está vazio
            if(txt.getText().replace(".", "").replace("/", "").replace("-", "").replace("(", "").replace(")", "").trim().equals("")){
                throw new IllegalArgumentException();
                
            }
            txt.setBackground(Color.WHITE);
            jbl.setText("");
            }
        catch(IllegalArgumentException e){
            txt.setBackground(Color.red);
            jbl.setText("Campo Obrigatório");
        }
    }
     public void ValidarFloat(JTextField txt, JLabel jbl){
     
         try{
            
            //Verifico se o campo está vazio
            if(txt.getText().trim().equals("")){
                throw new IllegalArgumentException();
            }
            
            float valorConvertido = Float.parseFloat(txt.getText());
            txt.setBackground(Color.WHITE);
            jbl.setText("");
            
        }catch(NumberFormatException e){
            txt.setBackground(Color.red);
            jbl.setText("Somente números");
        }
     
     }
     
     public void limparMensagens(){
     
         this.mensagensErro.clear();
     }
}