/*package com.co.sofka.Bakimi.Domain.username.controller;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Bakimi.Domain.username.commands.CreateUsername;
import com.co.sofka.Bakimi.Domain.username.useCase.CreateUsernameUserCase;
import com.co.sofka.Bakimi.Domain.username.values.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class UsernameController{

    @Autowired
    private CreateUsernameUserCase useCase;

    @PostMapping(value = "api/{idUsuario}/{name}/{email}/{typeSkin}")
    public String save(@PathVariable("idUsuario") String idUsuario,
                       @PathVariable("name") String name,
                       @PathVariable("email") String email,
                       @PathVariable("typeSkin") String TypeSkin
    ) {
        var command = new CreateUsername(IdUsuario.of(idUsuario), new Email(email), new TypeSkin(TypeSkin), new Name(name));
       CreateUsernameUserCase.Response usernameCreated = executedUseCase(command);
        return (usernameCreated.getResponse().getEmail().value()+ " "+usernameCreated.getResponse().getIdUsuario().value()+ " "+usernameCreated.getResponse().getTypeSkin()+ " "+usernameCreated.getResponse().getName());

    }
    private CreateUsernameUserCase.Response executedUseCase(CreateUsername command) {
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();
        var usernameCreated = events;
        return usernameCreated;
    }


}*/




