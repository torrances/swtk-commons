package org.swtk.commons.dict.wiktionary.generated.s.a.h;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionarySAH000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("sahara", "{\"term\":\"sahara\", \"etymology\":{\"influencers\":[], \"languages\":[\"Arabic\", \"English\"], \"text\":\"From Arabic {{l|ar|صَحْرَاء||desert}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A desert in North Africa, the largest hot desert in the world\", \"priority\":1}]}, \"synonyms\":{}}");

	add("sahidic", "{\"term\":\"sahidic\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A Coptic dialect spoken in southern Egypt\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }