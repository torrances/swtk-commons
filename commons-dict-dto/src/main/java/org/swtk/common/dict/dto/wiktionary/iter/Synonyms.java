package org.swtk.common.dict.dto.wiktionary.iter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Ignore;
import org.swtk.common.dict.dto.wiktionary.Synonym;
import org.swtk.common.dict.dto.wiktionary.adapter.iter.SynonymsAdapter;

import com.google.gson.annotations.Expose;

public class Synonyms implements Iterable<Synonym>, Iterator<Synonym> {

	@Expose
	private Collection<Synonym> list;

	@Ignore
	public void add(Synonym... synonyms) {
		for (Synonym synonym : synonyms)
			getList().add(synonym);
	}

	public Collection<Synonym> getList() {
		if (null == list) setList(new ArrayList<Synonym>());
		return list;
	}

	@Ignore
	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Ignore
	@Override
	public boolean hasNext() {
		return iterator().hasNext();
	}

	@Ignore
	public boolean isEmpty() {
		return getList().isEmpty();
	}

	@Override
	@Ignore
	public Iterator<Synonym> iterator() {
		return getList().iterator();
	}

	@Ignore
	@Override
	public Synonym next() {
		return iterator().next();
	}

	public void setList(Collection<Synonym> list) {
		this.list = list;
	}

	@Ignore
	public int size() {
		return getList().size();
	}

	@Ignore
	@Override
	public String toString() {
		return SynonymsAdapter.toString(this);
	}
}
