package br.com.marcelo.pedidos.model.repository;

import br.com.marcelo.pedidos.model.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
