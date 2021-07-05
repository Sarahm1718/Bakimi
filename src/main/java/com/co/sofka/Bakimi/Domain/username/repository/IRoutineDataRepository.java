package com.co.sofka.Bakimi.Domain.username.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoutineDataRepository extends CrudRepository<RoutineData, String> {

}
