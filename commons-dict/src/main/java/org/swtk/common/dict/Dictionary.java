package org.swtk.common.dict;

import java.util.Set;

import org.springframework.beans.factory.BeanNameAware;

public interface Dictionary extends BeanNameAware {

	Set<String> entries();
}
