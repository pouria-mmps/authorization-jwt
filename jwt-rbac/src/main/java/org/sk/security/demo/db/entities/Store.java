package org.sk.security.demo.db.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sk.security.demo.dto.StoreResponseDTO;

import javax.persistence.*;

@Data
@Entity
@Table(name = "store")
@NoArgsConstructor
@AllArgsConstructor
public class Store implements DtoConvertor<StoreResponseDTO> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "store_id")
    private int storeId;
    private String storeName;
    private String address;
    private boolean active;

    @Override
    public StoreResponseDTO getDto() {
        StoreResponseDTO dto = new StoreResponseDTO();
        dto.setActive(this.active);
        dto.setAddress(this.address);
        dto.setStoreId(this.storeId);
        dto.setStoreName(this.storeName);
        return dto;
    }
}
