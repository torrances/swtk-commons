package org.swtk.common.dict.dto.wordnet;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Ignore;
import org.swtk.common.dict.dto.wordnet.adapter.IndexNounAdapter;

import com.google.gson.annotations.Expose;
import com.trimc.blogger.commons.type.EngGrammarUpperType;
import com.trimc.blogger.commons.utils.string.StringUtils;

/**
 *  Purpose:
 *  Represents a line from "index.noun"
 */
public class IndexNoun {

	/**
	 * 	Purpose: 		Lemma
	 * 	Description:	lower case ASCII text of word or collocation. Collocations are formed by joining individual words with an underscore (_) character. 
	 * 	Column:			0
	 */
	@Expose
	private String term;

	/**
	 * 	Purpose: 		synset_cnt 
	 * 	Description:	Number of synsets that lemma is in. This is the number of senses of the word in WordNet. See Sense Numbers below for a discussion of how sense numbers are assigned and the order of synset_offset s in the index files.  
	 * 	Column:			2
	 * 	Notes:			This is a good measure of ambiguity:
	 * 						 1 = not ambiguous 	(only one sense in which this term can be used)
	 * 					   >=2 = ambigous 		(2 more senses in which this term can be appleid)
	 */
	@Expose
	private Integer synsetCount;

	/**
	 * 	Purpose: 		pos
	 * 	Description:	Syntactic category: n for noun files, v for verb files, a for adjective files, r for adverb files. 
	 * 	Column:			1
	 */
	@Expose
	private EngGrammarUpperType upperType;

	/**
	 * 	Purpose: 		synset_offset 
	 * 	Description:	Byte offset in data.pos file of a synset containing lemma . Each synset_offset in the list corresponds to a different sense of lemma in WordNet. synset_offset is an 8 digit, zero-filled decimal integer that can be used with fseek(3) to read a synset from the data file. When passed to read_synset(3WN) along with the syntactic category, a data structure containing the parsed synset is returned.  
	 * 	Column:			(last)
	 * 	Notes:			the number of IDs directly corresponds to the number of synsets (synsetCount)
	 */
	@Expose
	private Collection<String> ids;

	@Ignore
	public void addIds(String... ids) {
		for (String id : ids)
			getIds().add(id);
	}

	public Collection<String> getIds() {
		if (null == ids) setIds(new ArrayList<String>());
		return ids;
	}

	public Integer getSynsetCount() {
		return synsetCount;
	}

	public String getTerm() {
		return term;
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
	public boolean hasIds() {
		return !getIds().isEmpty();
	}

	@Ignore
	public boolean hasSynsetCount() {
		return null != getSynsetCount();
	}

	@Ignore
	public boolean hasTerm() {
		return StringUtils.hasValue(getTerm());
	}

	@Ignore
	public boolean hasUpperType() {
		return null != getUpperType();
	}

	public void setIds(Collection<String> ids) {
		this.ids = ids;
	}

	public void setSynsetCount(Integer synsetCount) {
		this.synsetCount = synsetCount;
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
		return IndexNounAdapter.toString(this);
	}
}
