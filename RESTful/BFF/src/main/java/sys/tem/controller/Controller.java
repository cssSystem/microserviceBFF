package sys.tem.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sys.tem.model.UserData;
import sys.tem.service.BFFService;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final BFFService bffService;

    @GetMapping("/api/site-bff/user/{userId}")
    public ResponseEntity<?> getUserData(@PathVariable("userId") int id) {
        try {
            UserData res = bffService.getUserData(id);
            return new ResponseEntity<>(res, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("{}", HttpStatus.OK);
        }
    }
}
