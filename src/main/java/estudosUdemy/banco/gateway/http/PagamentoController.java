package estudosUdemy.banco.gateway.http;

import estudosUdemy.banco.gateway.json.PagamentoJson;
import estudosUdemy.banco.gateway.json.RetornoJson;
import estudosUdemy.banco.service.pagamento.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
public class PagamentoController {

    @Autowired
    private PagamentoService pagamentoService;

    @RequestMapping(path = "/pagamentos", method = RequestMethod.POST)
    public ResponseEntity<RetornoJson> pagamento(@Valid @NotNull @RequestBody PagamentoJson pagamentoJson) {

        pagamentoService.pagamento(pagamentoJson);

        RetornoJson retorno = new RetornoJson();
        retorno.setMensagem("Pagamento Registrado com Sucesso");
        return new ResponseEntity<RetornoJson>(retorno, HttpStatus.OK);
    }
}
