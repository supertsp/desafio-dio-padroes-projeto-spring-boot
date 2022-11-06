package br.com.tiagopedroso.desafiodiopadroesprojeto.dto;

import br.com.tiagopedroso.desafiodiopadroesprojeto.model.Cliente;
import br.com.tiagopedroso.desafiodiopadroesprojeto.model.Endereco;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteCreate {

    private String nome;
    private String cep;

    public Cliente convertToModel() {
        return new Cliente(null, nome, new Endereco(cep));
    }

}
