package org.swtk.commons.dict.wiktionary.generated.f.m.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryFMA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("fmait", "{\"term\":\"fmait\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Abbreviation of \u0027feto-maternal alloimmune thrombocytopenia\u0027.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A too-low number of platelets in a fetus\u0027 blood, due to his mother\u0027s antibodies having been passed via the placenta and attacking his own platelets\", \"priority\":1}]}, \"synonyms\":{}}");

	add("fmaitp", "{\"term\":\"fmaitp\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Abbreviation of \u0027feto-maternal alloimmune thrombocytopenia\u0027.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A too-low number of platelets in a fetus\u0027 blood, due to his mother\u0027s antibodies having been passed via the placenta and attacking his own platelets\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }