package br.com.ifmt.model;

/**
 *
 * @author TADS
 */
public class CTe {

    private String remetente;//OK
    private String cnpjRemetente;//OK
    private String destinatario;//OK
    private String cnpjDestinatario;//OK
    private String tomador;
    private String expedidor;
    private String recebedor;
    private String emitente;
    private String valorMercadoria;//OK
    private String peso;//OK
    private String numNota;//OK
    private String chaveNota;//OK
    private String cfop;//OK
    private String inicioPrestacao;//OK
    private String terminoPrestacao;//OK
    private String placa;//OK
    private String valorRecerber;
    private String fretePorConta;
    private String pedagio;

    public CTe() {
        this.remetente =        "<NÃO INFORMADO>";
        this.cnpjRemetente =    "<NÃO INFORMADO>";
        this.destinatario =     "<NÃO INFORMADO>";
        this.cnpjDestinatario = "<NÃO INFORMADO>";
        this.tomador =          "<NÃO INFORMADO>";
        this.expedidor =        "<NÃO INFORMADO>";
        this.recebedor =        "<NÃO INFORMADO>";
        this.emitente =         "<NÃO INFORMADO>";
        this.valorMercadoria =  "<NÃO INFORMADO>";
        this.peso =             "<NÃO INFORMADO>";
        this.numNota =          "<NÃO INFORMADO>";
        this.chaveNota =        "<NÃO INFORMADO>";
        this.cfop =             "<NÃO INFORMADO>";
        this.inicioPrestacao =  "<NÃO INFORMADO>";
        this.terminoPrestacao = "<NÃO INFORMADO>";
        this.placa =            "<NÃO INFORMADO>";
        this.valorRecerber =    "<NÃO INFORMADO>";
        this.fretePorConta =    "<NÃO INFORMADO>";
        this.pedagio =          "<NÃO INFORMADO>";
    }

    
    
    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getCnpjRemetente() {
        return cnpjRemetente;
    }

    public void setCnpjRemetente(String cnpjRemetente) {
        this.cnpjRemetente = cnpjRemetente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getCnpjDestinatario() {
        return cnpjDestinatario;
    }

    public void setCnpjDestinatario(String cnpjDestinatario) {
        this.cnpjDestinatario = cnpjDestinatario;
    }

    public String getExpedidor() {
        return expedidor;
    }

    public void setExpedidor(String expedidor) {
        this.expedidor = expedidor;
    }

    public String getRecebedor() {
        return recebedor;
    }

    public void setRecebedor(String recebedor) {
        this.recebedor = recebedor;
    }

    public String getTomador() {
        return tomador;
    }

    public void setTomador(String tomador) {
        this.tomador = tomador;
    }

    public String getValorMercadoria() {
        return valorMercadoria;
    }

    public void setValorMercadoria(String valorMercadoria) {
        this.valorMercadoria = valorMercadoria;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getNumNota() {
        return numNota;
    }

    public void setNumNota(String numNota) {
        this.numNota = numNota;
    }

    public String getChaveNota() {
        return chaveNota;
    }

    public void setChaveNota(String chaveNota) {
        this.chaveNota = chaveNota;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public String getInicioPrestacao() {
        return inicioPrestacao;
    }

    public void setInicioPrestacao(String inicioPrestacao) {
        this.inicioPrestacao = inicioPrestacao;
    }

    public String getTerminoPrestacao() {
        return terminoPrestacao;
    }

    public void setTerminoPrestacao(String terminoPrestacao) {
        this.terminoPrestacao = terminoPrestacao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getValorRecerber() {
        return valorRecerber;
    }

    public void setValorRecerber(String valorRecerber) {
        this.valorRecerber = valorRecerber;
    }

    public String getFretePorConta() {
        return fretePorConta;
    }

    public void setFretePorConta(String fretePorConta) {
        this.fretePorConta = fretePorConta;
    }

    public String getPedagio() {
        return pedagio;
    }

    public void setPedagio(String pedagio) {
        this.pedagio = pedagio;
    }

    public String getEmitente() {
        return emitente;
    }

    public void setEmitente(String emitente) {
        this.emitente = emitente;
    }
}
