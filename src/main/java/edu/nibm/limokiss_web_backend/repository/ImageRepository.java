package edu.nibm.limokiss_web_backend.repository;

import edu.nibm.limokiss_web_backend.entity.ImageEntity;
import org.springframework.data.repository.CrudRepository;

public interface ImageRepository extends CrudRepository<ImageEntity,Integer> {
}
