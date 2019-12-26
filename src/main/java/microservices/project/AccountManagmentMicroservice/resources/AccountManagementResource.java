package microservices.project.AccountManagmentMicroservice.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountManagementResource {

    @GetMapping(path = "/status/check")
    public String getAccount(){
        return "working...";
    }
}
