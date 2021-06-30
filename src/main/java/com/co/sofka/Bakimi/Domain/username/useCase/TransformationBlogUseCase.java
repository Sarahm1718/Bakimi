package com.co.sofka.Bakimi.Domain.username.useCase;

import com.co.sofka.Bakimi.Domain.username.entity.Blog;
import com.co.sofka.Bakimi.Domain.username.repository.BlogData;
import com.co.sofka.Bakimi.Domain.username.repository.IBlogDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransformationBlogUseCase {
    @Autowired
    public IBlogDataRepository data;
    public BlogData tranform(Blog blog){
        BlogData blogData = new BlogData(blog.getPublicationId(), blog.getIdUsuario().value(), blog.getTittle().value(), blog.getIdCommentary().value(), blog.getContents().value());
        return blogData;
    }
    public Iterable<BlogData> search(){
        return data.findAll();
    }
}
