package com.co.sofka.Bakimi.Domain.routines.useCase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Bakimi.Domain.routines.Routines;
import com.co.sofka.Bakimi.Domain.routines.commands.CreateRoutines;
import com.co.sofka.Bakimi.Domain.routines.events.RoutinesCreated;
import com.co.sofka.Bakimi.Domain.routines.repository.IRoutineRepository;
import com.co.sofka.Bakimi.Domain.routines.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import static org.junit.jupiter.api.Assertions.*;

/*@RunWith(MockitoJUnitRunner.class)
public class CreateRoutinesUseCaseTest {
    @Autowired
    private CreateRoutinesUseCase useCase;

    @InjectMocks
    private IRoutineRepository iRoutineRepository;

    @InjectMocks
    private CrudRepository crudRepository;

    @Test
    public void createRoutinesUseCaseTest(){
        Mockito.when(crudRepository.saveAll(any())).thenReturn(new Routines(RoutinesId.of("123"), new RoutinesName("Noche"), new ))

        */
