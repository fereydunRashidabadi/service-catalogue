package ir.negah.bank.arch.corporate.servicecatalogue.controller;

import ir.negah.bank.arch.corporate.servicecatalogue.domain.dto.*;
import ir.negah.bank.arch.corporate.servicecatalogue.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * created by  f.rashidabadi
 * created on 6/19/2021
 * inside the package - ir.negah.bank.arch.corporate.servicecatalogue.controller
 **/

@RestController
public class EndpointController {

    @Autowired
    private EndpointService endpointService;

    @GetMapping("/endpoints")
    public String greeting(Model model) {
        return endpointService.getAllEndpoints();
    }
}
