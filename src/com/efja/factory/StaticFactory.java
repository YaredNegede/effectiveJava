package com.efja.factory;

public class StaticFactory {
	 
	private static StaticFactory instance;
	
	private StaticFactory() {
		
	}

	public static StaticFactory newInstance() {
		
		return  new StaticFactory();
	
	}
	
	public static StaticFactory getInstance() {
		
		
		if(null == instance) {
		
			instance= new StaticFactory();
		
		}
		
		return instance;
	
	}
	
	public static StaticFactory of(String type) {
		if(null == instance) {
			
			instance= new StaticFactory();
		
		}
		
		return instance;
		
	}

}
