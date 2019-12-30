package com.mapper;

import com.entity.Pets;

import java.util.List;

public interface PetsMapper {
    List<Pets> findPets();
}
