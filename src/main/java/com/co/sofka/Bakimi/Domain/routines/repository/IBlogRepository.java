package com.co.sofka.Bakimi.Domain.routines.repository;

import com.co.sofka.Bakimi.Domain.routines.entity.Blog;
import com.co.sofka.Bakimi.Domain.routines.values.IdPublication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface IBlogRepository extends CrudRepository<Blog, IdPublication>{

    }

