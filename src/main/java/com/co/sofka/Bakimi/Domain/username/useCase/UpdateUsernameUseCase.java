package com.co.sofka.Bakimi.Domain.username.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Bakimi.Domain.username.Username;
import com.co.sofka.Bakimi.Domain.username.commands.UpdateUsername;
import com.co.sofka.Bakimi.Domain.username.repository.IUsernameDataRepository;
import com.co.sofka.Bakimi.Domain.username.repository.UsernameData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateUsernameUseCase extends UseCase<RequestCommand<UpdateUsername>, UpdateUsernameUseCase.Response> {

    @Autowired
    private IUsernameDataRepository data;
    @Override
    public void executeUseCase(RequestCommand<UpdateUsername> updateUsernameRequestCommand) {
        var command =updateUsernameRequestCommand.getCommand();
        var username = new Username(command.idUsuario(), command.name(), command.email(), command.typeSkin());
        data.save(transform(username));
        emit().onResponse(new Response(username));
    }

    public UsernameData transform(Username username){
        UsernameData usernameData = new UsernameData(username.getUsuarioId(), username.getName().value(), username.getEmail().value(), username.getTypeSkin().value());
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
