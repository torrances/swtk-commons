package org.swtk.common.core;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CommonsIocContainerTest {

	@Test
	public void initialize() throws Throwable {
		assertNotNull(CommonsIocContainer.getContext());
	}
}
