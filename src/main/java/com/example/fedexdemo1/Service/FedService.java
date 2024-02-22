package com.example.fedexdemo1.Service;

import com.example.fedexdemo1.FedEntity;
import com.example.fedexdemo1.Repository.FedRepository;
import com.example.fedexdemo1.beans.Fed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class FedService {
    @Autowired
    FedRepository repo;
    public FedEntity saveEntity(FedEntity f){
        return repo.save(f);
    }
    public  List<FedEntity> getByTransactionId(String transactionId){
        return repo.findByTransactionId(transactionId);
    }
    public List<FedEntity> getByCustomerTransactionId(String customerTransactionId){
        return repo.findByCustomerTransactionId(customerTransactionId);
    }
    public List<FedEntity> getByCarrierCode(String carrierCode){
        return repo.findByCarrierCode(carrierCode);
    }
    public List<FedEntity> getByTrackingNumber(String trackingNumber){
        return repo.findByTrackingNumber(trackingNumber);
    }
    public List<FedEntity> getByMeterNumber(String meterNumber){
        return repo.findByMeterNumber(meterNumber);
    }
    public List<FedEntity> getByTrackingNumberUniqueId(String meterNumber){
        return repo.findByTrackingNumberUniqueId(meterNumber);
    }
    public List<FedEntity> getByGoodsClassificationCode(String goodsClassificationCode){
        return repo.findByGoodsClassificationCode(goodsClassificationCode);
    }
    public List<FedEntity> getByLatestStatusCode(String latestStatusCode){
        return repo.findByLatestStatusCode(latestStatusCode);
    }




}
