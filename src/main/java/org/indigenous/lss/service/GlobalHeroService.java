package org.indigenous.lss.service;

import java.util.List;

import org.indigenous.lss.model.HeroType;

/**
 * The Global hero service.
 */
public interface GlobalHeroService {

    /**
     * Gets the hero types.
     * @return hero types
     */
	List<HeroType> getHeroTypes();
    
    /**
     * Creates the hero type.
     *
     * @param heroType the hero type
     */
    void createHeroType(String heroType);
    
    /**
     * Delete hero type.
     *
     * @param heroType the hero type
     */
    void deleteHeroType(String heroType);
}
