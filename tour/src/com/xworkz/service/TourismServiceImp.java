package com.xworkz.service;

import com.xworkz.dto.TourismDTO;
import com.xworkz.repo.TourismRepository;
import com.xworkz.repo.TourismRepositoryImp;

public class TourismServiceImp implements TourismService{


    @Override
    public String validateAndSave(TourismDTO dto) {
        if(dto!=null)
        {
            TourismRepository tourismRepository=new TourismRepositoryImp();
            return tourismRepository.save(dto);
        }
        return "false";
    }
}
