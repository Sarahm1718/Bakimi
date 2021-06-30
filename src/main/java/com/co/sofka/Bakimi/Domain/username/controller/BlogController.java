package com.co.sofka.Bakimi.Domain.username.controller;


import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Bakimi.Domain.username.commands.CreatePublication;
import com.co.sofka.Bakimi.Domain.username.repository.BlogData;
import com.co.sofka.Bakimi.Domain.username.useCase.TransformationBlogUseCase;
import com.co.sofka.Bakimi.Domain.username.values.IdPublication;
import com.co.sofka.Bakimi.Domain.username.useCase.CreatePublicationUseCase;
import com.co.sofka.Bakimi.Domain.username.values.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;

@RestController
@CrossOrigin(origins = "*")
public class BlogController {
    @Autowired
    private CreatePublicationUseCase useCase;
    @Autowired
    private TransformationBlogUseCase transformationBlogUseCase;

    @PostMapping(value="api/{idPublication}/{idUsuario}/{tittle}/{idCommentary}/{contents}")
    public String save(@PathVariable("idPublication")String idPublication,
                       @PathVariable("idUsuario")String idUsuario,
                       @PathVariable("tittle")String tittle,
                       @PathVariable("idCommentary") String idCommentary,
                       @PathVariable("contents") String contents
                       ){
        var command = new CreatePublication( IdPublication.of(idPublication), IdUsuario.of(idUsuario), new Tittle(tittle), IdCommentary.of(idCommentary), new Contents(contents));
        CreatePublicationUseCase.Response publicationCreated = executedUseCase(command);
        String string="{"
                + "\"idPublication\":" + "\""+publicationCreated.getResponse().identity()+"\""+ ","
                + "\"idUsuario\":" + "\""+publicationCreated.getResponse().getIdUsuario()+"\""+ ","
                + "\"tittle\":" + "\""+publicationCreated.getResponse().getTittle()+"\""+ ","
                + "\"idCommentary\":" + "\""+publicationCreated.getResponse().getIdCommentary()+"\""+ ","
                + "\"contents\":" + "\""+publicationCreated.getResponse().getContents()
                +"}";
        return string;

    }


    private CreatePublicationUseCase.Response executedUseCase(CreatePublication command) {
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();
        var PublicationCreated = events;
        return PublicationCreated;
    }

    @GetMapping(value = "api/blog")
    public Iterable<BlogData> search(){ return (transformationBlogUseCase.search());
    }}




