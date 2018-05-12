package com.hcmut.roomie.mapper;

import java.util.List;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import com.hcmut.roomie.dto.ImageDTO;
import com.hcmut.roomie.entity.Image;

@Mapper(componentModel = "spring")
@Named("ImageMapper")
public interface ImageMapper {

	@Mapping(source = "room.rid", target = "rid")
	@Named("imageToImageDTO")
	ImageDTO imageToImageDTO(Image image);

	@Mapping(source = "rid", target = "room.rid")
	Image imageDTOToImage(ImageDTO imageDTO);

	@IterableMapping(qualifiedByName ="imageToImageDTO")
	@Named("imageListToImageDTOList")
	List<ImageDTO> imageListToImageDTOList(List<Image> images);
}
