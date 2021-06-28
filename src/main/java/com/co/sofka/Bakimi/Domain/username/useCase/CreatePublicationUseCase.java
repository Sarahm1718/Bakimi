package com.co.sofka.Bakimi.Domain.username.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Bakimi.Domain.username.commands.CreatePublication;
import com.co.sofka.Bakimi.Domain.username.entity.Blog;
import com.co.sofka.Bakimi.Domain.username.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;



public class CreatePublicationUseCase extends UseCase<RequestCommand<CreatePublication>, CreatePublicationUseCase.Response> {
    @Autowired
    private IBlogRepository iBlogRepository;


    @Override
    public void executeUseCase(RequestCommand<CreatePublication> createPublicationRequestCommand) {
        var command = createPublicationRequestCommand.getCommand();
        var blog = new Blog(command.getIdPublication(), command.getIdCommentary(), command.getIdUsuario(), command.getIdPublication(), command.getTittle(), command.getContents());
        iBlogRepository.save(blog);
        emit().onResponse(new Response(blog));
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





