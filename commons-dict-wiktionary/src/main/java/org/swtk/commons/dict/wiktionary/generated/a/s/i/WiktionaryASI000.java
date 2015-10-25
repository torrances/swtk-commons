package org.swtk.commons.dict.wiktionary.generated.a.s.i;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryASI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("asiaphile", "{\"term\":\"asiaphile\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Asia|phile|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person interested in Eastern culture\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A Caucasian male with sexual interests in Asian women\", \"priority\":2}]}, \"synonyms\":{}}");

	add("asiaphobia", "{\"term\":\"asiaphobia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|Asia|phobia|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Fear, hate, or dislike of Asians and those of Asian descendant\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }