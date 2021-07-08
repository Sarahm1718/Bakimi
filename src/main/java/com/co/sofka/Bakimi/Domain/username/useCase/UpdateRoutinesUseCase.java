package com.co.sofka.Bakimi.Domain.username.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Bakimi.Domain.username.commands.UpdateRoutines;
import com.co.sofka.Bakimi.Domain.username.entity.Routines;
import com.co.sofka.Bakimi.Domain.username.repository.IRoutineDataRepository;
import com.co.sofka.Bakimi.Domain.username.repository.RoutineData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateRoutinesUseCase extends UseCase<RequestCommand<UpdateRoutines>, UpdateRoutinesUseCase.Response> {

    @Autowired
    private IRoutineDataRepository data;

    @Override
    public void executeUseCase(RequestCommand<UpdateRoutines> updateRoutinesRequestCommand) {

        UpdateRoutines command = updateRoutinesRequestCommand.getCommand();
        Routines routines = new Routines(command.routinesId(), command.routinesName(), command.descriptionRoutines(), command.idUsuario(), command.typeSkin());
        data.save(transform(routines));
        emit().onResponse(new Response(routines));
    }
    public RoutineData transform(Routines routines){
        RoutineData routineData = new RoutineData(routines.getIdRoutines(), routines.getRoutinesName().value(), routines.getDescriptionRoutines().value(), routines.getIdUsuario().value(), routines.getTypeSkin().value());
        return routineData;
    }

    public static class Response implements UseCase.ResponseValues{

        private Routines response;


        public Response(Routines routines) {
            this.response=routines;
        }

        public Routines getResponse() {
            return response;
        }

        public void setResponse(Routines response) {
            this.response = response;
        }
    }
}
