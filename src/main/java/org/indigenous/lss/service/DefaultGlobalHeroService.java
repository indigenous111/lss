package org.indigenous.lss.service;

import org.indigenous.lss.converters.HeroTypeConverter;
import org.indigenous.lss.model.HeroType;
import org.indigenous.lss.repository.HeroTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The default implementation for global hero service.
 */
@Service
public class DefaultGlobalHeroService implements GlobalHeroService {

	/** The hero type repository. */
	@Autowired
	private HeroTypeRepository heroTypeRepository;

	/** The hero type converter. */
	@Autowired
	private HeroTypeConverter heroTypeConverter;

	/**
	 * Gets the hero types.
	 */
	public List<HeroType> getHeroTypes() {
		List<org.indigenous.lss.entity.HeroType> heroTypes = Lists.newArrayList(heroTypeRepository.findAll());
		List<HeroType> heroModels = heroTypes.stream().map(h -> {
			return heroTypeConverter.covertToDTO(h);
		}).collect(Collectors.toList());
		return heroModels;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.indigenous.lss.service.GlobalHeroService#createHeroType(java.lang.String)
	 */
	@Override
	public void createHeroType(String heroType) {
		org.indigenous.lss.entity.HeroType type = new org.indigenous.lss.entity.HeroType();
		type.setType(heroType);
		heroTypeRepository.save(type);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.indigenous.lss.service.GlobalHeroService#deleteHeroType(java.lang.String)
	 */
	@Override
	public void deleteHeroType(String heroType) {
		org.indigenous.lss.entity.HeroType type = heroTypeRepository.findByType(heroType);
		heroTypeRepository.delete(type);
	}
}
