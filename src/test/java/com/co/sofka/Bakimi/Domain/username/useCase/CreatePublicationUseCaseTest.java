package com.co.sofka.Bakimi.Domain.username.useCase;

/*class CreatePublicationUseCaseTest {
    @Test
    public void CreatePublicationTest(){
        var command = new CreatePublication(new IdCommentary("IdCommentary"), new IdUsuario("IdUsuario"), new Tittle("Tittle"), new Contents("Contents"), IdPublication.of("0"));
        PublicationCreated publicationCreated= executeUseCase(command);
        Assertions.assertEquals("0", publicationCreated.IdPublication().value());
    }
    private PublicationCreated executeUseCase(CreatePublication command){
        var usecase = new CreatePublicationUseCase();

        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        var publicationCreated =(PublicationCreated) events.get(0);
        return publicationCreated;
    }


}*/