package com.bastian.restspringboot.models.dao;

import com.bastian.restspringboot.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
}
