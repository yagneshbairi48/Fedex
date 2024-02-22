package com.example.fedexdemo1.Controller;

import com.example.fedexdemo1.FedEntity;
import com.example.fedexdemo1.Repository.FedRepository;
import com.example.fedexdemo1.Service.FedService;
import com.example.fedexdemo1.beans.Fed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
public class FedexController {
    @Autowired
    private FedRepository repo;
    @Autowired
    private FedService service;
    @GetMapping("/find/{transactionId}")
    public ResponseEntity<List<FedEntity>> getResults(@PathVariable String transactionId){
        List<FedEntity> result=repo.findByTransactionId(transactionId);
        if(result.isEmpty()){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(result);
        }
    }
    @GetMapping("find/{customerTrackingNumber}")
    public ResponseEntity<List<FedEntity>> getByCustomerTransactionId(@PathVariable String customerTrackingNumber){
        List<FedEntity> result=repo.findByCustomerTransactionId(customerTrackingNumber);
        if(result.isEmpty()){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(result);
        }
    }
    @GetMapping("find/{carrierCode}")
    public ResponseEntity<List<FedEntity>> getByCarrierCode(@PathVariable String customerTrackingNumber){
        List<FedEntity> result=repo.findByCarrierCode(customerTrackingNumber);
        if(result.isEmpty()){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(result);
        }
    }
    @GetMapping("find/{trackingNumber}")
    public ResponseEntity<List<FedEntity>> getByTrackingNumber(@PathVariable String trackingNumber){
        List<FedEntity> result=repo.findByTrackingNumber(trackingNumber);
        if(result.isEmpty()){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(result);
        }
    }
    @GetMapping("find/{trackingNumberUniqueId}")
    public ResponseEntity<List<FedEntity>> getByTrackingNumberUniqueId(@PathVariable String trackingNumberUniqueId){
        List<FedEntity> result=repo.findByTrackingNumberUniqueId(trackingNumberUniqueId);
        if(result.isEmpty()){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(result);
        }
    }
    @GetMapping("find/{meterNumber}")
    public ResponseEntity<List<FedEntity>> getByMeterNumber(@PathVariable String meterNumber){
        List<FedEntity> result=repo.findByMeterNumber(meterNumber);
        if(result.isEmpty()){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(result);
        }
    }
    @GetMapping("find/{goodsClassificationCode}")
    public ResponseEntity<List<FedEntity>> getByGoodsClassificationCode(@PathVariable String goodsClassificationCode){
        List<FedEntity> result=repo.findByGoodsClassificationCode(goodsClassificationCode);
        if(result.isEmpty()){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(result);
        }
    }
    @GetMapping("find/{latestStatusCode}")
    public ResponseEntity<List<FedEntity>> getByLatestStatusCode(@PathVariable String latestStatusCode){
        List<FedEntity> result=repo.findByLatestStatusCode(latestStatusCode);
        if(result.isEmpty()){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(result);
        }
    }






}
