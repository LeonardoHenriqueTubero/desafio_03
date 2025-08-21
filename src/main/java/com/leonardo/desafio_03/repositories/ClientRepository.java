package com.leonardo.desafio_03.repositories;

import com.leonardo.desafio_03.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
