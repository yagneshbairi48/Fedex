package com.example.fedexdemo1.Controller;

import com.example.fedexdemo1.FedEntity;
import com.example.fedexdemo1.Repository.FedRepository;
import com.example.fedexdemo1.Service.FedService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class FedexControllerTest {
    
    @Mock
    private FedRepository repo;
    @InjectMocks
    private FedexController controller;
    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }
    @Test
    public void getTransactionId(){
        FedEntity entity1=new FedEntity();
        FedEntity entity2=new FedEntity();
        List<FedEntity> entities= Arrays.asList(entity1,entity2);
        when(repo.findByTransactionId("624deea6-b709-470c-8c39-4b5511281492")).thenReturn(entities);
        ResponseEntity<List<FedEntity>> response=controller.getResults("624deea6-b709-470c-8c39-4b5511281492");
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(entities,response.getBody());
    }
    @Test
    public void getCustomerTransactionId(){
        FedEntity entity1=new FedEntity();
        FedEntity entity2=new FedEntity();
        List<FedEntity> entities= Arrays.asList(entity1,entity2);
        when(repo.findByCustomerTransactionId("AnyCo_order123456789")).thenReturn(entities);
        ResponseEntity<List<FedEntity>> response=controller.getByCustomerTransactionId("AnyCo_order123456789");
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(entities,response.getBody());
    }
    @Test
    public void getCarrierCode(){
        FedEntity entity1=new FedEntity();
        FedEntity entity2=new FedEntity();
        List<FedEntity> entities= Arrays.asList(entity1,entity2);
        when(repo.findByCarrierCode("FDXE")).thenReturn(entities);
        ResponseEntity<List<FedEntity>> response=controller.getByCarrierCode("FDXE");
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(entities,response.getBody());
    }
    @Test
    public void getTrackingNumber(){
        FedEntity entity1=new FedEntity();
        FedEntity entity2=new FedEntity();
        List<FedEntity> entities= Arrays.asList(entity1,entity2);
        when(repo.findByTrackingNumber("725328096353")).thenReturn(entities);
        ResponseEntity<List<FedEntity>> response=controller.getByTrackingNumber("725328096353");
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(entities,response.getBody());
    }
    @Test
    public void getTrackingNumberUniqueId(){
        FedEntity entity1=new FedEntity();
        FedEntity entity2=new FedEntity();
        List<FedEntity> entities= Arrays.asList(entity1,entity2);
        when(repo.findByTrackingNumberUniqueId("245822~123456789012~FDEG")).thenReturn(entities);
        ResponseEntity<List<FedEntity>> response=controller.getByTrackingNumberUniqueId("245822~123456789012~FDEG");
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(entities,response.getBody());
    }
    @Test
    public void getMeterNumber(){
        FedEntity entity1=new FedEntity();
        FedEntity entity2=new FedEntity();
        List<FedEntity> entities= Arrays.asList(entity1,entity2);
        when(repo.findByMeterNumber("8468376")).thenReturn(entities);
        ResponseEntity<List<FedEntity>> response=controller.getByMeterNumber("8468376");
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(entities,response.getBody());
    }
    @Test
    public void getGoodsClassificationCode(){
        FedEntity entity1=new FedEntity();
        FedEntity entity2=new FedEntity();
        List<FedEntity> entities= Arrays.asList(entity1,entity2);
        when(repo.findByGoodsClassificationCode("goodsClassificationCode")).thenReturn(entities);
        ResponseEntity<List<FedEntity>> response=controller.getByGoodsClassificationCode("goodsClassificationCode");
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(entities,response.getBody());
    }
    @Test
    public void getLatestStatusCode(){
        FedEntity entity1=new FedEntity();
        FedEntity entity2=new FedEntity();
        List<FedEntity> entities= Arrays.asList(entity1,entity2);
        when(repo.findByLatestStatusCode("PU")).thenReturn(entities);
        ResponseEntity<List<FedEntity>> response=controller.getByLatestStatusCode("PU");
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(entities,response.getBody());
    }

}
