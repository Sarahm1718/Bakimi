package com.co.sofka.Bakimi.Domain.username.useCase;

import com.co.sofka.Bakimi.Domain.username.entity.Routines;
import com.co.sofka.Bakimi.Domain.username.repository.IRoutineDataRepository;
import com.co.sofka.Bakimi.Domain.username.repository.RoutineData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransformationRoutinesUseCase {
    @Autowired
    public IRoutineDataRepository data;
    public RoutineData transform(Routines routines){
        RoutineData routineData= new RoutineData(routines.getIdRoutines(), routines.getRoutinesName().value(), routines.getDescriptionRoutines().value(), routines.getIdUsuario().value(), routines.getTypeSkin().value());
        return routineData;
    }
   public Iterable<RoutineData> searchRoutine(){
        return data.findAll();
   }
}
