package ir.negah.bank.arch.corporate.servicecatalogue.controller;

import ir.negah.bank.arch.corporate.servicecatalogue.domain.entity.*;
import ir.negah.bank.arch.corporate.servicecatalogue.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.*;

/**
 * created by f.rashidabadi created on 6/19/2021 inside the package -
 * ir.negah.bank.arch.corporate.servicecatalogue.controller
 */
@RestController
@RequestMapping("projects")
public class ProjectController {

  @Autowired private ProjectService projectService;

  @GetMapping("")
  public ResponseEntity<String> getAllProjects(Model model) {
    return ResponseEntity.status(HttpStatus.OK).body(projectService.getAllProjects());
  }

  @PostMapping("add")
  public ResponseEntity<String> addProject(@RequestBody Project project) {
    return ResponseEntity.status(HttpStatus.OK).body(projectService.saveProject(project));
  }

  @PostMapping("edit")
  public ResponseEntity<String> getAllProjects(@RequestBody Project project) {
    return ResponseEntity.status(HttpStatus.OK).body(projectService.saveProject(project));
  }

  @DeleteMapping("delete/{id}")
  public ResponseEntity<String> getAllProjects(@PathVariable("id") Long id) {
    return ResponseEntity.status(HttpStatus.OK).body(projectService.deleteProjectById(id));
  }

  @PostMapping("doc/add")
  public ResponseEntity<String> addDocument(HttpServletRequest request) {
    return null;
  }
}
