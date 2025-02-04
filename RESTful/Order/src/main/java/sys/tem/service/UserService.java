package sys.tem.service;

import org.springframework.stereotype.Service;
import sys.tem.model.InformationOrders;
import sys.tem.model.ListOfProductOrders;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final List<InformationOrders> list = new ArrayList<>();

    public UserService() {
        List<ListOfProductOrders> listOfProductOrders = new ArrayList<>();
        listOfProductOrders.add(ListOfProductOrders.builder().name("Хлеб").price(40).quantity(3).build());
        listOfProductOrders.add(ListOfProductOrders.builder().name("Масло").price(100).quantity(1).build());
        listOfProductOrders.add(ListOfProductOrders.builder().name("Колбаса").price(150).quantity(2).build());
        list.add(InformationOrders.builder().Id(1).UserId(1).orderCurrency("RUB").listOfProductOrders(new ArrayList<>(listOfProductOrders)).build());
        listOfProductOrders.clear();
        listOfProductOrders.add(ListOfProductOrders.builder().name("Хлеб").price(40).quantity(1).build());
        listOfProductOrders.add(ListOfProductOrders.builder().name("Масло").price(100).quantity(2).build());
        listOfProductOrders.add(ListOfProductOrders.builder().name("Колбаса").price(150).quantity(2).build());
        list.add(InformationOrders.builder().Id(2).UserId(2).orderCurrency("RUB").listOfProductOrders(new ArrayList<>(listOfProductOrders)).build());
        listOfProductOrders.clear();
        listOfProductOrders.add(ListOfProductOrders.builder().name("Хлеб").price(40).quantity(6).build());
        listOfProductOrders.add(ListOfProductOrders.builder().name("Масло").price(100).quantity(0).build());
        listOfProductOrders.add(ListOfProductOrders.builder().name("Колбаса").price(150).quantity(1).build());
        list.add(InformationOrders.builder().Id(3).UserId(3).orderCurrency("RUB").listOfProductOrders(new ArrayList<>(listOfProductOrders)).build());
        listOfProductOrders.clear();
        listOfProductOrders.add(ListOfProductOrders.builder().name("Хлеб").price(40).quantity(0).build());
        listOfProductOrders.add(ListOfProductOrders.builder().name("Масло").price(100).quantity(0).build());
        listOfProductOrders.add(ListOfProductOrders.builder().name("Колбаса").price(150).quantity(1).build());
        list.add(InformationOrders.builder().Id(4).UserId(1).orderCurrency("RUB").listOfProductOrders(new ArrayList<>(listOfProductOrders)).build());
    }

    public List<InformationOrders> getUserInfo(int id) {

        return list.stream().filter(item -> item.getUserId() == id).collect(Collectors.toList());
    }
}
