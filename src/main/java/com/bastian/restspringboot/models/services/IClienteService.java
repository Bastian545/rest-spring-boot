package com.bastian.restspringboot.models.services;

import com.bastian.restspringboot.models.entity.Cliente;

import java.util.List;

public interface IClienteService {
     List<Cliente> findAll();
     Cliente save (Cliente cliente);
     void delete(Long id);
     Cliente findByid (Long id);
}
