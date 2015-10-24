package org.swtk.commons.dict.wiktionary.generated.p.e.u;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryPEU000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("peucedanin", "{\"term\":\"peucedanin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{taxlink|Peucedanum|genus|noshow\u003d1}} {{suffix||in|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A tasteless white crystalline substance extracted from the roots of the sulphurwort (), masterwort (), and related plants\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }