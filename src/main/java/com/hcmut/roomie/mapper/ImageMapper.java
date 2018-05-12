package com.hcmut.roomie.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.hcmut.roomie.dto.ImageDTO;
import com.hcmut.roomie.entity.Image;

@Mapper(componentModel = "spring")
public interface ImageMapper {
	@Mapping(source="room.rid", target="rid")
	ImageDTO imageToImageDTO(Image image);
	@Mapping(source="rid", target="room.rid")
	Image imageDTOToImage(ImageDTO imageDTO);
}
