package org.swtk.commons.dict.wiktionary.generated.i.c.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryICA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("icaridin", "{\"term\":\"icaridin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An almost colourless and odourless insect repellent\", \"priority\":1}]}, \"synonyms\":{}}");

	add("icarus", "{\"term\":\"icarus\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin {{m|la|Icarus}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Greek mythological figure, son of Daedalus, who escaped from the labyrinth of Knossos in Crete flying with wings made by his father from feathers attached with wax. His journey took an unfortunate turn when not following his father\u0027s advice he flew too near to the sun which melted the wax which connected the feathers of the wings, making him fall and drown in the Aegean sea. The Aegean sea was formerly known as Icarian Sea. The island of Icaria was also named after him\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }