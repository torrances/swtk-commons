package org.swtk.commons.dict.wiktionary.generated.b.o.f;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryBOF000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("boffin", "{\"term\":\"boffin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{unk.|en}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A scientist or engineer, especially one engaged in technological or military research\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }