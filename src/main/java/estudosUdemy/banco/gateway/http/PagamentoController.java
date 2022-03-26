package estudosUdemy.banco.gateway.http;

import estudosUdemy.banco.gateway.json.PagamentoJson;
import estudosUdemy.banco.gateway.json.RetornoJson;
import estudosUdemy.banco.service.pagamento.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController()
@RequestMapping(value = "/pagamento")
public class PagamentoController {

    @Autowired
    private PagamentoService pagamentoService;

    @PostMapping
    public ResponseEntity<RetornoJson> pagamento(@Valid @NotNull @RequestBody PagamentoJson pagamentoJson) {

        pagamentoService.pagamento(pagamentoJson);

        RetornoJson retorno = new RetornoJson();
        retorno.setMensagem("Pagamento Registrado com Sucesso");
        return new ResponseEntity<RetornoJson>(retorno, HttpStatus.OK);
    }
}
