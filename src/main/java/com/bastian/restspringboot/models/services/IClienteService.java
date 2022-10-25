package com.bastian.restspringboot.models.services;

import com.bastian.restspringboot.models.entity.Cliente;

import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();
    public Cliente save (Cliente cliente);
    public void delete(Long id);
    public Cliente findByid (Long id);
}
