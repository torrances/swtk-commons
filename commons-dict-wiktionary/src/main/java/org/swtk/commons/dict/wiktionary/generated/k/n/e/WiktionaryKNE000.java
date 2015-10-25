package org.swtk.commons.dict.wiktionary.generated.k.n.e;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKNE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("kneedness", "{\"term\":\"kneedness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|kneed|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or quality of having a particular type of or number of knees\", \"priority\":1}]}, \"synonyms\":{}}");

	add("kneesies", "{\"term\":\"kneesies\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|knee|sies|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"flirtatious touching using the knee(s\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"She kept trying to play \u0027\u0027kneesies\u0027\u0027 with me under the table\", \"priority\":2}]}, \"synonyms\":{}}");

	add("knesset", "{\"term\":\"knesset\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Hebrew\"], \"text\":\"From Hebrew \u0027כְּנֶסֶת\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The Israeli parliament, located in Jerusalem\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }