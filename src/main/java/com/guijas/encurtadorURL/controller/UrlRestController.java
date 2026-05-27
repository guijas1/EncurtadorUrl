package com.guijas.encurtadorURL.controller;

import com.guijas.encurtadorURL.dto.UrlInputDto;
import com.guijas.encurtadorURL.entity.UrlInput;
import com.guijas.encurtadorURL.service.UrlInputService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/urlInput")
public class UrlRestController {

    private final UrlInputService service;

    public UrlRestController(UrlInputService service){
        this.service = service;
    }

    @PostMapping()
    public ResponseEntity<UrlInputDto> inputUrl(@RequestBody UrlInputDto dto){
        service.create(dto);

        return ResponseEntity.ok(dto);
    }

    @GetMapping()
    public ResponseEntity<List<UrlInput>> listAll(){


        return ResponseEntity.ok().body(service.listAll());
    }
}
