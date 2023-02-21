package com.test.testapi.repositorio;

import com.test.testapi.entity.Prince;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Repository
public interface princeRepository extends JpaRepository<Prince, Long> {

    @Query(value = "SELECT * FROM PRINCE WHERE START_DATE = ?1 AND PRICE_LIST = ?2", nativeQuery = true)
    public List<Prince> listas(String fecha, Long priceList);

}

