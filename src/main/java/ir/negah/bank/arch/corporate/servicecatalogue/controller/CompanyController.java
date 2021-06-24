package ir.negah.bank.arch.corporate.servicecatalogue.controller;

import ir.negah.bank.arch.corporate.servicecatalogue.domain.entity.*;
import ir.negah.bank.arch.corporate.servicecatalogue.service.*;
import oracle.ucp.proxy.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

/**
 * created by  f.rashidabadi
 * created on 6/19/2021
 * inside the package - ir.negah.bank.arch.corporate.servicecatalogue.controller
 **/

@RestController
@RequestMapping("companies/")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/")
    public ResponseEntity<String> getAllCompanies(Model model) {
        return ResponseEntity.status(HttpStatus.OK).body(companyService.getAllCompanies());
    }

    @PostMapping("add")
    public ResponseEntity<String> saveCompany(@RequestBody Company company) {
        return ResponseEntity.status(HttpStatus.OK).body(companyService.addCompany(company));
    }

    @PostMapping("edit")
    public ResponseEntity<String> editCompany(@RequestBody Company company) {
        return ResponseEntity.status(HttpStatus.OK).body(companyService.addCompany(company));
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteCompany(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(companyService.deleteCompany(id));
    }

    @GetMapping("by-endpoint")
    public ResponseEntity<String> getAllCompaniesByEndpoint(@RequestParam("endpointId") Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(companyService.getAllCompaniesByEndpoint(id));
    }
}
