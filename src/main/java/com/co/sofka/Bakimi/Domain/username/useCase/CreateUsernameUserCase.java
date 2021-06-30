/*package com.co.sofka.Bakimi.Domain.username.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Bakimi.Domain.username.Username;
import com.co.sofka.Bakimi.Domain.username.commands.CreateUsername;
import com.co.sofka.Bakimi.Domain.username.repository.IUsernameDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateUsernameUserCase  extends UseCase<RequestCommand<CreateUsername>, CreateUsernameUserCase.Response> {

    @Autowired
    private IUsernameDataRepository iUsernameDataRepository;

    @Override
    public void executeUseCase(RequestCommand<CreateUsername> createUsernameRequestCommand) {
     var command =createUsernameRequestCommand.getCommand();
     var username= new Username(command.IdUsuario(), command.Email(), command.TypeSkin(), command.Name());
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
*/
