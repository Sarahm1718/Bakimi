package com.co.sofka.Bakimi.Domain.username.useCase;

import com.co.sofka.Bakimi.Domain.username.Username;
import com.co.sofka.Bakimi.Domain.username.repository.IUsernameDataRepository;
import com.co.sofka.Bakimi.Domain.username.repository.UsernameData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TranformationUsernameUseCase {
    @Autowired
    private IUsernameDataRepository data;
    public UsernameData transform(Username username){
        UsernameData usernameData = new UsernameData(username.getUsuarioId(), username.getName().value(), username.getEmail().value());
        return (usernameData);
    }
    public  Iterable<UsernameData> searchUsername(){
        return data.findAll();
    }
    public UsernameData searchUsernameId(String id){
        return data.findById(id).orElseThrow(RuntimeException::new);
    }
    public String delete(String id) {

        try {
            data.deleteById(id);
            return "Se realizo el borrado con exito";
        }catch(Exception e){
            return "No se pudo realizar el borrado con exito";
        }
    }
}
