package org.swtk.commons.dict.wiktionary.generated.b.e.o;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryBEO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("beowulf", "{\"term\":\"beowulf\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\"], \"text\":\"Old english (ca. 450-1100) Old English|Beowulf\u0027.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An Anglo-Saxon personal name, usually with reference to the hero of an Old English epic poem, or to the poem itself\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }