package com.bittechzone.gstore.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.convention.NameTokenizers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {

	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration()
				   .setMatchingStrategy(MatchingStrategies.STANDARD)
				   .setSourceNameTokenizer(NameTokenizers.CAMEL_CASE);
		return modelMapper;
	}
	
}
