package org.swtk.common.dict.dto;

import org.junit.Test;
import org.swtk.common.dict.dto.adapter.EntityAdapter;
import static org.junit.Assert.*;

public final class EntityAdapterTest {

	@Test
	public void transform() throws Throwable {
		Entity entity = EntityAdapter.transform("and				I	L	Ansus	");
		assertNotNull(entity);
		assertEquals("id = and, scope = I, language-type = L, name = ansus, short-name = ansus", entity.toString());
	}
}
