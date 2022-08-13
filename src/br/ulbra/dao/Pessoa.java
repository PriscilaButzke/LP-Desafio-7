package br.ulbra.dao;

import java.util.Scanner;

/**
 *
 * @author Priscila Butzke
 */
public class Pessoa {

    private String nome;
    private String cpf;
    private String cep;
    private String numero;
    private String rua;
    private String compl;
    private String bairro;
    private String cidade;

    Scanner ler = new Scanner(System.in);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.length() == 11) {
            this.cpf = cpf;
        } else {
            do {
                System.out.println("Informe um CPF com 11 digitos");
                cpf = ler.nextLine();
            } while (cpf.length() != 11);
            this.cpf = cpf;
        }
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if (cep.length() == 8) {
            this.cep = cep;
        } else {
            do {
                System.out.println("Informe um CEP com 8 digitos");
                cep = ler.nextLine();
            } while (cep.length() != 8);
            this.cep = cep;
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if (numero.length() != 0) {
            this.numero = numero;
        } else {
            do {
                System.out.println("Campo não pode ser vazio."
                        + "\n Informe um n° válido: ");
                numero = ler.nextLine();
            } while (numero.length() == 0);
            this.numero = numero;
        }
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCompl() {
        return compl;
    }

    public void setCompl(String compl) {
        this.compl = compl;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

}
