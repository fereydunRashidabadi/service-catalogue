package ir.negah.bank.arch.servicecatalogue.repository;

import ir.negah.bank.arch.servicecatalogue.domain.entity.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

/**
 * created by f.rashidabadi created on 6/19/2021 inside the package -
 * ir.negah.bank.arch.corporate.servicecatalogue.repository
 */
@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
  public List<Company> findByEndpoints(Endpoint endpoint);
}
