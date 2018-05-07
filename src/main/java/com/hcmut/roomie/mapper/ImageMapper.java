package com.hcmut.roomie.mapper;

import org.mapstruct.Mapper;

import com.hcmut.roomie.dto.ImageDTO;
import com.hcmut.roomie.entity.Image;

@Mapper(componentModel = "spring")
public interface ImageMapper {
	ImageDTO imageToImageDTO(Image image);

	Image imageDTOToImage(ImageDTO imageDTO);
}
