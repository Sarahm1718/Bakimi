package com.co.sofka.Bakimi.Domain.routines.repository;

import com.co.sofka.Bakimi.Domain.routines.entity.Routines;
import com.co.sofka.Bakimi.Domain.routines.values.RoutinesId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoutineRepository extends CrudRepository<Routines, RoutinesId> {
}
