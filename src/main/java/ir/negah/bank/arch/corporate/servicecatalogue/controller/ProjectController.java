package ir.negah.bank.arch.corporate.servicecatalogue.controller;

import ir.negah.bank.arch.corporate.servicecatalogue.service.*;
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
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/projects")
    public ResponseEntity<String> getAllProjects(Model model) {
        return ResponseEntity.status(HttpStatus.OK).body(projectService.getAllProjects());
    }
}
