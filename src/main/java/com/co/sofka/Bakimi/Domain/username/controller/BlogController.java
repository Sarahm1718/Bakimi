package com.co.sofka.Bakimi.Domain.username.controller;


import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Bakimi.Domain.username.commands.CreatePublication;
import com.co.sofka.Bakimi.Domain.username.repository.BlogData;
import com.co.sofka.Bakimi.Domain.username.useCase.TransformationBlogUseCase;
import com.co.sofka.Bakimi.Domain.username.values.IdPublication;
import com.co.sofka.Bakimi.Domain.username.useCase.CreatePublicationUseCase;
import com.co.sofka.Bakimi.Domain.username.values.IdUsuario;
import com.co.sofka.Bakimi.Domain.username.values.Tittle;
import com.co.sofka.Bakimi.Domain.username.values.Contents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class BlogController {
    @Autowired
    private CreatePublicationUseCase createPublicationUseCase;
    @Autowired
    private TransformationBlogUseCase transformationBlogUseCase;

    @PostMapping(value="api/save/{id}/{tittle}/{idUsuario}/{contents}")
    public String save(@PathVariable("id")String id,
                       @PathVariable("tittle")String tittle,
                       @PathVariable("idUsuario")String idUsuario,
                       @PathVariable("contents") String contents
                       ){
        var command = new CreatePublication(IdPublication.of(id), new Tittle(tittle), new IdUsuario(idUsuario), new Contents(contents));
        CreatePublicationUseCase.Response publicationCreated = executeUseCase(command);
        String string = "{"
                + "\"id\":" + "\""+publicationCreated.getResponse().identity()+"\""+ ","
                + "\"tittle\":" + "\""+publicationCreated.getResponse().getTittle().value()+"\""+ ","
                + "\"idUsuario\":" + "\""+publicationCreated.getResponse().getIdUsuario().value()+"\""+ ","
                + "\"contents\":" + "\""+publicationCreated.getResponse().getContents().value()
                +"}";
        return string;


    }

    private CreatePublicationUseCase.Response executeUseCase(CreatePublication command) {
        var events = UseCaseHandler.getInstance()
                .syncExecutor(createPublicationUseCase, new RequestCommand<>(command))
                .orElseThrow();
        var PublicationCreated = events;
        return PublicationCreated;
    }


    @GetMapping(value = "api/blog")
    public Iterable<BlogData> search(){ return (transformationBlogUseCase.search());
    }}




