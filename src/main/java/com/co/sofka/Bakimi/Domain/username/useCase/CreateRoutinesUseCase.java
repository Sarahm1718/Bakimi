package com.co.sofka.Bakimi.Domain.username.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Bakimi.Domain.username.entity.Routines;
import com.co.sofka.Bakimi.Domain.username.commands.CreateRoutines;
/*import com.co.sofka.Bakimi.Domain.username.repository.IRoutineDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CreateRoutinesUseCase extends UseCase<RequestCommand<CreateRoutines>, CreateRoutinesUseCase.Response> {

    @Autowired
    private IRoutineDataRepository iRoutineDataRepository;

    @Override
    public void executeUseCase(RequestCommand<CreateRoutines> createRoutinesRequestCommand) {
            var command = createRoutinesRequestCommand.getCommand();
            var routines = new Routines(command.RoutinesId(), command.RoutinesName(), command.getDescriptionRoutines(), command.IdUsuario(), command.TypeSkin());
            iRoutineDataRepository.save(routines);
            emit().onResponse(new Response(routines));
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
    }*/