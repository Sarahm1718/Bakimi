package com.co.sofka.Bakimi.Domain.username.repository;

import com.co.sofka.Bakimi.Domain.username.entity.Blog;
import com.co.sofka.Bakimi.Domain.username.values.IdPublication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface IBlogRepository extends CrudRepository<Blog, IdPublication>{

    }

