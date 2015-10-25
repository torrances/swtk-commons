package org.swtk.commons.dict.wiktionary.generated.i.p.s;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryIPS000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ipsedixitism", "{\"term\":\"ipsedixitism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|ipse dixit|ism|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"an unfounded, false and dogmatic assertion\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ipswich", "{\"term\":\"ipswich\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The county town of Suffolk, England\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }