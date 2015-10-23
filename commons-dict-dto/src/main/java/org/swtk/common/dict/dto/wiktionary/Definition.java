package org.swtk.common.dict.dto.wiktionary;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Ignore;
import org.swtk.common.dict.dto.wiktionary.adapter.DefinitionAdapter;

import com.google.gson.annotations.Expose;
import com.trimc.blogger.commons.type.EngGrammarUpperType;
import com.trimc.blogger.commons.utils.string.StringUtils;

public class Definition {

	@Expose
	private EngGrammarUpperType upperType;

	@Expose
	private String text;

	@Expose
	private Integer priority;

	/**
	 * 	Purpose:
	 * 	Given a definition:
	 * 		"A large Arctic marine mammal related to seals and having long tusks, tough, wrinkled skin, and four flippers, Odobenus rosmarus"
	 * 	extract
	 * 		{	"large arctic marine mammal",
	 * 			"arctic marine mammal",
	 * 			"marine mammal",
	 * 			"mammal",
	 * 			"long tusks",
	 * 			"wrinkled skin",
	 * 			"four flippers"
	 * 		}
	 */
	@Expose
	private Collection<String> nounPhraseAttributes;

	public Collection<String> getNounPhraseAttributes() {
		if (null == nounPhraseAttributes) setNounPhraseAttributes(new ArrayList<String>());
		return nounPhraseAttributes;
	}

	public Integer getPriority() {
		return priority;
	}

	public String getText() {
		return text;
	}

	public EngGrammarUpperType getUpperType() {
		return upperType;
	}

	@Ignore
	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Ignore
	public boolean hasNounPhraseAttributes() {
		return !getNounPhraseAttributes().isEmpty();
	}

	public boolean hasPriority() {
		return null != getPriority();
	}

	@Ignore
	public boolean hasText() {
		return StringUtils.hasValue(getText());
	}

	@Ignore
	public boolean hasUpperType() {
		return null != getUpperType();
	}

	public void setNounPhraseAttributes(Collection<String> nounPhraseAttributes) {
		this.nounPhraseAttributes = nounPhraseAttributes;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setUpperType(EngGrammarUpperType upperType) {
		this.upperType = upperType;
	}

	@Ignore
	@Override
	public String toString() {
		return DefinitionAdapter.toString(this);
	}
}
