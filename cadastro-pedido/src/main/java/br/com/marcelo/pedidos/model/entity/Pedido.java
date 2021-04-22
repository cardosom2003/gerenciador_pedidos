package br.com.marcelo.pedidos.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_colaborador")
    private Colaborador colaborador;

    @ManyToOne
    @JoinColumn(name = "id_servico")
    private Servico servico;

    @Column(name = "hora_pedido")
    private Integer horasPedido;

    @Column
    private BigDecimal imposto;

    @Column(name = "valor_pedido")
    private BigDecimal valorPedido;

    @Column
    private BigDecimal lucro;

    @Column(name = "data_pedido")
    private LocalDate dataPedido;

    @PrePersist
    public void prePersist(){
        setDataPedido(LocalDate.now());
    }
}
