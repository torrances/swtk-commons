package org.swtk.common.dict.dto.wiktionary.iter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Ignore;
import org.swtk.common.dict.dto.wiktionary.Definition;
import org.swtk.common.dict.dto.wiktionary.adapter.iter.DefinitionsAdapter;

import com.google.gson.annotations.Expose;

public class Definitions implements Iterable<Definition>, Iterator<Definition> {

	@Expose
	private Collection<Definition> list;

	@Ignore
	public void add(Definition... definitions) {
		for (Definition definition : definitions)
			getList().add(definition);
	}

	public Collection<Definition> getList() {
		if (null == list) setList(new ArrayList<Definition>());
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

	@Ignore
	@Override
	public Iterator<Definition> iterator() {
		return getList().iterator();
	}

	@Ignore
	@Override
	public Definition next() {
		return iterator().next();
	}

	public void setList(Collection<Definition> list) {
		this.list = list;
	}

	@Ignore
	public int size() {
		return getList().size();
	}

	@Ignore
	@Override
	public String toString() {
		return DefinitionsAdapter.toString(this);
	}
}
