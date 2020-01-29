package org.indigenous.lss.rest;

import org.indigenous.lss.model.HeroType;
import org.indigenous.lss.service.GlobalHeroService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.annotation.Resource;

@RestController
@RequestMapping("/global/hero")
public class GlobalHeroController {

	@Resource
	private GlobalHeroService globalHeroService;

	/**
	 * Gets the hero types.
	 *
	 * @return the hero types
	 */
	@GetMapping("/types")
	@ResponseBody
	public List<HeroType> getHeroTypes() {
		return globalHeroService.getHeroTypes();
	}

	/**
	 * Creates the hero type.
	 *
	 * @param heroType the hero type
	 */
	@PostMapping("/type")
	public void createHeroType(@RequestBody String heroType) {
		globalHeroService.createHeroType(heroType);
	}

	/**
	 * Delete hero type.
	 *
	 * @param heroType the hero type
	 */
	@DeleteMapping("/type/{heroType}")
	public void deleteHeroType(@PathVariable("heroType") String heroType) {
		globalHeroService.deleteHeroType(heroType);
	}
}
