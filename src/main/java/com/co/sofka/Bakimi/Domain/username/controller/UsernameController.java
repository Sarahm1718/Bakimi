package com.co.sofka.Bakimi.Domain.username.controller;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Bakimi.Domain.username.commands.CreateUsername;
import com.co.sofka.Bakimi.Domain.username.commands.UpdateUsername;
import com.co.sofka.Bakimi.Domain.username.repository.UsernameData;
import com.co.sofka.Bakimi.Domain.username.useCase.CreateUsernameUserCase;
import com.co.sofka.Bakimi.Domain.username.useCase.TranformationUsernameUseCase;
import com.co.sofka.Bakimi.Domain.username.useCase.UpdateUsernameUseCase;
import com.co.sofka.Bakimi.Domain.username.values.Email;
import com.co.sofka.Bakimi.Domain.username.values.IdUsuario;
import com.co.sofka.Bakimi.Domain.username.values.Name;
import com.co.sofka.Bakimi.Domain.username.values.TypeSkin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class UsernameController {

    @Autowired
    private CreateUsernameUserCase createUsernameUserCase;

    @Autowired
    private UpdateUsernameUseCase updateUsernameUseCase;

    @Autowired
    private TranformationUsernameUseCase tranformationUsernameUseCase;

    @PostMapping(value= "api/save/{id}/{name}/{email}/{typeSkin}")
    public String save(
            @PathVariable("id")String id,
            @PathVariable("name")String name,
            @PathVariable("email")String email,
            @PathVariable("typeSkin")String typeSkin){
        CreateUsername command = new CreateUsername(IdUsuario.of(id), new Name(name), new Email(email), new TypeSkin(typeSkin));
        CreateUsernameUserCase.Response usernameCreated = executedUseCase(command);

        String string = "{"
                + "\"id\":" + "\""+usernameCreated.getResponse().identity()+"\""+ ","
                + "\"name\":" + "\""+usernameCreated.getResponse().getName().value()+"\""+ ","
                + "\"email\":" + "\""+usernameCreated.getResponse().getEmail().value()+"\""+ ","
                + "\"typeSkin\":" + "\""+usernameCreated.getResponse().getTypeSkin().value()
                +"}";
        return string;
    }

    private CreateUsernameUserCase.Response executedUseCase(CreateUsername command) {
        CreateUsernameUserCase.Response events = UseCaseHandler.getInstance()
                .syncExecutor(createUsernameUserCase, new RequestCommand<>(command))
                .orElseThrow();
        CreateUsernameUserCase.Response UsernameCreated = events;
        return UsernameCreated;
    }

    @PutMapping(value = "api/update/{id}/{name}/{email}/{typeSkin}")
    public String update(
            @PathVariable("id")String id,
            @PathVariable("name")String name,
            @PathVariable("email")String email,
            @PathVariable("typeSkin")String typeSkin) {
        UpdateUsername command = new UpdateUsername(IdUsuario.of(id), new Name(name), new Email(email), new TypeSkin(typeSkin));
        UpdateUsernameUseCase.Response usernameUpdated = executedUseCase(command);

        String string = "{"
                + "\"id\":" + "\""+usernameUpdated.getResponse().identity()+"\""+ ","
                + "\"name\":" + "\""+usernameUpdated.getResponse().getName().value()+"\""+ ","
                + "\"email\":" + "\""+usernameUpdated.getResponse().getEmail().value()+"\""+ ","
                + "\"typeSkin\":" + "\""+usernameUpdated.getResponse().getTypeSkin().value()
                +"}";
        return string;

    }
    private UpdateUsernameUseCase.Response executedUseCase(UpdateUsername command){
        UpdateUsernameUseCase.Response events = UseCaseHandler.getInstance()
                .syncExecutor(updateUsernameUseCase, new RequestCommand<>(command))
                .orElseThrow();
        UpdateUsernameUseCase.Response UsernameUpdated = events;
        return (UpdateUsernameUseCase.Response) UsernameUpdated;
    }
    @GetMapping(value = "api/username")
    public Iterable<UsernameData> searchUsername(){
        return (tranformationUsernameUseCase.searchUsername());
    }

    @GetMapping(value = "api/searchUsername/{id}")
    public UsernameData searchUsernameId(@PathVariable("id") String id) {
        return (tranformationUsernameUseCase.searchUsernameId(id));
    }
    @DeleteMapping(value = "api/delete/{id}")
    public String delete(@PathVariable("id") String id){
        return (tranformationUsernameUseCase.delete(id));
    }

}
