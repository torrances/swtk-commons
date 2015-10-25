package org.swtk.commons.dict.wiktionary.generated.v.a.u;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryVAU000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("vaudeville", "{\"term\":\"vaudeville\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{borrowing|fr|lang\u003den}} \u0027lang\u003dfr\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A style of multi-act theatrical entertainment originated from France and which flourished in Europe and North America from the 1880s through the 1920s\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"An entertainment in this style\", \"priority\":2}]}, \"synonyms\":{}}");

	add("vaunter", "{\"term\":\"vaunter\", \"etymology\":{\"influencers\":[], \"languages\":[\"old french (842-ca. 1400)\"], \"text\":\"{{-er|vaunt}}, perhaps a calque of Old french (842-ca. 1400) \u0027vanteor\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Someone who vaunts, who brags; a braggart\", \"priority\":1}]}, \"synonyms\":{}}");

	add("vauxite", "{\"term\":\"vauxite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Vaux|ite|lang\u003den}}, after American mineral collector George Vaux Junior (1863-1927).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A phosphate mineral of the laueite–paravauxite group\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }