package edu.nibm.limokiss_web_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String description;
    @OneToMany(targetEntity = ImageEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id",referencedColumnName = "id")
    private List<ImageEntity> images;
    @OneToMany(targetEntity = SizeEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id",referencedColumnName = "id")
    private List<SizeEntity> sizes;
    private String category;
    private String subCategory;
    private boolean isNew;
    private String status;
}
