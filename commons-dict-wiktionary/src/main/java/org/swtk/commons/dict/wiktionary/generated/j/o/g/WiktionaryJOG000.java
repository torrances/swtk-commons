package org.swtk.commons.dict.wiktionary.generated.j.o.g;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryJOG000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("jogger", "{\"term\":\"jogger\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|jog|er|lang\u003den}}, one who jogs.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person who jogs (as exercise\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A tracksuit, particularly the trousers\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A printing press operator who removes, jogs, and stacks the sheets or signatures of paper\", \"priority\":3}]}, \"synonyms\":{}}");

	add("joggers", "{\"term\":\"joggers\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A tracksuit, particularly the trousers, a jogger\", \"priority\":1}]}, \"synonyms\":{}}");

	add("jogging", "{\"term\":\"jogging\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{borrowing|en|jogging|lang\u003dfr}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The action of the verb \u0027\u0027to jog\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"His \u0027\u0027jogging\u0027\u0027 of my memory helped me recall what happened that day\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The practice of running at the pace of a slow run for exercise\", \"priority\":3}]}, \"synonyms\":{}}");

	add("jogtrot", "{\"term\":\"jogtrot\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|jog|trot|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A slow, regular, jolting gait\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }