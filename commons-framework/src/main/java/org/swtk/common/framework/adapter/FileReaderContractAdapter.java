package org.swtk.common.framework.adapter;

import java.io.File;
import java.util.Collection;

import org.swtk.common.framework.contract.FileReaderContract;

import com.trimc.blogger.commons.LogManager;
import com.trimc.blogger.commons.exception.AdapterValidationException;
import com.trimc.blogger.commons.type.Codepage;

public final class FileReaderContractAdapter {

	public static LogManager	logger	= new LogManager(FileReaderContractAdapter.class);

	public static FileReaderContract transform(String dataSource, Collection<File> files, Codepage codepage) throws AdapterValidationException {
		FileReaderContract contract = new FileReaderContract();

		contract.setDataSource(dataSource);
		contract.setFiles(files);
		contract.setCodepage(codepage);

		return contract;
	}
}
