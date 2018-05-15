package com.github.pocketkid2.mvp;

import java.util.HashSet;
import java.util.Set;

import org.bukkit.Material;

public class VehicleType {

	/*
	 * A set of block ID's that are allowed for the vehicle
	 */
	private final Set<Material> allowed;

	/*
	 * A set of block ID's that are not allowed for the vehicle
	 */
	private final Set<Material> denied;

	/*
	 * The minimum block count to make this vehicle
	 */
	private final int minSize;

	/*
	 * The maximum block count to make this vehicle
	 */
	private final int maxSize;

	/**
	 * Placeholder constructor
	 */
	public VehicleType() {
		// Placeholder values
		allowed = new HashSet<Material>();
		denied = new HashSet<Material>();
		minSize = 0;
		maxSize = 0;
	}
}
