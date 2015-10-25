package org.swtk.commons.dict.wiktionary.generated.k.o.o;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKOO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("kook", "{\"term\":\"kook\", \"etymology\":{\"influencers\":[], \"languages\":[\"hawaiian\"], \"text\":\"Possibly from \u0027cuckoo\u0027, or alternatively from Hawaiian \u0027kūkae\u0027 (feces) which can also refer to surfers with a lack of skill or non-locals.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An eccentric, strange or crazy person; a weirdo\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A board sport participant who has poor style or skill\", \"priority\":2}]}, \"synonyms\":{}}");

	add("kookology", "{\"term\":\"kookology\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|kook|ology|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The study of kooks, or eccentric people\", \"priority\":1}]}, \"synonyms\":{}}");

	add("koozie", "{\"term\":\"koozie\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|cosy?|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A decorated thermal insulation jacket for cans or bottles\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }