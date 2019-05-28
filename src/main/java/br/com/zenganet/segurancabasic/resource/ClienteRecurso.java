package br.com.zenganet.segurancabasic.resource;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.zenganet.segurancabasic.model.Cliente;
import br.com.zenganet.segurancabasic.repository.ClienteRepository;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/clientes")
public class ClienteRecurso {

	@Autowired
	private ClienteRepository clienteRepository;

	@ApiOperation(value = "Buscar lista de cliente (Autenticado)", response = Cliente.class, responseContainer = "List" )
	@GetMapping
	public ResponseEntity<List<Cliente>> pesquisar() {
		List<Cliente> clientes = clienteRepository.findAll();
		return clientes.size() > 0 ? ResponseEntity.ok(clientes) : ResponseEntity.notFound().build();
	}

}
