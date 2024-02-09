package com.example.fedexdemo1.Repository;

import com.example.fedexdemo1.FedEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FedRepository extends JpaRepository<FedEntity,Long> {
}
