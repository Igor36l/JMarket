package com.myzone.jmarket.repositories;

import com.myzone.jmarket.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
