package com.guijas.encurtadorURL.service;

import com.guijas.encurtadorURL.dto.UrlInputDto;
import com.guijas.encurtadorURL.entity.UrlInput;
import com.guijas.encurtadorURL.exception.BadRequestException;
import com.guijas.encurtadorURL.repository.UrlInputRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrlInputService {

    private final UrlInputRepository repository;

    public UrlInputService(UrlInputRepository repository){
        this.repository = repository;
    }

    public UrlInput create(UrlInputDto dto){
        UrlInput entity = new UrlInput();
        validar(dto);
        entity.setUrl(dto.url());
        return repository.save(entity);
    }

    public UrlInputDto validar(UrlInputDto dto){
        if(dto == null){
            throw new BadRequestException("Payload veio vazio", HttpStatus.BAD_REQUEST);
        }
        return dto;
    }
    public List<UrlInput> listAll(){
        return repository.findAll();
    }


}
