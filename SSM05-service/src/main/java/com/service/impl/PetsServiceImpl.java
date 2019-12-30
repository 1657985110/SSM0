package com.service.impl;

import com.entity.Pets;
import com.mapper.PetsMapper;
import com.service.PetsService;
import org.springframework.stereotype.Service;
import sun.util.resources.cldr.om.CalendarData_om_ET;

import javax.annotation.Resource;
import java.util.List;
@Service
public class PetsServiceImpl implements PetsService {
    @Resource
    private PetsMapper petsMapper;
    @Override
    public List<Pets> findPets() {
        return petsMapper.findPets();
    }
}
