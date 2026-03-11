package com.fusion.repository;

import com.fusion.model.TargetCompany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TargetRepository extends JpaRepository<TargetCompany, Long> {
    // Aqui o Spring Data faz toda a mágica do SQL sozinho!
}
