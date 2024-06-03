package banco.model;

import lombok.Data;

import java.util.Date;

@Data
public class Cliente {
    private String nome;
    private String cpf;
    private String login;
    private String senha;
}
