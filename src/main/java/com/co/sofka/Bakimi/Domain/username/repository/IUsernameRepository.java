package com.co.sofka.Bakimi.Domain.username.repository;

import com.co.sofka.Bakimi.Domain.username.Username;
import com.co.sofka.Bakimi.Domain.username.values.IdUsuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsernameRepository extends CrudRepository<Username, IdUsuario> {
}
