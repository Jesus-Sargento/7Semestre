package com.Manusystems.Restaurante.Controller;

import com.Manusystems.Restaurante.Entity.Cliente;
import com.Manusystems.Restaurante.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    // Listar todos los clientes
    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    // Obtener cliente por ID
    @GetMapping("/{id}")
    public Optional<Cliente> getClienteById(@PathVariable String id) {
        return clienteRepository.findById(id);
    }

    // Crear nuevo cliente
    @PostMapping
    public Cliente createCliente(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Actualizar cliente
    @PutMapping("/{id}")
    public Cliente updateCliente(@PathVariable String id, @RequestBody Cliente cliente) {
        cliente.setId(id);
        return clienteRepository.save(cliente);
    }

    // Eliminar cliente
    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable String id) {
        clienteRepository.deleteById(id);
    }
}
