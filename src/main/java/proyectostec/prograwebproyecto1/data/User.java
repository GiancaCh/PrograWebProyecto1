package proyectostec.prograwebproyecto1.data;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("user")
public class User {
    @Id
    @Column("user_id")
    private Long userId;
    @Column("user_name")
    private String userName;
    @Column("username")
    private String username;
    @Column("email")
    private String email;
    @Column("user_type")
    private Type userType;
    //@JsonIgnore
    //@Transient
    //private List<Order> order;

    public enum Type {
        ADMIN,
        REGULAR
    }
}
