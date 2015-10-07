package org.swtk.common.framework.contract;

import java.io.File;
import java.util.Collection;

import com.trimc.blogger.commons.type.Codepage;

public class FileReaderContract {

	private Codepage			codepage;

	private String				dataSource;

	private Collection<File>	files;

	public Codepage getCodepage() {
		return codepage;
	}

	public String getDataSource() {
		return dataSource;
	}

	public Collection<File> getFiles() {
		return files;
	}

	public void setCodepage(Codepage codepage) {
		this.codepage = codepage;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public void setFiles(Collection<File> files) {
		this.files = files;
	}
}
