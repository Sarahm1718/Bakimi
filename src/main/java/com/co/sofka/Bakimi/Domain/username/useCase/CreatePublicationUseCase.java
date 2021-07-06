package com.co.sofka.Bakimi.Domain.username.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Bakimi.Domain.username.commands.CreatePublication;
import com.co.sofka.Bakimi.Domain.username.entity.Blog;
import com.co.sofka.Bakimi.Domain.username.repository.BlogData;
import com.co.sofka.Bakimi.Domain.username.repository.IBlogDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CreatePublicationUseCase extends UseCase<RequestCommand<CreatePublication>, CreatePublicationUseCase.Response> {
    @Autowired
    private IBlogDataRepository data;


    @Override
    public void executeUseCase(RequestCommand<CreatePublication> createPublicationRequestCommand) {
        var command = createPublicationRequestCommand.getCommand();
        var blog = new Blog(command.idPublication(), command.tittle(), command.idUsuario(), command.contents());
        data.save(transform(blog));
        emit().onResponse(new Response(blog));
    }
    public BlogData transform(Blog blog){
        BlogData blogData = new BlogData(blog.getPublicationId(), blog.getTittle().value(), blog.getIdUsuario().value(), blog.getContents().value());
        return blogData;
    }

    public static class Response implements UseCase.ResponseValues{
        private Blog response;

        public Response(Blog blog){this.response=blog;}

        public Blog getResponse() {
            return response;
        }

        public void setResponse(Blog response) {
            this.response = response;
        }
    }
}





