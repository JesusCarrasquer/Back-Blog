package com.Jesus.Blog.controllers;

import com.Jesus.Blog.entity.Post;
import com.Jesus.Blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    private PostRepository repository;

    @RequestMapping("/posts")
    public String showPosts(String name, Model model) {
        List<Post> lista= (List<Post>) repository.findAll();
        if(lista.isEmpty()) {
            return "Mala suerte :(";
        }
        return lista.toString();
    }

}
