package com.co.sofka.Bakimi.Domain.routines.controller;


import com.co.sofka.Bakimi.Domain.routines.commands.CreatePublication;
import com.co.sofka.Bakimi.Domain.routines.useCase.CreatePublicationUseCase;
import com.co.sofka.Bakimi.Domain.routines.useCase.CreateRoutinesUseCase;
import com.co.sofka.Bakimi.Domain.routines.values.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/*@RestController
@CrossOrigin(origins = "*")
public class BlogController {
    @Autowired
    private CreatePublicationUseCase useCase;

    @PostMapping(value="api/{idPublication}/{idUsuario}/{tittle}/{idCommentary}/{contents}")
    public String save(@PathVariable("idPublication")String idPublication,
                           @PathVariable("idUsuario")String idUsuario,
                       @PathVariable("tittle")String tittle,
                       @PathVariable("idCommentary") String idCommentary,
                       @PathVariable("contents") String contents
                       ){
        var command = new CreatePublication(new IdCommentary(idCommentary), new IdUsuario(idUsuario), new Tittle(tittle), new Contents(contents), IdPublication.of(idPublication));
        CreateRoutinesUseCase.Response publicationCreated = executedUseCase(command);
        return (publicationCreated.getResponse().

    }

    private CreateRoutinesUseCase.Response executedUseCase(CreatePublication command) {
    }

}*/
