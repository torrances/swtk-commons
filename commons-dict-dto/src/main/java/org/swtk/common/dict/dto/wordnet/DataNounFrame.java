package org.swtk.common.dict.dto.wordnet;

import org.junit.Ignore;
import org.swtk.common.dict.dto.wordnet.adapter.DataNounFrameAdapter;
import org.swtk.common.dict.types.DataNounFrameType;

import com.google.gson.annotations.Expose;
import com.trimc.blogger.commons.type.EngGrammarUpperType;
import com.trimc.blogger.commons.utils.string.StringUtils;

public class DataNounFrame {

	@Expose
	private DataNounFrameType frameType;

	@Expose
	private String id;

	@Expose
	private String semPointer;

	@Expose
	private EngGrammarUpperType upperType;

	public DataNounFrameType getFrameType() {
		return frameType;
	}

	public String getId() {
		return id;
	}

	public String getSemPointer() {
		return semPointer;
	}

	public EngGrammarUpperType getUpperType() {
		return upperType;
	}

	@Ignore
	public boolean hasFrameType() {
		return null != getFrameType();
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
	public boolean hasSemPointer() {
		return StringUtils.hasValue(getSemPointer());
	}

	@Ignore
	public boolean hasUpperType() {
		return null != getUpperType();
	}

	public void setFrameType(DataNounFrameType frameType) {
		this.frameType = frameType;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setSemPointer(String semPointer) {
		this.semPointer = semPointer;
	}

	public void setUpperType(EngGrammarUpperType upperType) {
		this.upperType = upperType;
	}

	@Ignore
	@Override
	public String toString() {
		return DataNounFrameAdapter.toString(this);
	}
}
