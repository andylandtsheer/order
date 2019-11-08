package be.landtlord.api.controllers;

import be.landtlord.service.CostumerService;
import be.landtlord.service.mappers.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("customer")
public class CostumerController {
    private final CostumerService costumerService;

    @Autowired
    public CostumerController(CostumerService costumerService) {
        this.costumerService = costumerService;
    }

    @PostMapping (produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerDTO createCustomer(@RequestBody CustomerDTO customerToCreate){
        return costumerService.createCustomer(customerToCreate);
    }
}
