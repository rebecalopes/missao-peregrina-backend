package com.missaoperegrina.repositories;

import com.missaoperegrina.domain.Admininstracao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdmininstracaoRepository extends JpaRepository<Admininstracao, Integer> {
}
