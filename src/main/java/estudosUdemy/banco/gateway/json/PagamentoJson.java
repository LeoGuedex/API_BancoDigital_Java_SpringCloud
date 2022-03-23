package estudosUdemy.banco.gateway.json;


import javax.validation.constraints.NotNull;

public class PagamentoJson {

    @NotNull(message = "Número do cartão é Obrigatório")
    private Integer nroCartao;

    @NotNull(message = "Código de Seguranca do cartão é Obrigatório")
    private Integer codigoSegurancaCartao;

    @NotNull(message = "valor de compra é Obrigatório")
    private Double valorCompra;

    public Integer getNroCartao() {
        return nroCartao;
    }

    public void setNroCartao(Integer nroCartao) {
        this.nroCartao = nroCartao;
    }

    public Integer getCodigoSegurancaCartao() {
        return codigoSegurancaCartao;
    }

    public void setCodigoSegurancaCartao(Integer codigoSegurancaCartao) {
        this.codigoSegurancaCartao = codigoSegurancaCartao;
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }
}
