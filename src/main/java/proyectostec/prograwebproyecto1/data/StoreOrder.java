package proyectostec.prograwebproyecto1.data;

import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@Table("store_order")
public class StoreOrder {
    @Id
    @Column("order_id")
    private Long orderId;
    @Column("order_date")
    private LocalDateTime orderDate;
    @Positive(message = "La cantidad del pedido debe ser mayor a 0")
    @Column("product_quantity")
    private Integer productQuantity;
    @Column("order_status")
    private Status orderStatus;

    @Column("user_id")
    private Long userId;
    @Column("product_id")
    private Long productId;

    public enum Status {
        NUEVO("Nuevo"),
        EN_PREPARACION("En preparación"),
        ENTREGADO("Entregado");

        private final String displayName;

        Status(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }
    }
}
