package org.swtk.common.dict.dto.wordnet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Ignore;
import org.swtk.common.dict.dto.wordnet.adapter.DataNounFramesAdapter;

import com.google.gson.annotations.Expose;

public class DataNounFrames implements Iterable<DataNounFrame>, Iterator<DataNounFrame> {

	@Expose
	private List<DataNounFrame> list;

	@Ignore
	public void add(DataNounFrame... frames) {
		for (DataNounFrame frame : frames)
			getList().add(frame);
	}

	public List<DataNounFrame> getList() {
		if (null == list) setList(new ArrayList<DataNounFrame>());
		return list;
	}

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
	public Iterator<DataNounFrame> iterator() {
		return getList().iterator();
	}

	@Ignore
	@Override
	public DataNounFrame next() {
		return iterator().next();
	}

	public void setList(List<DataNounFrame> list) {
		this.list = list;
	}

	@Ignore
	public int size() {
		return getList().size();
	}

	@Override
	public String toString() {
		return DataNounFramesAdapter.toString(this);
	}
}
