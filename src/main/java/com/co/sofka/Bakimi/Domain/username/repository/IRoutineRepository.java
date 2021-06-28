package com.co.sofka.Bakimi.Domain.username.repository;

import com.co.sofka.Bakimi.Domain.username.entity.Routines;
import com.co.sofka.Bakimi.Domain.username.values.RoutinesId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoutineRepository extends CrudRepository<Routines, RoutinesId> {
}
