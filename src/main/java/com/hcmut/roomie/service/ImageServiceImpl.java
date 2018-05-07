package com.hcmut.roomie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcmut.roomie.dal.ImageDAO;
import com.hcmut.roomie.dto.ImageDTO;
import com.hcmut.roomie.mapper.ImageMapper;
@Service
public class ImageServiceImpl implements ImageService {
	@Autowired
	private ImageMapper imageMapper;
	@Autowired
	private ImageDAO imageDAO;
	@Override
	public ImageDTO createImage(ImageDTO imageDTO) {
		return imageMapper.imageToImageDTO(imageDAO.save(imageMapper.imageDTOToImage(imageDTO)));
	}
	
}
