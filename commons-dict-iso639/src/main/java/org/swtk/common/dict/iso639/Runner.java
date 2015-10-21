package org.swtk.common.dict.iso639;

import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.trimc.blogger.commons.exception.BusinessException;
import com.trimc.blogger.commons.type.Codepage;
import com.trimc.blogger.commons.utils.file.FileUtils;
import com.trimc.blogger.commons.utils.string.StringUtils;

public class Runner {

	public static void main(String... args) throws Throwable {

		File TEMPLATE = new File("../commons-dict-iso639/Library/template/Iso639_$alpha$num.java");
		if (!TEMPLATE.exists()) throw new BusinessException("Template not found (path = %s)", TEMPLATE.getAbsolutePath());

		File IN = new File("../commons-dict-iso639/src/main/resources/source/iso-639-3_20150505.tab");
		if (!IN.exists()) throw new BusinessException("Input File not found (path = %s)", IN.getAbsolutePath());

		Map<String, Set<String>> map = new TreeMap<String, Set<String>>();
		for (String line : FileUtils.toList(IN, Codepage.UTF_8)) {

			if (line.startsWith("Id	Part2B")) continue;
			if (!StringUtils.hasValue(line)) continue;

			String key = line.substring(0, 1);
			Set<String> lines = (map.containsKey(key)) ? map.get(key) : new TreeSet<String>();
			lines.add(line);
			map.put(key, lines);
		}

		final String num = "1";
		final String clazz = Runner.class.toGenericString();
		final String author = "cmtrim";
		final String datetime = String.valueOf(System.currentTimeMillis());
		final String url = "https://github.com/torrances/swtk-data";

		for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
			if (entry.getValue().isEmpty()) continue;

			String alpha = entry.getKey().toUpperCase();
			String content = getContent(entry.getValue());

			String template = FileUtils.toString(TEMPLATE, Codepage.UTF_8);
			template = StringUtils.replace(template, "$num", num);
			template = StringUtils.replace(template, "$clazz", clazz);
			template = StringUtils.replace(template, "$name", author);
			template = StringUtils.replace(template, "$datetime", datetime);
			template = StringUtils.replace(template, "$url", url);
			template = StringUtils.replace(template, "$alpha", alpha);
			template = StringUtils.replace(template, "$content", content);

			String outFileName = TEMPLATE.getName();
			outFileName = StringUtils.replace(outFileName, "$alpha", alpha);
			outFileName = StringUtils.replace(outFileName, "$num", num);

			FileUtils.toFile(template, "../commons-dict-iso639/src/main/java/org/swtk/common/dict/iso639/generated/" + outFileName, Codepage.UTF_8);
		}
	}

	private static String getContent(Set<String> lines) {
		StringBuilder sb = new StringBuilder();

		Iterator<String> iter = lines.iterator();
		while (iter.hasNext()) {
			sb.append("\tadd(\"" + iter.next() + "\");");
			if (iter.hasNext()) sb.append(System.lineSeparator());
		}

		return sb.toString();
	}
}
