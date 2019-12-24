package org.indigenous.lss.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * The default implementation for global hero service.
 */
@Service
public class DefaultGlobalHeroService implements GlobalHeroService {

    /**
     * Gets the hero types.
     */
   public List<String> getHeroTypes() {
       List<String> heroTypes = new ArrayList<>();
       heroTypes.add("S1");
       heroTypes.add("S2");
       heroTypes.add("S3");
       heroTypes.add("S4");
       return heroTypes;
    }
}
