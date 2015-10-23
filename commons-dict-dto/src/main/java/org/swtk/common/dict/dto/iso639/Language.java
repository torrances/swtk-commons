package org.swtk.common.dict.dto.iso639;

import java.util.Set;
import java.util.TreeSet;

import org.swtk.common.dict.dto.iso639.adapter.LanguageAdapter;
import org.swtk.common.dict.types.LanguageType;
import org.swtk.common.dict.types.ScopeType;

import com.trimc.blogger.commons.utils.string.StringUtils;

public class Language {

	/**
	 * 	Purpose:
	 * 	The three-letter 639-3 identifier
	 */
	private String id;

	/**
	 * 	Purpose:
	 * 	I(ndividual), M(acrolanguage), S(pecial)
	 */
	private ScopeType scope;

	/**
	 * 	Purpose:
	 * 	- set of common variants for the language name
	 */
	private Set<String> variations;

	/**
	 * 	Purpose:
	 * 	Reference language name
	 */
	private String name;
	
	/**
	 * 	Purpose:
	 * 	- remove parenthesis (or other explanations) from name
	 * 	- transform to lower case
	 */
	private String shortName;

	/**
	 * 	Purpose:
	 * 	A(ncient), C(onstructed), E(xtinct), H(istorical), L(iving), S(pecial)
	 */
	private LanguageType languageType;

	public String getId() {
		return id;
	}

	public LanguageType getLanguageType() {
		return languageType;
	}

	public String getName() {
		return name;
	}

	public ScopeType getScope() {
		return scope;
	}

	public String getShortName() {
		return shortName;
	}

	public Set<String> getVariations() {
		if (null == variations) setVariations(new TreeSet<String>());
		return variations;
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	public boolean hasId() {
		return StringUtils.hasValue(getId());
	}

	public boolean hasLanguageType() {
		return null != getLanguageType();
	}

	public boolean hasName() {
		return StringUtils.hasValue(getName());
	}

	public boolean hasScope() {
		return null != getScope();
	}

	public boolean hasShortName() {
		return StringUtils.hasValue(getShortName());
	}

	public boolean hasVariations() {
		return !getVariations().isEmpty();
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setLanguageType(LanguageType languageType) {
		this.languageType = languageType;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setScope(ScopeType scope) {
		this.scope = scope;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public void setVariations(Set<String> variations) {
		this.variations = variations;
	}

	@Override
	public String toString() {
		return LanguageAdapter.toString(this);
	}
}
