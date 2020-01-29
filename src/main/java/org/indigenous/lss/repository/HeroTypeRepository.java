package org.indigenous.lss.repository;

import org.indigenous.lss.entity.HeroType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroTypeRepository extends CrudRepository<HeroType, Integer>{

	
	/**
	 * Gets the by hero type.
	 *
	 * @param type the type
	 * @return the by hero type
	 */
	HeroType findByType(String type);
}
