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

    @PostMapping("save")
    public ResponseEntity<String> saveCompanies(@RequestBody Company company) {
        return ResponseEntity.status(HttpStatus.OK).body(companyService.addCompany(company));
    }
}
