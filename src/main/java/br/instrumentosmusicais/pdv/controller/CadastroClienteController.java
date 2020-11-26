package br.instrumentosmusicais.pdv.controller;

import br.instrumentosmusicais.pdv.DAO.CadastroClienteDAO;
import br.instrumentosmusicais.pdv.model.Cliente;

public class CadastroClienteController {
    public static boolean salvarCliente(String nomeCliente, String CPF, String endereco, String cidade, String telefone, String nasc, String email, String sexo) {
        Cliente objCliente = new Cliente();
        
        objCliente.setNomeCliente(nomeCliente);
        objCliente.setCPF(CPF);
        objCliente.setEndereco(endereco);
        objCliente.setCidade(cidade);
        objCliente.setTelefone(telefone);
        objCliente.setNasc(nasc);
        objCliente.setEmail(email);
        objCliente.setSexo(sexo);
        
        return CadastroClienteDAO.salvarCliente(objCliente);
        }
}
