package com.bastian.restspringboot.models.services;

import com.bastian.restspringboot.models.dao.IClienteDao;
import com.bastian.restspringboot.models.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService{

    @Autowired
    private IClienteDao clienteDao;
    @Override
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    public Cliente save(Cliente cliente) {
        return clienteDao.save(cliente);
    }

    @Override
    public void delete(Long id) {
        clienteDao.deleteById(id);
    }

    @Override
    public Cliente findByid(Long id) {
        return clienteDao.findById(id).orElse(null);
    }
}
