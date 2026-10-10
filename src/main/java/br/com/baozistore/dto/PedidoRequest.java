package br.com.baozistore.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

/** Corpo JSON esperado no POST/PUT de /pedidos (igual aos atributos do DER). */
public class PedidoRequest {

    @NotNull(message = "clienteId e obrigatorio")
    private Long clienteId;

    @NotNull(message = "produtoId e obrigatorio")
    private Long produtoId;

    @NotNull(message = "quantidade e obrigatoria")
    @Min(value = 1, message = "A quantidade deve ser no minimo 1")
    private Integer quantidade;

    public Long getClienteId() { return clienteId; }
    public void setClienteId(Long clienteId) { this.clienteId = clienteId; }

    public Long getProdutoId() { return produtoId; }
    public void setProdutoId(Long produtoId) { this.produtoId = produtoId; }

    public Integer getQuantidade() { return quantidade; }
    public void setQuantidade(Integer quantidade) { this.quantidade = quantidade; }
}
