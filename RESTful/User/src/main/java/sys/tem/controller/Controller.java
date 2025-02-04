package sys.tem.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sys.tem.model.UserInfo;
import sys.tem.service.UserService;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final UserService service;

    @GetMapping("/api/users/{userId}")
    public UserInfo getUserInfo(@PathVariable("userId") int id) {
        return service.getUserInfo(id);
    }
}
