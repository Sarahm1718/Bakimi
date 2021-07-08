package com.co.sofka.Bakimi.Domain.username.controller;


import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Bakimi.Domain.username.commands.CreatePublication;
import com.co.sofka.Bakimi.Domain.username.commands.UpdatePublication;
import com.co.sofka.Bakimi.Domain.username.repository.BlogData;
import com.co.sofka.Bakimi.Domain.username.repository.UsernameData;
import com.co.sofka.Bakimi.Domain.username.useCase.TransformationBlogUseCase;
import com.co.sofka.Bakimi.Domain.username.useCase.UpdateBlogUseCase;
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

    @Autowired
    private UpdateBlogUseCase updateBlogUseCase;

    @PostMapping(value="api/guarder/{idb}/{tittle}/{idUsuario}/{contents}")
    public String guarder(@PathVariable("idb")String idb,
                       @PathVariable("tittle")String tittle,
                       @PathVariable("idUsuario")String idUsuario,
                       @PathVariable("contents") String contents
                       ){
        CreatePublication command = new CreatePublication(IdPublication.of(idb), new Tittle(tittle), new IdUsuario(idUsuario), new Contents(contents));
        CreatePublicationUseCase.Response publicationCreated = executeUseCase(command);
        String string = "{"
                + "\"idb\":" + "\""+publicationCreated.getResponse().identity()+"\""+ ","
                + "\"tittle\":" + "\""+publicationCreated.getResponse().getTittle().value()+"\""+ ","
                + "\"idUsuario\":" + "\""+publicationCreated.getResponse().getIdUsuario().value()+"\""+ ","
                + "\"contents\":" + "\""+publicationCreated.getResponse().getContents().value()
                +"}";
        return string;
    }
    private CreatePublicationUseCase.Response executeUseCase(CreatePublication command) {
        CreatePublicationUseCase.Response events = UseCaseHandler.getInstance()
                .syncExecutor(createPublicationUseCase, new RequestCommand<>(command))
                .orElseThrow();
        CreatePublicationUseCase.Response PublicationCreated = events;
        return PublicationCreated;
    }

    @PutMapping(value="api/updateblog/{idb}/{tittle}/{idUsuario}/{contents}")
    public String updateblog(@PathVariable("idb")String idb,
                          @PathVariable("tittle")String tittle,
                          @PathVariable("idUsuario")String idUsuario,
                          @PathVariable("contents") String contents
    ){
        UpdatePublication command = new UpdatePublication(IdPublication.of(idb), new Tittle(tittle), new IdUsuario(idUsuario), new Contents(contents));
        UpdateBlogUseCase.Response publicationUpdated = executeUseCase(command);
        String string = "{"
                + "\"idb\":" + "\""+publicationUpdated.getResponse().identity()+"\""+ ","
                + "\"tittle\":" + "\""+publicationUpdated.getResponse().getTittle().value()+"\""+ ","
                + "\"idUsuario\":" + "\""+publicationUpdated.getResponse().getIdUsuario().value()+"\""+ ","
                + "\"contents\":" + "\""+publicationUpdated.getResponse().getContents().value()
                +"}";
        return string;
    }
    private UpdateBlogUseCase.Response executeUseCase(UpdatePublication command) {
        UpdateBlogUseCase.Response events = UseCaseHandler.getInstance()
                .syncExecutor(updateBlogUseCase, new RequestCommand<>(command))
                .orElseThrow();
        UpdateBlogUseCase.Response PublicationUpdated = events;
        return (UpdateBlogUseCase.Response) PublicationUpdated;
    }
    @GetMapping(value = "api/blog")
    public Iterable<BlogData> search(){ return (transformationBlogUseCase.search());
    }

    @GetMapping(value = "api/searchId/{idb}")
    public BlogData searchId(@PathVariable("idb") String idb) {
        return (transformationBlogUseCase.searchId(idb));
    }
    @DeleteMapping(value = "api/deletepublication/{idb}")
    public String delete(@PathVariable("idb") String idb){
        return (transformationBlogUseCase.delete(idb));
    }



}




