package org.swtk.commons.dict.stopwords;

import java.util.Collection;

import org.swtk.common.framework.type.LanguageTag;
import org.swtk.commons.dict.stopwords.generated.StopwordsEn;
import org.swtk.commons.dict.stopwords.generated.StopwordsEs;

public class StopwordsDb {

	public static boolean isStopword(String token) {

		if (StopwordsEn.has(token)) return true;
		if (StopwordsEs.has(token)) return true;

		return false;
	}

	public static boolean isStopword(String token, LanguageTag languageTag) {

		if (LanguageTag.ENGLISH == languageTag) return StopwordsEn.has(token);
		else if (LanguageTag.SPANISH == languageTag) return StopwordsEs.has(token);

		return false;
	}

	public static Collection<String> terms(LanguageTag languageTag) {
		if (LanguageTag.ENGLISH == languageTag) return StopwordsEn.terms();
		else if (LanguageTag.SPANISH == languageTag) return StopwordsEs.terms();

		return null;
	}
}
