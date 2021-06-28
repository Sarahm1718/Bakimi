package com.co.sofka.Bakimi.Domain.username.useCase;

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