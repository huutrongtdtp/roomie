package com.hcmut.roomie.service;

import java.util.List;

import com.hcmut.roomie.dto.ImageDTO;

public interface ImageService {
	public ImageDTO createImage (ImageDTO imageDTO);
	public List<ImageDTO> getImagesByRoom(Long rid);
	//public ImageDTO updateImage(ImageDTO imageDTO);
}
