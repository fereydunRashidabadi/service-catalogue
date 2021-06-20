package ir.negah.bank.arch.corporate.servicecatalogue.controller;

import ir.negah.bank.arch.corporate.servicecatalogue.domain.dto.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * created by  f.rashidabadi
 * created on 6/19/2021
 * inside the package - ir.negah.bank.arch.arch.corporate.servicecatalogue.controller
 **/

@Controller
public class ServiceCatalogueController {
    @GetMapping("/index")
    public String index(Model model) {
        return "index-new";
    }
    @GetMapping("/welcome")
    public String welcome(Model model) {
        return "welcome";
    }

    @GetMapping("/company")
    public String company(Model model) {
        return "company";
    }

    @GetMapping("/project")
    public String project(Model model) {
        return "project";
    }

    @GetMapping("/endpoint")
    public String endpoint(Model model) {
        return "endpoint";
    }
}
