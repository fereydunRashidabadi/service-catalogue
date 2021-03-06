package ir.negah.bank.arch.corporate.servicecatalogue.controller;

import ir.negah.bank.arch.corporate.servicecatalogue.domain.entity.*;
import ir.negah.bank.arch.corporate.servicecatalogue.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

/**
 * created by f.rashidabadi created on 6/19/2021 inside the package -
 * ir.negah.bank.arch.corporate.servicecatalogue.controller
 */
@RestController
@RequestMapping("endpoints")
public class EndpointController {

  @Autowired private EndpointService endpointService;

  @GetMapping("")
  public ResponseEntity<String> endpoints(Model model) {
    return ResponseEntity.status(HttpStatus.OK).body(endpointService.getAllEndpoints());
  }

  @GetMapping("by-company")
  public ResponseEntity<String> endpointByCompany(@RequestParam("companyId") String companyId) {
    return ResponseEntity.status(HttpStatus.OK)
        .body(endpointService.getAllEndpointsByCompany(companyId));
  }

  @GetMapping("by-project")
  public ResponseEntity<String> endpointByProject(@RequestParam("projectId") Long projectId) {
    return ResponseEntity.status(HttpStatus.OK)
        .body(endpointService.getAllEndpointsByProject(projectId));
  }

  @PostMapping("add")
  public ResponseEntity<String> addEndpoint(@RequestBody Endpoint endpoint) {
    return ResponseEntity.status(HttpStatus.OK).body(endpointService.saveEndpoint(endpoint));
  }

  @PostMapping("edit")
  public ResponseEntity<String> editEndpoint(@RequestBody Endpoint endpoint) {
    return ResponseEntity.status(HttpStatus.OK).body(endpointService.editEndpoint(endpoint));
  }

  @DeleteMapping("delete/{id}")
  public ResponseEntity<String> deleteEndpoint(@PathVariable("id") Long id) {
    return ResponseEntity.status(HttpStatus.OK).body(endpointService.deleteEndpointById(id));
  }

  @DeleteMapping("delete/company")
  public ResponseEntity<String> deleteCompany(
      @RequestParam("endpointId") Long endpointId, @RequestParam("companyId") Long companyId) {
    return ResponseEntity.status(HttpStatus.OK)
        .body(endpointService.deleteEndpointCompanyById(endpointId, companyId));
  }

  @PostMapping("add-company")
  public ResponseEntity<String> addCompany(@RequestBody Endpoint endpoint) {
    return ResponseEntity.status(HttpStatus.OK).body(endpointService.addCompany(endpoint));
  }
}
