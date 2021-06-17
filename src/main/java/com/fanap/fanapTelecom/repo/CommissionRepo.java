package com.fanap.fanapTelecom.repo;


import com.fanap.fanapTelecom.model.Commission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommissionRepo extends JpaRepository<Commission, Long> {
}
