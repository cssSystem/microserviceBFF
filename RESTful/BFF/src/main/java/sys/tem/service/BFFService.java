package sys.tem.service;

import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import sys.tem.model.InformationOrders;
import sys.tem.model.UserData;
import sys.tem.model.UserInfo;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BFFService {
    private final WebClient.Builder webClient;
    private final String userInfoUrl = "http://localhost:8082/api/users/";
    private final String ordersInfoUrl = "http://localhost:8081/api/orders/by-user/";

    public UserData getUserData(int id) {
        UserInfo user = webClient.build().get().uri(userInfoUrl + id).retrieve().bodyToMono(UserInfo.class).block();
        List<InformationOrders> orders = webClient.build().get().uri(ordersInfoUrl + id).retrieve().bodyToMono(new ParameterizedTypeReference<List<InformationOrders>>() {
        }).block();
        return new UserData(user, orders);
    }
}
