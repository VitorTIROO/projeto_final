package br.com.ifmt.model;

/**
 *
 * @author TADS
 */
public class NFe {
    
    private String emitente;
    private String destinatario;
    private String cnpjEmitente;
    private String cnpjDestinatario;
    private String tomador;
    private String valorMercadoria;
    private String peso;
    private String numNota;
    private String chaveNota;
    private String cfop;
    private String inicioPrestacao;
    private String terminoPrestacao;
    private String placa;
    private String valorReceber;
    private String fretePorConta;
    private String pedagio;

    public NFe() {
        this.emitente =         "<NÃO INFORMADO>";
        this.destinatario =     "<NÃO INFORMADO>";
        this.cnpjEmitente =     "<NÃO INFORMADO>";
        this.cnpjDestinatario = "<NÃO INFORMADO>";
        this.tomador =          getDestinatario();
        this.valorMercadoria =  "<NÃO INFORMADO>";
        this.peso =             "<NÃO INFORMADO>";
        this.numNota =          "<NÃO INFORMADO>";
        this.chaveNota =        "<NÃO INFORMADO>";
        this.cfop =             "<NÃO INFORMADO>";
        this.inicioPrestacao =  "<NÃO INFORMADO>";
        this.terminoPrestacao = "<NÃO INFORMADO>";
        this.placa =            "<NÃO INFORMADO>";
        this.valorReceber =     "<NÃO INFORMADO>";
        this.fretePorConta =    "<NÃO INFORMADO>";
        this.pedagio =          "<NÃO INFORMADO>";
    }

    
    
    public String getEmitente() {
        return emitente;
    }

    public void setEmitente(String emitente) {
        this.emitente = emitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getCnpjEmitente() {
        return cnpjEmitente;
    }

    public void setCnpjEmitente(String cnpjEmitente) {
        this.cnpjEmitente = cnpjEmitente;
    }

    public String getCnpjDestinatario() {
        return cnpjDestinatario;
    }

    public void setCnpjDestinatario(String cnpjDestinatario) {
        this.cnpjDestinatario = cnpjDestinatario;
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

    public String getValorReceber() {
        return valorReceber;
    }

    public void setValorReceber(String valorReceber) {
        this.valorReceber = valorReceber;
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
    
}
