package org.swtk.commons.dict.wiktionary.generated.s.p.y;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionarySPY000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("spyglass", "{\"term\":\"spyglass\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|spy|glass|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A small portable telescope\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A pair of binoculars\", \"priority\":2}]}, \"synonyms\":{}}");

	add("spyplane", "{\"term\":\"spyplane\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|spy|plane|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A military aircraft used for surveillance\", \"priority\":1}]}, \"synonyms\":{}}");

	add("spyware", "{\"term\":\"spyware\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|spy|ware|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"programs that surreptitiously monitor and report the actions of a computer user\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }