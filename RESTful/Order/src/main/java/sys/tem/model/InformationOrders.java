package sys.tem.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InformationOrders {
    private int Id;
    private int UserId;
    private double orderAmount;
    private String orderCurrency;
    private List<ListOfProductOrders> listOfProductOrders;

    public double getOrderAmount() {
        return listOfProductOrders.stream()
                .mapToDouble(e -> e.getPrice() * e.getQuantity())
                .sum();
    }
}
