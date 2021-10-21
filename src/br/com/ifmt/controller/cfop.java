package br.com.ifmt.controller;

/**
 *
 * @author TADS
 */
public enum Cfop {
    
     _1414("1414 - Retorno de produção do estabelecimento, remetida para venda fora do estabelecimento em operação com produto sujeito ao regime de substituição tributária.")
    ,_1415("1415 - Retorno de mercadoria adquirida ou recebida de terceiros, remetida para venda fora do estabelecimento em operação com mercadoria sujeita ao regime de substituição tributária.")
    ,_1452("1452 - Retorno de insumo não utilizado na produção.")
    ,_1902("1902 - Retorno de mercadoria remetida para industrialização por encomenda.")
    ,_1904("1904 - Retorno de remessa para venda fora do estabelecimento.")
    ,_1906("1906 - Retorno de mercadoria remetida para depósito fechado ou armazém geral.")
    ,_1907("1907 - Retorno simbólico de mercadoria remetida para depósito fechado ou armazém geral.")
    ,_1909("1909 - Retorno de bem remetido por conta de contrato de comodato.")
    ,_1925("1925 - Retorno de mercadoria remetida para industrialização por conta e ordem do adquirente da mercadoria, quando esta não transitar pelo estabelecimento do adquirente.")
    ,_2414("2414 - Retorno de produção do estabelecimento, remetida para venda fora do estabelecimento em operação com produto sujeito ao regime de substituição tributária.")
    ,_2415("2415 - Retorno de mercadoria adquirida ou recebida de terceiros, remetida para venda fora do estabelecimento em operação com mercadoria sujeita ao regime de substituição tributária.")
    ,_2902("2902 - Retorno de mercadoria remetida para industrialização por encomenda.")
    ,_2904("2904 - Retorno de remessa para venda fora do estabelecimento.")
    ,_2906("2906 - Retorno de mercadoria remetida para depósito fechado ou armazém geral.")
    ,_2907("2907 - Retorno simbólico de mercadoria remetida para depósito fechado ou armazém geral.")
    ,_2909("2909 - Retorno de bem remetido por conta de contrato de comodato.")
    ,_2925("2925 - Retorno de mercadoria remetida para industrialização por conta e ordem do adquirente da mercadoria, quando esta não transitar pelo estabelecimento do adquirente.")
    ,_5902("5902 - Retorno de mercadoria utilizada na industrialização por encomenda.")
    ,_5903("5903 - Retorno de mercadoria recebida para industrialização e não aplicada no referido processo.")
    ,_5906("5906 - Retorno de mercadoria depositada em depósito fechado ou armazém geral.")
    ,_5907("5907 - Retorno simbólico de mercadoria depositada em depósito fechado ou armazém geral.")
    ,_5909("5909 - Retorno de bem recebido por conta de contrato de comodato.")
    ,_5925("5925 - Retorno de mercadoria recebida para industrialização por conta e ordem do adquirente da mercadoria, quando aquela não transitar pelo estabelecimento do adquirente.")
    ,_6902("6902 - Retorno de mercadoria utilizada na industrialização por encomenda.")
    ,_6903("6903 - Retorno de mercadoria recebida para industrialização e não aplicada no referido processo.")
    ,_6906("6906 - Retorno de mercadoria depositada em depósito fechado ou armazém geral.")
    ,_6907("6907 - Retorno simbólico de mercadoria depositada em depósito fechado ou armazém geral.")
    ,_6909("6909 - Retorno de bem recebido por conta de contrato de comodato.")
    ,_6925("6925 - Retorno de mercadoria recebida para industrialização por conta e ordem do adquirente da mercadoria, quando aquela não transitar pelo estabelecimento do adquirente.")
    ,_1150("1150 - Transferência para Industrialização, comercialização ou prestação de serviços.")
    ,_1151("1151 - Transferência para industrialização ou produção rural.")
    ,_1152("1152 - Transferência para comercialização.")
    ,_1154("1154 - Transferência para utilização na prestação de serviço.")
    ,_1408("1408 - Transferência para industrialização ou produção rural em operação com mercadoria sujeita ao regime de substituição tributária.")
    ,_1409("1409 - Transferência para comercialização em operação com mercadoria sujeita ao regime de substituição tributária.")
    ,_1557("1557 - Transferência de material para uso ou consumo.")
    ,_2150("1150 - Transferência para Industrialização, comercialização ou prestação de serviços.")
    ,_2151("2151 - Transferência para industrialização ou produção rural.")
    ,_2152("2152 - Transferência para comercialização.")
    ,_2154("2154 - Transferência para utilização na prestação de serviço.")
    ,_2408("2408 - Transferência para industrialização ou produção rural em operação com mercadoria sujeita ao regime de substituição tributária.")
    ,_2409("2409 - Transferência para comercialização em operação com mercadoria sujeita ao regime de substituição tributária.")
    ,_2557("2557 - Transferência de material para uso ou consumo.")
    ,_5152("5152 - Transferência de mercadoria adquirida ou recebida de terceiros.")
    ,_5156("5156 - Transferência de mercadoria adquirida ou recebida de terceiros, que não deva por ele transitar.")
    ,_5408("5408 - Transferência de produção do estabelecimento em operação com produto sujeito ao regime de substituição tributária.")
    ,_5409("5409 - Transferência de mercadoria adquirida ou recebida de terceiros em operação com mercadoria sujeita ao regime de substituição tributária.")
    ,_5557("5557 - Transferência de material de uso ou consumo.")
    ,_6150("6150 - Transferências de produção propria ou de terceiros.")
    ,_6152("6152 - Transferência de mercadoria adquirida ou recebida de terceiros.")
    ,_6155("6155 - Transferência de produção do estabelecimento, que não deva por ele transitar.")
    ,_6156("6156 - Transferência de mercadoria adquirida ou recebida de terceiros, que não deva por ele transitar.")
    ,_6408("6408 - Transferência de produção do estabelecimento em operação com produto sujeito ao regime de substituição tributária.")
    ,_6409("6409 - Transferência de mercadoria adquirida ou recebida de terceiros em operação com mercadoria sujeita ao regime de substituição tributária.")
    ,_6557("6557 - Transferência de material de uso ou consumo.")
    ,_1200("1200 - Devoluções de vendas de produção própria, de terceiros ou anulações de valores.")
    ,_1202("1202 - Devolução de venda de mercadoria adquirida ou recebida de terceiros.")
    ,_1208("1208 - Devolução de produção do estabelecimento, remetida em transferência.")
    ,_1209("1209 - Devolução de mercadoria adquirida ou recebida de terceiros, remetida em transferência.")
    ,_1410("1410 - Devolução de venda de produção do estabelecimento em operação com produto sujeito ao regime de substituição tributária.")
    ,_1411("1411 - Devolução de venda de mercadoria adquirida ou recebida de terceiros em operação com mercadoria sujeita ao regime de substituição tributária.")
    ,_2200("2200 - Devoluções de vendas de produção própria, de terceiros ou anulações de valores.")
    ,_2202("2202 - Devolução de venda de mercadoria adquirida ou recebida de terceiros.")
    ,_2208("2208 - Devolução de produção do estabelecimento, remetida em transferência.")
    ,_2209("2209 - Devolução de mercadoria adquirida ou recebida de terceiros, remetida em transferência.")
    ,_2410("2410 - Devolução de venda de produção do estabelecimento em operação com produto sujeito ao regime de substituição tributária.")
    ,_2411("2411 - Devolução de venda de mercadoria adquirida ou recebida de terceiros em operação com mercadoria sujeita ao regime de substituição tributária.")
    ,_2918("2918 - Devolução de mercadoria remetida em consignação mercantil ou industrial.")
    ,_2919("2919 - Devolução simbólica de mercadoria vendida ou utilizada em processo industrial, remetida anteriormente em consignação mercantil ou industrial")
    ,_3200("1200 - Devoluções de vendas de produção própria, de terceiros ou anulações de valores.")
    ,_3202("3202 - Devolução de venda de mercadoria adquirida ou recebida de terceiros.")
    ,_3553("3553 - Devolução de venda de bem do ativo imobilizado.")
    ,_5200("5200 - Devoluções de compras para industrialização, comercialização ou anulações de valores.")
    ,_5202("5202 - Devolução de compra para comercialização.")
    ,_5209("5209 - Devolução de mercadoria recebida em transferência para comercialização")
    ,_5411("5411 - Devolução de compra para comercialização em operação com mercadoria sujeita ao regime de substituição tributária.")
    ,_5918("5918 - Devolução de mercadoria recebida em consignação mercantil ou industrial.")
    ,_5919("5919 - Devolução simbólica de mercadoria vendida ou utilizada em processo industrial, recebida anteriormente em consignação mercantil ou industrial.")
    ,_6200("6200 - Devoluções de compras para industrializaçõa, comercialização ou anulações de valores.")
    ,_6202("6202 - Devolução de compra para comercialização.")
    ,_6208("6208 - Devolução de mercadoria recebida em transferência para industrialização ou produção rural.")
    ,_6209("6209 - Devolução de mercadoria recebida em transferência para comercialização.")
    ,_6410("6410 - Devolução de compra para industrialização ou produção rural em operação com mercadoria sujeita ao regime de substituição tributária.")
    ,_6411("6411 - Devolução de compra para comercialização em operação com mercadoria sujeita ao regime de substituição tributária.")
    ,_6413("6413 - Devolução de mercadoria destinada ao uso ou consumo, em operação com mercadoria sujeita ao regime de substituição tributária.")
    ,_6556("6556 - Devolução de compra de material de uso ou consumo.")
    ,_6918("6918 - Devolução de mercadoria recebida em consignação mercantil ou industrial.")
    ,_6919("6919 - Devolução simbólica de mercadoria vendida ou utilizada em processo industrial, recebida anteriormente em consignação mercantil ou industrial.")
    //6353 e 6352 são exclusivas do CTe
    ,_6352("6352 - Prestação de serviço de transporte a estabelecimento industrial.")
    ,_6353("6353 - Prestação de serviço de transporte a estabelecimento comercial.");

    public String descricao;

    Cfop(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
