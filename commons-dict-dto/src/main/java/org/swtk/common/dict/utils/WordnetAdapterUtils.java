package org.swtk.common.dict.utils;

import com.trimc.blogger.commons.exception.AdapterValidationException;
import com.trimc.blogger.commons.type.EngGrammarUpperType;

public class WordnetAdapterUtils {

	public static EngGrammarUpperType transformPos(String text) throws AdapterValidationException {
		if ("n".equalsIgnoreCase(text)) return EngGrammarUpperType.NOUN;
		if ("v".equalsIgnoreCase(text)) return EngGrammarUpperType.VERB;
		if ("a".equalsIgnoreCase(text)) return EngGrammarUpperType.ADJECTIVE;
		if ("r".equalsIgnoreCase(text)) return EngGrammarUpperType.ADVERB;
		throw new AdapterValidationException("Part-of-Speech not recognized (value = %s)", text);
	}
}
