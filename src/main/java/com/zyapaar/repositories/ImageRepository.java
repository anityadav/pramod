package com.zyapaar.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zyapaar.entities.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
	Optional<Image> findByName(String name);
}
