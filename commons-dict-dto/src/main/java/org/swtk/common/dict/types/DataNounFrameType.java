package org.swtk.common.dict.types;

import com.trimc.blogger.commons.LogManager;

public enum DataNounFrameType {

	ACTION("+"),

	HYPERNYM("@"),

	PARTONOMY("%p"),

	SYNONYM("~"),

	UNKNOWN_01("-c"),

	UNKNOWN_02("%s"),

	UNKNOWN_03("~i"),

	UNKNOWN_04("\\"),

	UNKNOWN_05("@i"),

	UNKNOWN_06("="),

	UNKNOWN_07(";u"),

	UNKNOWN_08(";r"),

	UNKNOWN_09(";c"),

	UNKNOWN_10("-u"),

	UNKNOWN_11("-r"),

	UNKNOWN_12("%m"),

	UNKNOWN_13("#s"),

	UNKNOWN_14("#p"),

	UNKNOWN_15("#m"),

	UNKNOWN_16("!");

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
