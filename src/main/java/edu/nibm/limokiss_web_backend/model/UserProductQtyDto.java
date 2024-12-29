package edu.nibm.limokiss_web_backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserProductQtyDto {
    private  String id;
    private String email;
    private  long qty;
}
