package org.swtk.commons.dict.wiktionary.generated.o.j.i;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryOJI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ojibwe", "{\"term\":\"ojibwe\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\", \"Ojibwe\"], \"text\":\"From French \u0027outchibouec\u0027 or its source, Ojibwe \u0027ojibwe\u0027 from \u0027o-\u0027 {{qualifier|ethnonymic prefix}} + \u0027jiibaakwe\u0027 + \u0027abwe|lang\u003doj\u0027 (to roast) meaning \u0026quot;Those who roast until it puckers,\u0026quot; thought to be because of a local habit of puckering their moccasins.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The language spoken by the native Algonquin people of central Canada, one of a closely related group of languages and dialects of the Algonquian branch of the Algic language family\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }