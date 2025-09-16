package com.wellsfargo.counselor.repository;

import com.wellsfargo.counselor.entity.Security;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface SecurityRepository extends JpaRepository<Security, Long> {
    Optional<Security> findBySymbol(String symbol);
}