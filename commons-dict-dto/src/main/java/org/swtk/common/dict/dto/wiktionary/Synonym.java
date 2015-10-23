package org.swtk.common.dict.dto.wiktionary;

import org.junit.Ignore;
import org.swtk.common.dict.dto.wiktionary.adapter.SynonymAdapter;
import org.swtk.common.dict.dto.wiktionary.type.SynonymQualifier;

import com.google.gson.annotations.Expose;
import com.trimc.blogger.commons.utils.string.StringUtils;

public class Synonym {

	@Expose
	private String text;

	@Expose
	private SynonymQualifier synonymQualifier;

	public SynonymQualifier getSynonymQualifier() {
		return synonymQualifier;
	}

	public String getText() {
		return text;
	}

	@Ignore
	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Ignore
	public boolean hasSynonymQualifier() {
		return null != getSynonymQualifier();
	}

	@Ignore
	public boolean hasText() {
		return StringUtils.hasValue(getText());
	}

	public void setSynonymQualifier(SynonymQualifier synonymQualifier) {
		this.synonymQualifier = synonymQualifier;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Ignore
	@Override
	public String toString() {
		return SynonymAdapter.toString(this);
	}
}
