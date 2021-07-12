package com.co.sofka.Bakimi.Domain.username.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Bakimi.Domain.username.Username;
import com.co.sofka.Bakimi.Domain.username.commands.CreateUsername;
import com.co.sofka.Bakimi.Domain.username.repository.IUsernameDataRepository;
import com.co.sofka.Bakimi.Domain.username.repository.UsernameData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateUsernameUserCase  extends UseCase<RequestCommand<CreateUsername>, CreateUsernameUserCase.Response> {

    @Autowired
    private IUsernameDataRepository data;

    @Override
    public void executeUseCase(RequestCommand<CreateUsername> createUsernameRequestCommand) {
        CreateUsername command =createUsernameRequestCommand.getCommand();
     Username username = new Username(command.idUsuario(), command.name(), command.email());
     data.save(transform(username));
     emit().onResponse(new Response(username));
    }

    public UsernameData transform(Username username){
        UsernameData usernameData = new UsernameData(username.getUsuarioId(), username.getName().value(), username.getEmail().value());
        return usernameData;
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

