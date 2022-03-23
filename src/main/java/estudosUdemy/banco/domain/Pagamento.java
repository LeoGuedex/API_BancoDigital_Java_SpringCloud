package estudosUdemy.banco.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pagamento")
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Cartao cartao;

    private Double valorCompra;

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }
    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }
}
