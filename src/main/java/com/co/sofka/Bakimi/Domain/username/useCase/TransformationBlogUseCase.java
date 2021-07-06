package com.co.sofka.Bakimi.Domain.username.useCase;

import com.co.sofka.Bakimi.Domain.username.entity.Blog;
import com.co.sofka.Bakimi.Domain.username.repository.BlogData;
import com.co.sofka.Bakimi.Domain.username.repository.IBlogDataRepository;
import com.co.sofka.Bakimi.Domain.username.repository.UsernameData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransformationBlogUseCase {
    @Autowired
    private IBlogDataRepository data;


    public BlogData transform(Blog blog){
        BlogData blogData = new BlogData(blog.getPublicationId(), blog.getTittle().value(), blog.getIdUsuario().value(), blog.getContents().value());
        return blogData;
    }
    public Iterable<BlogData> search(){
        return data.findAll();
    }

    public BlogData searchId(String idb){
        return data.findById(idb).orElseThrow(RuntimeException::new);
    }
    public String delete(String idb) {

        try {
            data.deleteById(idb);
            return "Se realizo el borrado con exito";
        }catch(Exception e){
            return "No se pudo realizar el borrado con exito";
        }

}}
