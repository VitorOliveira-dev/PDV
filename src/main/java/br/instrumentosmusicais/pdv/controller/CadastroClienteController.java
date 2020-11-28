package br.instrumentosmusicais.pdv.controller;
import br.instrumentosmusicais.pdv.DAO.CadastroClienteDAO;
import br.instrumentosmusicais.pdv.model.Cliente;
import java.util.Date;

public class CadastroClienteController {

    public static String[] consultarCliente(int CodCliente) {

        Cliente objCliente = CadastroClienteDAO.consultarCliente(CodCliente);

        String[] ClienteRetorno = null;

        if (objCliente != null) {
            ClienteRetorno = new String[]{String.valueOf(objCliente.getCodCliente()),
                String.valueOf(objCliente.getNomeCliente()),
                String.valueOf(objCliente.getCPF()),
                String.valueOf(objCliente.getEndereco()),
                String.valueOf(objCliente.getCidade()),
                String.valueOf(objCliente.getTelefone()),
                String.valueOf(objCliente.getNasc()),
                String.valueOf(objCliente.getEmail()),
                String.valueOf(objCliente.getSexo()),};

        }

        return ClienteRetorno;
    }

    public static boolean salvarCliente(String nomeCliente, String CPF, String endereco, String cidade, String telefone, Date nasc, String email, String sexo) {
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

    public static boolean atualizarCliente(int codCliente, String nomeCliente, String CPF, String endereco, String cidade, String telefone, Date nasc, String email, String sexo) {
        Cliente objCliente = new Cliente();
        objCliente.setCodCliente(codCliente);
        objCliente.setNomeCliente(nomeCliente);
        objCliente.setCPF(CPF);
        objCliente.setEndereco(endereco);
        objCliente.setCidade(cidade);
        objCliente.setTelefone(telefone);
        objCliente.setNasc(nasc);
        objCliente.setEmail(email);
        objCliente.setSexo(sexo);

        return CadastroClienteDAO.atualizarCliente(objCliente);
    }

}
