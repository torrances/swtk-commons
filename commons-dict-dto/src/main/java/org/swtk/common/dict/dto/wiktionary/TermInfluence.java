package org.swtk.common.dict.dto.wiktionary;

import org.swtk.common.dict.dto.wiktionary.adapter.TermInfluenceAdapter;

import com.trimc.blogger.commons.utils.string.StringUtils;

public class TermInfluence {

	private String foreignTerm;

	private String englishTerm;

	//	private String foreignLanguage;

	public String getEnglishTerm() {
		return englishTerm;
	}

	//	public String getForeignLanguage() {
	//		return foreignLanguage;
	//	}

	public String getForeignTerm() {
		return foreignTerm;
	}

	public boolean hasEnglishTerm() {
		return StringUtils.hasValue(getEnglishTerm());
	}

	//	public boolean hasForeignLanguage() {
	//		return StringUtils.hasValue(getForeignLanguage());
	//	}

	public boolean hasForeignTerm() {
		return StringUtils.hasValue(getForeignTerm());
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	public void setEnglishTerm(String englishTerm) {
		this.englishTerm = englishTerm;
	}

	//	public void setForeignLanguage(String foreignLanguage) {
	//		this.foreignLanguage = foreignLanguage;
	//	}

	public void setForeignTerm(String foreignTerm) {
		this.foreignTerm = foreignTerm;
	}

	@Override
	public String toString() {
		return TermInfluenceAdapter.toString(this);
	}
}
