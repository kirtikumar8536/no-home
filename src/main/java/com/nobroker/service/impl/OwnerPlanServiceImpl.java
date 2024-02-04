package com.nobroker.service.impl;

import com.nobroker.entity.OwnerPlan;
import com.nobroker.payload.OwnerPlanDto;
import com.nobroker.repository.OwnerPlanRepository;
import com.nobroker.service.OwnerPlanService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OwnerPlanServiceImpl implements OwnerPlanService {
    private OwnerPlanRepository ownerPlanRepository;

    private ModelMapper modelMapper;

    //constructor based injection
    public OwnerPlanServiceImpl(OwnerPlanRepository ownerPlanRepository, ModelMapper modelMapper) {
        this.ownerPlanRepository = ownerPlanRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public OwnerPlanDto createOwnerPlans(OwnerPlanDto ownerPlanDto) {
        OwnerPlan ownerPlan = mapToEntity(ownerPlanDto);//getting entity object
        OwnerPlan savedOwnerPlan = ownerPlanRepository.save(ownerPlan);
        OwnerPlanDto dto = mapTODto(savedOwnerPlan);
        return dto;
    }

    @Override
    public List<OwnerPlanDto> getAllOwnerPlan() {
        List<OwnerPlan> listOfOwnerPlan = ownerPlanRepository.findAll();
        List<OwnerPlanDto> dtoList = listOfOwnerPlan.stream()
                                       .map(plan -> mapTODto(plan))
                                         .collect(Collectors.toList());
        return dtoList;
    }


    //using mapper module
    OwnerPlan mapToEntity(OwnerPlanDto ownerPlanDto) {
        OwnerPlan ownerPlan = modelMapper.map(ownerPlanDto, OwnerPlan.class);
        return ownerPlan;
    }

    OwnerPlanDto mapTODto(OwnerPlan ownerPlan) {
        OwnerPlanDto ownerPlanDto = modelMapper.map(ownerPlan, OwnerPlanDto.class);
        return ownerPlanDto;
    }

}
