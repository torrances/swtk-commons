package org.swtk.common.dict.dto;

import org.junit.Test;
import org.swtk.common.dict.dto.iso639.Language;
import org.swtk.common.dict.dto.iso639.adapter.LanguageAdapter;

import static org.junit.Assert.*;

public final class LanguageAdapterTest {

	@Test
	public void transform() throws Throwable {
		Language entity = LanguageAdapter.transform("and				I	L	Ansus	");
		assertNotNull(entity);
		assertEquals("id = and, scope = I, language-type = L, name = ansus, short-name = ansus", entity.toString());
	}
}
