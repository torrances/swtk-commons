package org.swtk.common.dict;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.core.io.Resource;

import com.trimc.blogger.commons.LogManager;

public abstract class DictionaryBase implements Dictionary {

	public static LogManager	logger	= new LogManager(DictionaryBase.class);

	private String				beanName;

	public String getBeanName() {
		return beanName;
	}

	public Set<String> set(Resource resource) {
		Set<String> set = new TreeSet<String>();

		try {

			BufferedReader reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
			for (String line = reader.readLine(); line != null; line = reader.readLine())
				set.add(line);

		} catch (IOException e) {
			logger.error(e, "Failed to Load Dictionary (name = %s)", getBeanName());
		}

		return set;
	}

	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}
}
