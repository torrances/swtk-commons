package org.swtk.common.dict.dto.wiktionary;

import java.util.ArrayList;
import java.util.Collection;

import org.swtk.common.dict.dto.wiktionary.adapter.EntryAdapter;
import org.swtk.common.dict.dto.wiktionary.iter.Definitions;
import org.swtk.common.dict.dto.wiktionary.iter.Synonyms;

import com.google.gson.annotations.Expose;
import com.trimc.blogger.commons.utils.string.StringUtils;

public class Entry {

	@Expose
	private String term;

	@Expose
	private Etymology etymology;

	@Expose
	private Definitions definitions;

	@Expose
	private Synonyms synonyms;

	@Expose
	private Collection<String> seeAlso;

	public Definitions getDefinitions() {
		return definitions;
	}

	public Etymology getEtymology() {
		return etymology;
	}

	public Collection<String> getSeeAlso() {
		if (null == seeAlso) setSeeAlso(new ArrayList<String>());
		return seeAlso;
	}

	public Synonyms getSynonyms() {
		return synonyms;
	}

	public String getTerm() {
		return term;
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	public boolean hasTerm() {
		return StringUtils.hasValue(getTerm());
	}

	public void setDefinitions(Definitions definitions) {
		this.definitions = definitions;
	}

	public void setEtymology(Etymology etymology) {
		this.etymology = etymology;
	}

	public void setSeeAlso(Collection<String> seeAlso) {
		this.seeAlso = seeAlso;
	}

	public void setSynonyms(Synonyms synonyms) {
		this.synonyms = synonyms;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	@Override
	public String toString() {
		return EntryAdapter.toString(this);
	}
}
