package com.segurosAg.sergurosAr.repository;

import com.segurosAg.sergurosAr.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
}
