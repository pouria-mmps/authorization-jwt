package org.sk.security.demo.db.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sk.security.demo.dto.ProductResponseDTO;

import javax.persistence.*;

@Data
@Entity
@Table(name = "product")
@NoArgsConstructor
@AllArgsConstructor
public class Product implements DtoConvertor<ProductResponseDTO> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    private String productName;
    private int price;
    private boolean available;

    @Column(name = "store_id")
    private int storeId;

    @Override
    public ProductResponseDTO getDto() {
        ProductResponseDTO p = new ProductResponseDTO();
        p.setAvailable(this.available);
        p.setPrice(this.price);
        p.setProductId(this.productId);
        p.setProductName(this.productName);
        p.setStoreId(this.storeId);
        return p;
    }
}

