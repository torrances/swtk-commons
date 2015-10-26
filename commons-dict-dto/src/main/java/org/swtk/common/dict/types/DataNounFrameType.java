package org.swtk.common.dict.types;

import com.trimc.blogger.commons.LogManager;

public enum DataNounFrameType {

	HYPERNYM("@"),

	SYNONYM("~"),

	PARTONOMY("%p"),

	ACTION("+");

	public static LogManager logger = new LogManager(DataNounFrameType.class);

	public static DataNounFrameType find(String symbol) {
		for (DataNounFrameType value : DataNounFrameType.values())
			if (value.getSymbol().equalsIgnoreCase(symbol)) return value;
		logger.error("WnRelType not found (value = %s)", symbol);
		return null;
	}

	private String symbol;

	private DataNounFrameType(String symbol) {
		setSymbol(symbol);
	}

	public String getSymbol() {
		return symbol;
	}

	private void setSymbol(String symbol) {
		this.symbol = symbol;
	}
}
