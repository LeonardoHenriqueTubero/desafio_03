package com.leonardo.desafio_03.services;

import com.leonardo.desafio_03.dto.ClientDTO;
import com.leonardo.desafio_03.entities.Client;
import com.leonardo.desafio_03.repositories.ClientRepository;
import com.leonardo.desafio_03.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    private ClientRepository repository;

    @Autowired
    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client result = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Recurso não encontrado."));
        return new ClientDTO(result);
    }

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable pageable) {
        Page<Client> result = repository.findAll(pageable);
        return result.map(ClientDTO::new);
    }

    private void dtoToEntity(Client entity, ClientDTO dto) {
        entity.setName(dto.getName());
        entity.setCPF(dto.getCPF());
        entity.setIncome(dto.getIncome());
        entity.setBirthDate(dto.getBirthDate());
        entity.setChildren(dto.getChildren());
    }
}

