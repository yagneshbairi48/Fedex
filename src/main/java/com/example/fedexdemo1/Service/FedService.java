package com.example.fedexdemo1.Service;

import com.example.fedexdemo1.FedEntity;
import com.example.fedexdemo1.Repository.FedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FedService {
    @Autowired
    FedRepository repo;
    public FedEntity saveEntity(FedEntity f){

        return repo.save(f);
    }
}
