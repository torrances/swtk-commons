package org.swtk.common.dict.beans;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.swtk.common.dict.DictionaryBase;

import com.trimc.blogger.commons.LogManager;

@Lazy
@Component("adjectivesDictionary")
public class AdjectiveDictionary extends DictionaryBase {

	public static LogManager	logger	= new LogManager(AdjectiveDictionary.class);

	@Autowired
	@Value("${properties.adjectives.path}")
	private Resource			resource;

	@Override
	public Set<String> entries() {
		return set(resource);
	}
}
