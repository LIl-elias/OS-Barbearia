/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;

/**
 *
 * @author Aluno
 */
public class loginCliente {

    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String endereco;
    private String tipoPlano;

    // Construtor da classe Cliente
    public loginCliente(String nome, String cpf, String telefone,
            String email, String endereco, String tipoPlano) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.tipoPlano = tipoPlano;
    }

    // Atualiza o nome do cliente
    public void alterarNome(String nome) {
        this.nome = nome;
    }

    // Atualiza o CPF do cliente
    public void alterarCPF(String cpf) {
        this.cpf = cpf;
    }

    // Atualiza o telefone do cliente
    public void alterarTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Atualiza o e-mail do cliente
    public void alterarEmail(String email) {
        this.email = email;
    }

    // Atualiza o endereço do cliente
    public void alterarEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Atualiza o plano escolhido pelo cliente
    public void alterarTipoPlano(String tipoPlano) {
        this.tipoPlano = tipoPlano;
    }

    // Retorna o nome do cliente
    public String getNome() {
        return nome;
    }

    // Retorna o CPF do cliente
    public String getCpf() {
        return cpf;
    }

    // Retorna o telefone do cliente
    public String getTelefone() {
        return telefone;
    }

    // Retorna o e-mail do cliente
    public String getEmail() {
        return email;
    }

    // Retorna o endereço do cliente
    public String getEndereco() {
        return endereco;
    }

    // Retorna o tipo de plano escolhido
    public String getTipoPlano() {
        return tipoPlano;
    }
    
}

