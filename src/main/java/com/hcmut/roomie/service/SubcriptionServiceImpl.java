package com.hcmut.roomie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcmut.roomie.dal.SubcriptionDAO;
import com.hcmut.roomie.dto.SubcriptionDTO;
import com.hcmut.roomie.mapper.SubcriptionMapper;

@Service
public class SubcriptionServiceImpl implements SubcriptionService {
	@Autowired
	private SubcriptionDAO subcriptionDAO;
	@Autowired
	private SubcriptionMapper subcriptionMapper;

	@Override
	public SubcriptionDTO createSubcription(SubcriptionDTO subcriptionDTO) {
		return subcriptionMapper.subcriptionToSubcriptionDTO(
				subcriptionDAO.save(subcriptionMapper.subcriptionDTOToSubcription(subcriptionDTO)));
	}

}
