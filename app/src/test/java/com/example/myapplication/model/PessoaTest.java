package com.example.myapplication.model;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PessoaTest {

    /*
     * Teste do parâmetro idade
     */
    @Test
    public void testIdadeConstrutor(){
        String nome = "ricardo";
        int idade = 15;
        Pessoa pessoa = new Pessoa(nome, idade);
        Assert.assertEquals(idade,pessoa.getIdade());
    }


    /*
     * Teste do parâmetro nome
     */
    @Test
    public void testNomeConstrutor(){
        String nome = "ricardo";
        int idade = 15;
        Pessoa pessoa = new Pessoa(nome, idade);
        Assert.assertEquals(nome,pessoa.getNome());
    }

    /*
     * Teste verifica se a idade está correta
     */
    @Test
    public void testVerificaMenorIdade(){
        String nome = "ricardo";
        int idade = 15;
        Pessoa pessoa = new Pessoa(nome, idade);
        assertTrue(pessoa.verfificaMenorDeIdade());
    }

    /*
     * Teste verifica se a idade está correta
     */
    @Test
    public void testVerificaMaiorIdade(){
        String nome = "ricardo";
        int idade = 18;
        Pessoa pessoa = new Pessoa(nome, idade);
        assertFalse(pessoa.verfificaMenorDeIdade());
    }
}