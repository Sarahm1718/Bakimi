package com.co.sofka.Bakimi.Domain.routines.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.co.sofka.Bakimi.Domain.routines.Username;
import com.co.sofka.Bakimi.Domain.routines.commands.CreateUsername;
import com.co.sofka.Bakimi.Domain.routines.repository.IRoutineRepository;
import com.co.sofka.Bakimi.Domain.routines.repository.IUsernameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateUsernameUserCase  extends UseCase<RequestCommand<CreateUsername>, CreateUsernameUserCase.Response> {

    @Autowired
    private IUsernameRepository iUsernameRepository;

    @Override
    public void executeUseCase(RequestCommand<CreateUsername> createUsernameRequestCommand) {
        var command = createUsernameRequestCommand.getCommand();
        var username = new Username(command.IdUsuario(), command.Name(), command.Email(), command.TypeSkin());
        iUsernameRepository.save(username);
        emit().onResponse(new Response(username));

    }
    public static class Response implements UseCase.ResponseValues{

        private Username response;


        public Response(Username username) {
            this.response=username;
        }

        public Username getResponse() {
            return response;
        }

        public void setResponse(Username response) {
            this.response = response;
        }
    }
}

