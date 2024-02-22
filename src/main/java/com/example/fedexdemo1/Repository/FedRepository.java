package com.example.fedexdemo1.Repository;

import com.example.fedexdemo1.FedEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FedRepository extends JpaRepository<FedEntity,Long> {
    List<FedEntity> findByTransactionId(String transactionId);
    List<FedEntity> findByTrackingNumber(String trackingNumber);


    List<FedEntity> findByMeterNumber(String meterNumber);

    List<FedEntity> findByTrackingNumberUniqueId(String meterNumber);

    List<FedEntity> findByGoodsClassificationCode(String goodsClassificationCode);

    List<FedEntity> findByLatestStatusCode(String latestStatusCode);

    List<FedEntity> findByCustomerTransactionId(String trackingNumber);

    List<FedEntity> findByCarrierCode(String customerTrackingNumber);
}
