package com.Manusystems.Restaurante.Repository;

import com.Manusystems.Restaurante.Entity.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, String> {
}
