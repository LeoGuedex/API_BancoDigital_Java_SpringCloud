package estudosUdemy.banco.service.cartao;
import estudosUdemy.banco.domain.Cartao;
import estudosUdemy.banco.gateway.repository.CartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.math.BigDecimal;

@Service
public class CartaoService {

    @Autowired
    private CartaoRepository cartaoRepository;

    public boolean isValido(Integer codigoSegurancaCartao, Integer nroCartao) {
        return cartaoRepository.findCartaoValido(codigoSegurancaCartao, nroCartao) > 0;
    }

    public boolean isSaldoSuficiente(Integer codigoSegurancaCartao, Integer nroCartao, Integer valorCompra) {
        return cartaoRepository.isSaldoSuficiente(codigoSegurancaCartao, nroCartao, valorCompra) > 0;
    }

    public Cartao getCartao(Integer codigoSegurancaCartao, Integer nroCartao) {
        return cartaoRepository.findCartao(codigoSegurancaCartao, nroCartao);
    }

    @Transactional
    public void atualizarSaldo(Integer codigoSegurancaCartao, Integer nroCartao, Integer valorCompra) {
        cartaoRepository.atualizarSaldo(codigoSegurancaCartao, nroCartao, valorCompra);
    }

}
