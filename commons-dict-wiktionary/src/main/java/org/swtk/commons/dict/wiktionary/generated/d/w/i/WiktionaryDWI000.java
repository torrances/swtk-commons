package org.swtk.commons.dict.wiktionary.generated.d.w.i;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryDWI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("dwimmer", "{\"term\":\"dwimmer\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\", \"middle english (1100-1500)\"], \"text\":\"From Middle english (1100-1500) {{m|enm|dwimmer}}, from Old english (ca. 450-1100) {{m|ang|ġedwimor}}, \u0027dwimor\u0027 (illusion, delusion, sleight, magic)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Magic, magic arts; sorcery; spell; occult art\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1954\u0027\u0027, J. R. R. Tolkien, \u0027The Two Towers\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"quot;It is ill dealing with such a foe: he is a wizard both cunning and \u0027\u0027dwimmer\u0027\u0027-crafty, having many guises.\u0026quot\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2010\u0027\u0027, W. R. Cooper, \u0027Oriana Oakley and the Primrose Path\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"“The Lych and his dark \u0027\u0027dwimmer\u0027\u0027 spell have you resisted—even defeated, defeated for the present. But you have not destroyed. They shall return in time, I fear\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2011\u0027\u0027, John Henson, \u0027Broken Wings\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"The soldiers peered into the deep dark shaft In which lay the monk with tonsorshorn A victim of the sorcerous lady\u0027s \u0027\u0027dwimmer\u0027\u0027 craft\", \"priority\":7}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }