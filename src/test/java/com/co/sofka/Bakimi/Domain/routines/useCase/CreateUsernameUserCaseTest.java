package com.co.sofka.Bakimi.Domain.routines.useCase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Bakimi.Domain.routines.commands.CreateUsername;
import com.co.sofka.Bakimi.Domain.routines.events.UsernameCreated;
import com.co.sofka.Bakimi.Domain.routines.values.Email;
import com.co.sofka.Bakimi.Domain.routines.values.IdUsuario;
import com.co.sofka.Bakimi.Domain.routines.values.Name;
import com.co.sofka.Bakimi.Domain.routines.values.TypeSkin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*class CreateUsernameUserCaseTest {
    @Test
    public void CreateUsernameTest(){
        var command = new CreateUsername(new Name("Name"), new Email("Email"), new TypeSkin("TypeSkin"), new IdUsuario("0"));
        UsernameCreated usernameCreated = executeUseCase(command);
        Assertions.assertEquals("0", usernameCreated.IdUsuario().value());
    }

    private UsernameCreated executeUseCase(CreateUsername command) {
        var usecase = new CreateUsernameUserCase();
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        var usernameCreated =(UsernameCreated) events.get(0);
        return usernameCreated;

    }

}*/