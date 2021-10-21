package br.com.ifmt.controller;

/**
 * Data: 21/06/2018
 * @author Vitor Ribeiro dos Santos
 *         Livia Mara 
 */
public enum ModFrete {
    
      _0("0 - Por conta do emitente")
     ,_1("1 - Por conta destinatario/remetente")
     ,_2("2 - Por conta de terceiros")
     ,_9("9 - Sem frete");
     
    public String descricao;

    ModFrete(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Object[] getValues(){
    
        return Funcao.class.getFields();
    }
    
}
