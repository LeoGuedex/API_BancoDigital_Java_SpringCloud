package estudosUdemy.banco.gateway.repository;

import estudosUdemy.banco.domain.Pagamento;
import org.springframework.data.repository.CrudRepository;

public interface PagamentoRepository extends CrudRepository<Pagamento, Long> {
}
