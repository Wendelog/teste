
package br.com.fiap.modelo;

import java.sql.Date;


public class Cliente {
    private String cpf;
    private String nome;
    private String endereco;
    private Date nascimento;
    private String fone;
    private String caminho;

    public Cliente(String cpf, String nome, String endereco, Date nascimento, String fone, String caminho) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.nascimento = nascimento;
        this.fone = fone;
        this.caminho = caminho;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public String getFone() {
        return fone;
    }

    public String getCaminho() {
        return caminho;
    }
    
    
}
