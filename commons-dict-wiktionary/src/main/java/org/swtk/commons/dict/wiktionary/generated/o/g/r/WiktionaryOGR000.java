package org.swtk.commons.dict.wiktionary.generated.o.g.r;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryOGR000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ogre", "{\"term\":\"ogre\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"First attested in the 18th century, from French \u0027ogre\u0027 from Latin \u0027orcus\u0027 (god of the underworld) from Ancient greek (to 1453) \u0027όρκος\u0027 the personified demon of oaths (\u0027ὅρκος\u0027 (oath) who inflicts punishment upon perjurers.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A type of brutish giant from folk tales that eats human flesh\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A brutish man whose behavior resembles that of the mythical ogre\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }