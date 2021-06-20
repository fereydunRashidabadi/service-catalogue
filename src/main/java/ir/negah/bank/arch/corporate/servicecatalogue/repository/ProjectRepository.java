package ir.negah.bank.arch.corporate.servicecatalogue.repository;

import ir.negah.bank.arch.corporate.servicecatalogue.domain.entity.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

/**
 * created by  f.rashidabadi
 * created on 6/19/2021
 * inside the package - ir.negah.bank.arch.corporate.servicecatalogue.repository
 **/

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
