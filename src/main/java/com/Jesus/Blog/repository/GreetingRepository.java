package com.Jesus.Blog.repository;

import com.Jesus.Blog.entity.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends CrudRepository<Post, Integer> {
}