package br.com.baozistore.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome do cliente e obrigatorio")
    @Column(nullable = false)
    private String nome;

    @Column(name = "cliente_desde", nullable = false)
    private LocalDate clienteDesde;

    public Cliente() {
    }

    public Cliente(String nome, LocalDate clienteDesde) {
        this.nome = nome;
        this.clienteDesde = clienteDesde;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public LocalDate getClienteDesde() { return clienteDesde; }
    public void setClienteDesde(LocalDate clienteDesde) { this.clienteDesde = clienteDesde; }
}
