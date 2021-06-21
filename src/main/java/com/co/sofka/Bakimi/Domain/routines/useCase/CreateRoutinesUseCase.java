package com.co.sofka.Bakimi.Domain.routines.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Bakimi.Domain.routines.Routines;
import com.co.sofka.Bakimi.Domain.routines.commands.CreateRoutines;
import com.co.sofka.Bakimi.Domain.routines.repository.IRoutineRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CreateRoutinesUseCase extends UseCase<RequestCommand<CreateRoutines>, CreateRoutinesUseCase.Response> {

    @Autowired
    private IRoutineRepository iRoutineRepository;

    @Override
    public void executeUseCase(RequestCommand<CreateRoutines> createRoutinesRequestCommand) {
            var command = createRoutinesRequestCommand.getCommand();
            var routines = new Routines(command.RoutinesId(), command.RoutinesName(), command.Products(), command.DescriptionRoutines(), command.IdUsuario(), command.TypeSkin());
            iRoutineRepository.save(routines);
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
    }
