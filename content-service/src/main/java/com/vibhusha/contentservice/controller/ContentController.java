package com.vibhusha.contentservice.controller;


import com.vibhusha.contentservice.model.Content;
import com.vibhusha.contentservice.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/content")
public class ContentController {
    @Autowired
    private ContentRepository contentRepository;
    @PostMapping
    public Content add(@RequestBody Content content){
        return contentRepository.addContent(content);
    }
}
