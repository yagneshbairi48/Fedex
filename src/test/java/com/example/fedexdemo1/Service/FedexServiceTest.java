package com.example.fedexdemo1.Service;

import com.example.fedexdemo1.FedEntity;
import com.example.fedexdemo1.Repository.FedRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class FedexServiceTest {
    @Mock
    private FedRepository repo;
    @InjectMocks
    private FedService service;
    public FedexServiceTest(){
        MockitoAnnotations.openMocks(this);
    }
    @Test
    public void testTransactionId(){
        FedEntity entity1=new FedEntity();
        FedEntity entity2=new FedEntity();
        List<FedEntity> entities= Arrays.asList(entity1,entity2);

        when(repo.findByTransactionId("624deea6-b709-470c-8c39-4b5511281492")).thenReturn(entities);
        List<FedEntity> result=service.getByTransactionId("624deea6-b709-470c-8c39-4b5511281492");
        assertEquals(entities,result);
    }
    @Test
    public void testCarrierCode(){
        FedEntity entity1=new FedEntity();
        FedEntity entity2=new FedEntity();
        List<FedEntity> entities= Arrays.asList(entity1,entity2);

        when(repo.findByCarrierCode("FDXE")).thenReturn(entities);
        List<FedEntity> result=service.getByCarrierCode("FDXE");
        assertEquals(entities,result);
    }

    @Test
    public void testCustomerTransactionId(){
        FedEntity entity1=new FedEntity();
        FedEntity entity2=new FedEntity();
        List<FedEntity> entities= Arrays.asList(entity1,entity2);

        when(repo.findByCustomerTransactionId("AnyCo_order123456789")).thenReturn(entities);
        List<FedEntity> result=service.getByCustomerTransactionId("AnyCo_order123456789");
        assertEquals(entities,result);
    }
    @Test
    public void testTrackingNumber(){
        FedEntity entity1=new FedEntity();
        FedEntity entity2=new FedEntity();
        List<FedEntity> entities= Arrays.asList(entity1,entity2);
        when(repo.findByTrackingNumber("725328096353")).thenReturn(entities);
        List<FedEntity> result=service.getByTrackingNumber("725328096353");
        assertEquals(entities,result);
    }
    @Test
    public void testMeterNumber(){
        FedEntity entity1=new FedEntity();
        FedEntity entity2=new FedEntity();
        List<FedEntity> entities= Arrays.asList(entity1,entity2);
        when(repo.findByMeterNumber("8468376")).thenReturn(entities);
        List<FedEntity> result=service.getByMeterNumber("8468376");
        assertEquals(entities,result);
    }
    @Test
    public void testGoodsClassificationCode(){
        FedEntity entity1=new FedEntity();
        FedEntity entity2=new FedEntity();
        List<FedEntity> entities= Arrays.asList(entity1,entity2);
        when(repo.findByGoodsClassificationCode("goodsClassificationCode")).thenReturn(entities);
        List<FedEntity> result=service.getByGoodsClassificationCode("goodsClassificationCode");
        assertEquals(entities,result);
    }
    @Test
    public void testLatestStatusCode(){
        FedEntity entity1=new FedEntity();
        FedEntity entity2=new FedEntity();
        List<FedEntity> entities= Arrays.asList(entity1,entity2);
        when(repo.findByLatestStatusCode("PU")).thenReturn(entities);
        List<FedEntity> result=service.getByLatestStatusCode("PU");
        assertEquals(entities,result);
    }



}
