package com.example.myapplication.model;

/*
 * Classe Pessoa - define o modelo Pessoa
 *
 * Define o modelo Pessoa que tem como parâmetros a idade
 * e o nome.
 *
 * @since 1.0.0
 * @author Ricardo Gonçalves <ricardo@brgweb.com.br>
 */
public class Pessoa {

    /*
     * var pessoa
     */
    private String nome;
    private int idade;
    private boolean menor;

    /*
     * Construtor Pessoa
     *
     * @param String nome Nome da Pessoa
     * @param int idade Idade da Pessoa
     */
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.menor = verfificaMenorDeIdade();
    }

    /*
     * blablabla
     */
    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public boolean verfificaMenorDeIdade(){
        return this.idade < 18;
    }

}
