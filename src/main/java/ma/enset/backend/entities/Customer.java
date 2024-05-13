package ma.enset.backend.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.List;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @OneToMany(mappedBy = "customer" , cascade=CascadeType.ALL)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)  //used to avoid the infinite iterations when we try to serialize the customers
    private List<BankAccount> bankAccounts;
}
