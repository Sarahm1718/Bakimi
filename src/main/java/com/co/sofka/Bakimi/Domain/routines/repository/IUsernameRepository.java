package com.co.sofka.Bakimi.Domain.routines.repository;

import com.co.sofka.Bakimi.Domain.routines.Username;
import com.co.sofka.Bakimi.Domain.routines.values.IdUsuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsernameRepository extends CrudRepository<Username, IdUsuario> {

}
