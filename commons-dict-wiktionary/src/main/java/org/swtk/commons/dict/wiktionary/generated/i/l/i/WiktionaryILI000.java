package org.swtk.commons.dict.wiktionary.generated.i.l.i;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryILI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("iliad", "{\"term\":\"iliad\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027ἰλιάς\u0027 () the poem about \u0027ἴλιον\u0027 () an alternate name for Troy.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A famous ancient Greek epic poem about the Trojan War, attributed to Homer\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Any long tragic story\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"1907:\u0027\u0027 Gilbert Parker, \u0027The Weavers\u0027 - [As they] listened to the tale he unfolded, some glow of pity must have possessed them; for it was an Iliad of herculean struggle against absolute disaster, ending with the bitter news of his grandfather\u0027s death\", \"priority\":3}]}, \"synonyms\":{}}");

	add("ilium", "{\"term\":\"ilium\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From Latin \u0027ilium\u0027 from Ancient greek (to 1453) \u0027ἴλιον\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"another name of Troy\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ilium", "{\"term\":\"ilium\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin {{m|la|īlium||lower abdomen}}, from {{m|la|īle||flank}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The upper and widest of the three bones that make up each side of the hipbone and pelvis\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The ileum, part of the small intestine\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }