package org.swtk.commons.dict.wiktionary.generated.h.i.b;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryHIB000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("hibbingite", "{\"term\":\"hibbingite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\u0027-ite\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An orthorhombic-dipyramidal mineral containing chlorine, hydrogen, iron, magnesium, and oxygen\", \"priority\":1}]}, \"synonyms\":{}}");

	add("hibernation", "{\"term\":\"hibernation\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin \u0027hibernatio\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A state of inactivity and metabolic depression in animals during winter\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A standby state which conserves power without losing the contents of memory\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A state of minimum power consumption\", \"priority\":3}]}, \"synonyms\":{}}");

	add("hibernicization", "{\"term\":\"hibernicization\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The act or process of making something Irish\", \"priority\":1}]}, \"synonyms\":{}}");

	add("hibernophile", "{\"term\":\"hibernophile\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|Hiberno|phile|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Someone who has a lov\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"love of Ireland and/or Irish culture\", \"priority\":2}]}, \"synonyms\":{}}");

	add("hibernophilia", "{\"term\":\"hibernophilia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|Hiberno|philia|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A lov\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"love of Ireland and Irish culture\", \"priority\":2}]}, \"synonyms\":{}}");

	add("hibschite", "{\"term\":\"hibschite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Hibsch|ite|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An isometric-hexoctahedral mineral containing aluminum, calcium, hydrogen, oxygen, and silicon\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }