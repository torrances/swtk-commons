package org.swtk.common.dict.iso639;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.Map;

import org.junit.Test;
import org.swtk.common.dict.iso639.dmo.Iso639Db;

import com.trimc.blogger.commons.utils.string.StringUtils;

public final class Iso639DbTest {

	@Test
	public void getLanguageNamesWithVariantsAsSet() throws Throwable {
		Collection<String> set = Iso639Db.getLanguageNamesWithVariantsAsSet();
		assertNotNull(set);
		assertTrue(set.size() > 1000);
	}

	@Test
	public void getLanguageNamesWithVariantsAsMap() throws Throwable {
		Map<String, Collection<String>> map = Iso639Db.getLanguageNamesWithVariantsAsMap();
		assertNotNull(map);
		assertTrue(map.size() > 1000);
		
		for (Map.Entry<String, Collection<String>> entry : map.entrySet()) {
			System.err.println(entry.getKey() + " ----- " + StringUtils.toString(entry.getValue(), ", "));
			
		}
	}
}
