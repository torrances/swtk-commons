package org.swtk.common.dict.dto.wiktionary;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Ignore;
import org.swtk.common.dict.dto.wiktionary.adapter.EtymologyAdapter;

import com.google.gson.annotations.Expose;
import com.trimc.blogger.commons.utils.string.StringUtils;

public class Etymology {

	@Expose
	private Collection<TermInfluence> influencers;

	@Expose
	private Collection<String> languages;

	@Expose
	private String text;

	public Collection<TermInfluence> getInfluencers() {
		if (null == influencers) setInfluencers(new ArrayList<TermInfluence>());
		return influencers;
	}

	public Collection<String> getLanguages() {
		if (null == languages) setLanguages(new ArrayList<String>());
		return languages;
	}

	public String getText() {
		return text;
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Ignore
	public boolean hasLanguages() {
		return !getLanguages().isEmpty();
	}

	@Ignore
	public boolean hasText() {
		return StringUtils.hasValue(getText());
	}

	public void setInfluencers(Collection<TermInfluence> influencers) {
		this.influencers = influencers;
	}

	public void setLanguages(Collection<String> languages) {
		this.languages = languages;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return EtymologyAdapter.toString(this);
	}
}
