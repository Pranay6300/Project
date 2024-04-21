package com.example.MeterReading;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeterReadingRepository extends JpaRepository<MeterReading, Long> 
{
    MeterReading findTopByReadingIsNotAndReadingIsNotNullOrderByTimeDesc(String reading);
}
