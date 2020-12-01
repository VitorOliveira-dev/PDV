package br.instrumentosmusicais.pdv.utils;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;

/***
 * @see br.instrumentosmusicais.pdv.utils.Validador
 */
public class Validador {

    public ArrayList<String> mensagensErro = new ArrayList<>();
    
    /**
     * Método para validar número inteiro.
    * @param txt, Int a ser convertido.
    * @throws NumberFormatException, pode trazer uma mensagem de exceção.
    * @return void não retorna, apenas formata o campo.
    */
    public void ValidarNumero(JTextField txt) {

        try {

            int valorConvertido = Integer.parseInt(txt.getText());
            txt.setBackground(Color.WHITE);

        } catch (NumberFormatException e) {
            txt.setBackground(Color.red);
        }

    }
    /**
     * Método para validar campo vazio.
    * @param txt JTextField, variável para ser testada.
    * @param jbl JLabel, formatar campo em caso de erro.
    * @throws IllegalArgumentException, pode trazer uma mensagem de exceção.
    * @return boolean, <b>true:</b> campo vazio | <b>false:<b/> campo preenchido.
    */
    public boolean CampoVazio(JTextField txt, JLabel jbl) {
        try {

            //Verifico se o campo está vazio
            if (txt.getText().trim().equals("")) {
                throw new IllegalArgumentException();

            }
            txt.setBackground(Color.WHITE);
            jbl.setText("");
        } catch (IllegalArgumentException e) {
            txt.setBackground(Color.red);
            jbl.setText("Campo Obrigatório");
            return true;
        }
        return false;
    }
    /**
     * Método para limpar e validar campo vazio.
    * @param txt JFormattedTextField, variável para ser testada.
    * @param jbl JLabel, formatar campo em caso de erro.
    * @throws IllegalArgumentException, pode trazer uma mensagem de exceção.
    * @return boolean, <b>true:</b> campo vazio | <b>false:<b/> campo preenchido.
    */
    public boolean CampoVazioFormatado(JFormattedTextField txt, JLabel jbl) {
        try {

            //Verifico se o campo está vazio
            if (txt.getText().replace(".", "").replace("/", "").replace("-", "").replace("(", "").replace(")", "").trim().equals("")) {
                throw new IllegalArgumentException();

            }
            txt.setBackground(Color.WHITE);
            jbl.setText("");
        } catch (IllegalArgumentException e) {
            txt.setBackground(Color.red);
            jbl.setText("Campo Obrigatório");
            return true;
        }
    return false;
    }
    /**
     * Método para validar data vazia.
    * @param txt JDateChooser, variável para ser testada.
    * @param jbl JLabel, formatar campo em caso de erro.
    * @throws IllegalArgumentException, pode trazer uma mensagem de exceção.
    * @return void não retorna, apenas formata o campo.
    */
    public void CampoVazioFormatadoData(JDateChooser txt, JLabel jbl) {
        try {

            //Verifico se o campo está vazio
            if (txt.getDate().equals("")) {
                throw new IllegalArgumentException();

            }
            txt.setBackground(Color.WHITE);
            jbl.setText("");
        } catch (IllegalArgumentException e) {
            txt.setBackground(Color.red);
            jbl.setText("Campo Obrigatório");
        }
    }
    /**
     * Método para validar número float
    * @param txt JTextField, variável para ser testada
    * @param jbl JLabel, formatar campo em caso de erro
    * @throws NumberFormatException, pode trazer uma mensagem de exceção
    * @return void void não retorna, apenas formata o campo
    */
    public void ValidarFloat(JTextField txt, JLabel jbl) {

        try {

            //Verifico se o campo está vazio
            if (txt.getText().trim().equals("")) {
                throw new IllegalArgumentException();
            }

            float valorConvertido = Float.parseFloat(txt.getText().replace(",", "."));
            txt.setBackground(Color.WHITE);
            jbl.setText("");

        } catch (NumberFormatException e) {
            txt.setBackground(Color.red);
            jbl.setText("Somente números");
        }
        
    }

    public void limparMensagens() {

        this.mensagensErro.clear();
    }
}