package ir.negah.bank.arch.corporate.servicecatalogue.service;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import ir.negah.bank.arch.corporate.servicecatalogue.domain.entity.*;
import ir.negah.bank.arch.corporate.servicecatalogue.repository.*;
import lombok.extern.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;

import java.util.*;

/**
 * created by  f.rashidabadi
 * created on 6/19/2021
 * inside the package - ir.negah.bank.arch.corporate.servicecatalogue.service
 **/

@Service
@Transactional
@Slf4j
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    ObjectMapper objectMapper;

    public String getAllCompanies(){
        try {
            List<Company> companies = companyRepository.findAll();
            return objectMapper.writeValueAsString(companies);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String addCompany(Company company){
        companyRepository.save(company);
        return getAllCompanies();
    }
}
