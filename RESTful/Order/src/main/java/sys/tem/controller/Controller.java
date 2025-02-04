package sys.tem.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sys.tem.model.InformationOrders;
import sys.tem.service.UserService;


import java.util.List;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final UserService service;

    @GetMapping("/api/orders/by-user/{user}")
    public List<InformationOrders> getUserInfo(@PathVariable("user") int id) {
        return service.getUserInfo(id);
    }
}
