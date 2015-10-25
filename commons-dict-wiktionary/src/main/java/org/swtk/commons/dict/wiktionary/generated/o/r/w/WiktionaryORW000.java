package org.swtk.commons.dict.wiktionary.generated.o.r.w;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryORW000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("orwell", "{\"term\":\"orwell\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A village in Cambridgeshire, Englan\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A town in New Yor\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A village in Ohi\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A settlement in Prince Edward Islan\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A town in Vermont\", \"priority\":5}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }