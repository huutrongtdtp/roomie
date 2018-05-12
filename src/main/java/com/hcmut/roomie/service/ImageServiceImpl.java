package com.hcmut.roomie.service;

import java.util.ArrayList;
import java.util.List;

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
	@Override
	public List<ImageDTO> getImagesByRoom(Long rid) {
		List<ImageDTO> result = new ArrayList<>();
		imageDAO.findByRoomRid(rid).forEach(image -> result.add(imageMapper.imageToImageDTO(image)));
		return result;
	}
	
}
