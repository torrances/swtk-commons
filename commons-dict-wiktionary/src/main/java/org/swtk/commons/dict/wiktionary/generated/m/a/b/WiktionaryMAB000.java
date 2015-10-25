package org.swtk.commons.dict.wiktionary.generated.m.a.b;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryMAB000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("mabel", "{\"term\":\"mabel\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"Latin\"], \"text\":\"English form of Amabel, from Latin \u0027amabilis\u0027 (lovable)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"1883\u0027\u0027 Sophie Swett, \u0027All the Plums\u0027, w:St. Nicholas St. Nicholas Magazine 1883, Vol.10, Part 1, page 34\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Her name was \u0027\u0027Mabel\u0027\u0027 Hortense, and the children were very proud of having a cousin who lived in the city and was named \u0027\u0027Mabel\u0027\u0027 Hortense. At Damsonfield Four Corners, where they lived, all the little girls were name Mary Jane or Sarah Ann or Lucy Maria, or, at the best, Hattie and Carrie; they had scarcely even heard so fine a name as \u0027\u0027Mabel\u0027\u0027 Hortense\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"1988\u0027\u0027 w:Anne Anne Tyler, \u0027Breathing Lessons\u0027, ISBN 0140116419 page 28\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"The red stitching across the breast pocket read \u0027Mabel\u0027, a name Maggie had not heard since her childhood. What had become of all the \u0027\u0027Mabels\u0027\u0027? She tried to picture giving a new little baby that name\", \"priority\":4}]}, \"synonyms\":{}}");

	add("mabela", "{\"term\":\"mabela\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A type of sorghum\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }