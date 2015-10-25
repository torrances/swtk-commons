package org.swtk.commons.dict.wiktionary.generated.f.i.z;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryFIZ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("fizz", "{\"term\":\"fizz\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Onomatopoeia.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An emission of a rapid stream of bubbles\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"I poured a cola and waited for the \u0027\u0027fizz\u0027\u0027 to settle down before topping off the glass\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The sound of such an emission\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Evan sat back in the hot tub and listened to the relaxing \u0027\u0027fizz\u0027\u0027 and pops produced by the eruption of bubbles\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A carbonated beverage\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"Nathan ordered an orange \u0027\u0027fizz\u0027\u0027 from the soda jerk at the counter\", \"priority\":6}]}, \"synonyms\":{}}");

	add("fizzy", "{\"term\":\"fizzy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A non-alcoholic carbonated beverage. Short for fizzy drink\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }