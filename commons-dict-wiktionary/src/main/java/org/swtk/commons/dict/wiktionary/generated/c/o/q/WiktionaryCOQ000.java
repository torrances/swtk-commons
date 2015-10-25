package org.swtk.commons.dict.wiktionary.generated.c.o.q;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryCOQ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("coquet", "{\"term\":\"coquet\", \"etymology\":{\"influencers\":[{}], \"languages\":[], \"text\":\"{{borrowing|fr|lang\u003den}}, from \u0027coq\u0027 (cockerel) + \u0027-et\u0027 masculine diminutive suffix \u003d “little cockerel”.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A flirtatious female; a coquette\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A flirtatious male\", \"priority\":2}]}, \"synonyms\":{}}");

	add("coquetry", "{\"term\":\"coquetry\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\"], \"text\":\"From French \u0027coquetterie\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An affectation of amorous tenderness, especially of a woman directed towards a man\", \"priority\":1}]}, \"synonyms\":{}}");

	add("coquette", "{\"term\":\"coquette\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{borrowing|fr|lang\u003den}} \u0027coquette\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A woman who flirts or plays with men\u0027s affections\", \"priority\":1}]}, \"synonyms\":{}}");

	add("coquettishness", "{\"term\":\"coquettishness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|coquettish|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or quality of being coquettish\", \"priority\":1}]}, \"synonyms\":{}}");

	add("coquimbite", "{\"term\":\"coquimbite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Coquimbo|ite|lang\u003den}}, after the province of Chile where it was found.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The nonahydrate of iron(III) sulfate\", \"priority\":1}]}, \"synonyms\":{}}");

	add("coquina", "{\"term\":\"coquina\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of several small marine clams, of the species , common in US coastal waters\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A soft form of limestone made of fragments of shells\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }