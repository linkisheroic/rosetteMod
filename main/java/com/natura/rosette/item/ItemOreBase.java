package com.natura.rosette.item;


import net.minecraftforge.oredict.OreDictionary;

public class ItemOreBase extends ItemBase {

	private String oreName;

	public ItemOreBase(String name, String oreName) {
		super(name);
	
		this.oreName = oreName;
	}
	
	public void initOreDict() {
		OreDictionary.registerOre(oreName, this);
	}

}
