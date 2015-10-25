package org.swtk.commons.dict.wiktionary.generated.u.a.c;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryUAC000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("uachtarán", "{\"term\":\"uachtarán\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{borrowing|ga|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Title of a person who holds the office of President of Ireland\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The head of state of Ireland; the Irish president\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }