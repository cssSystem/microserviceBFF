package sys.tem.service;

import org.springframework.stereotype.Service;
import sys.tem.model.UserInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private List<UserInfo> users = new ArrayList<>();

    public UserService() {
        users.add(UserInfo.builder()
                .Id(1)
                .FIO("Иванов Иван Иванович")
                .deliveryAddress("Москва")
                .email("ivan@e.ru")
                .phoneNumber("+7-999-999-99-99")
                .build());
        users.add(UserInfo.builder()
                .Id(2)
                .FIO("Иванов Натан Иванович")
                .deliveryAddress("Москва")
                .email("natan@e.ru")
                .phoneNumber("+7-999-999-99-98")
                .build());
        users.add(UserInfo.builder()
                .Id(3)
                .FIO("Иванова Наталья Ивановна")
                .deliveryAddress("Москва")
                .email("natalya@e.ru")
                .phoneNumber("+7-999-999-99-97")
                .build());
    }

    public UserInfo getUserInfo(int id) {
        return users.stream()
                .filter(e -> e.getId() == id)
                .collect(Collectors.toList()).get(0);
    }
}
