package com.lunazstudios.furnies;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Furnies implements ModInitializer {
	public static final String MOD_ID = "furnies";
	public static final String MOD_NAME = "Furnies";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}