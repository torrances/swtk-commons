package org.swtk.commons.dict.wiktionary.generated.r.u.e;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryRUE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ruelle", "{\"term\":\"ruelle\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{borrowing|fr|ruelle|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The space between the bed and the wall\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A chamber, especially as formerly used in France to hold a reception or a literary gathering\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A private circle , a coterie\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }