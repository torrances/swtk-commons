package org.swtk.common.dict.dto.wiktionary.adapter;

import org.swtk.common.dict.dto.wiktionary.Etymology;

import com.trimc.blogger.commons.utils.SetUtils;

public final class EtymologyAdapter {

	public static boolean isEmpty(Etymology bean) {
		if (null == bean) return true;
		
		if (bean.hasText() || bean.hasLanguages()) return false;
		
		return true;
	}

	public static String toString(Etymology etymology) {
		StringBuilder sb = new StringBuilder();

		sb.append("text = " + etymology.getText());
		if (etymology.hasLanguages()) sb.append(", languages = (" + SetUtils.toString(etymology.getLanguages(), ", ") + ")");

		return sb.toString();
	}

	public static Etymology transform(String text, String... languages) {
		Etymology bean = new Etymology();

		bean.setText(text);
		if (0 != languages.length) bean.setLanguages(SetUtils.toSet(languages));

		return bean;
	}
}
