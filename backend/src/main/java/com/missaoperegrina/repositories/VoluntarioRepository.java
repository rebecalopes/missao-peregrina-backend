package com.missaoperegrina.repositories;

import com.missaoperegrina.domain.Voluntario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoluntarioRepository extends JpaRepository<Voluntario, Integer> {
}
