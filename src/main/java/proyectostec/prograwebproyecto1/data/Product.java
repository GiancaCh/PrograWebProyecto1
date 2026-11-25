package proyectostec.prograwebproyecto1.data;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;

@Data
@Table("product")
public class Product {
    @Id
    @Column("product_id")
    private Long productId;
    @Column("product_name")
    private String productName;
    @Min(value = 0, message = "El stock no puede ser negativo")
    @Column("stock_quantity")
    private Integer stockQuantity;
    @Min(value = 0, message = "El precio unitario no puede ser negativo")
    @Column("unit_price")
    private Integer unitPrice;
}
