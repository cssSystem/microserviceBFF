package sys.tem.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
    private int Id;
    private String FIO;
    private String deliveryAddress;
    private String phoneNumber;
    private String email;
}
