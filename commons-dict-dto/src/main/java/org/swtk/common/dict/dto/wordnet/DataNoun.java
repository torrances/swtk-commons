package org.swtk.common.dict.dto.wordnet;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Ignore;
import org.swtk.common.dict.dto.wordnet.adapter.DataNounAdapter;

import com.google.gson.annotations.Expose;
import com.trimc.blogger.commons.type.EngGrammarUpperType;
import com.trimc.blogger.commons.utils.string.StringUtils;

public class DataNoun {

	@Expose
	private String id;

	@Expose
	private EngGrammarUpperType upperType;

	@Expose
	private String term;

	@Expose
	private Collection<String> synonyms;

	@Expose
	private DataNounFrames dataNounFrames;

	public DataNounFrames getDataNounFrames() {
		return dataNounFrames;
	}

	public String getId() {
		return id;
	}

	public Collection<String> getSynonyms() {
		if (null == synonyms) setSynonyms(new ArrayList<String>());
		return synonyms;
	}

	public String getTerm() {
		return term;
	}

	public EngGrammarUpperType getUpperType() {
		return upperType;
	}

	public boolean hasDataNounFrames() {
		return null != getDataNounFrames();
	}

	@Ignore
	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Ignore
	public boolean hasId() {
		return StringUtils.hasValue(getId());
	}

	@Ignore
	public boolean hasSynonyms() {
		return !getSynonyms().isEmpty();
	}

	@Ignore
	public boolean hasTerm() {
		return StringUtils.hasValue(getTerm());
	}

	@Ignore
	public boolean hasUpperType() {
		return null != getUpperType();
	}

	public void setDataNounFrames(DataNounFrames dataNounFrames) {
		this.dataNounFrames = dataNounFrames;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setSynonyms(Collection<String> synonyms) {
		this.synonyms = synonyms;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public void setUpperType(EngGrammarUpperType upperType) {
		this.upperType = upperType;
	}

	@Ignore
	@Override
	public String toString() {
		return DataNounAdapter.toString(this);
	}
}
