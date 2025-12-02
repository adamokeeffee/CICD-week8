package ie.atu.week8lab;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {

    private Long id;

    private String employeeId;

    private String name;
    private String role;

}
