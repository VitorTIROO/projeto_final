package br.com.ifmt.controller;

/**
 * Data: 09/07/2018
 * @author Vitor Ribeiro dos Santos
 *         Livia Mara 
 */
public enum Funcao {

          SUP(0,"Supervisor")
          ,FUNC(1,"Funcionario")
          ,ADMIN(-1,"Administrador")
          ,TESTE(2,"Teste");
     
    private int valor;
    private String descricao;

    Funcao(int valor, String descricao){
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
