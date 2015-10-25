package org.swtk.commons.dict.wiktionary.generated.t.e.k;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryTEK000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("teknonymy", "{\"term\":\"teknonymy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The cultural practice of referring to by the names of their\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tektology", "{\"term\":\"tektology\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A Bogdanovian discipline that unified all social, biological and physical sciences by considering them as systems of relationships\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }