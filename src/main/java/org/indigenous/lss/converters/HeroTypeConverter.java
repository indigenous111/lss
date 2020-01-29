package org.indigenous.lss.converters;

import org.indigenous.lss.model.HeroType;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class HeroTypeConverter {

	public HeroType covertToDTO(org.indigenous.lss.entity.HeroType heroType) {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.convertValue(heroType, HeroType.class);
	}
	
	public org.indigenous.lss.entity.HeroType convertToEntity(HeroType heroType) {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.convertValue(heroType, org.indigenous.lss.entity.HeroType.class);
	}
}
