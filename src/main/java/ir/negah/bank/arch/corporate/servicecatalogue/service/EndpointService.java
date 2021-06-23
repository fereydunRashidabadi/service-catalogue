package ir.negah.bank.arch.corporate.servicecatalogue.service;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import ir.negah.bank.arch.corporate.servicecatalogue.domain.dto.*;
import ir.negah.bank.arch.corporate.servicecatalogue.domain.entity.*;
import ir.negah.bank.arch.corporate.servicecatalogue.repository.*;
import lombok.extern.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import springfox.documentation.swagger2.mappers.*;

import java.util.*;

/**
 * created by  f.rashidabadi
 * created on 6/19/2021
 * inside the package - ir.negah.bank.arch.corporate.servicecatalogue.service
 **/

@Service
@Transactional
@Slf4j
public class EndpointService {
    @Autowired
    private EndpointRepository endpointRepository;

    @Autowired
    ObjectMapper objectMapper;

    public String getAllEndpoints(){
        try {
            List<Endpoint> endpoints = endpointRepository.findAll();
            return objectMapper.writeValueAsString(endpoints);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getAllEndpointsByCompany(String companyId){
        try {
            Company company = new Company();
            company.setId(Long.parseLong(companyId));
            Set<Endpoint> endpoints = endpointRepository.findByCompanies(company);
            return objectMapper.writeValueAsString(endpoints);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String saveEndpoint(Endpoint endpoint){
        endpointRepository.save(endpoint);
        return getAllEndpoints();
    }

    public String deleteEndpointById(Long id){
        endpointRepository.deleteById(id);
        return getAllEndpoints();
    }
}
