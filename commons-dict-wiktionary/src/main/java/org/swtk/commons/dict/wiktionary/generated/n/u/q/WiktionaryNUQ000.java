package org.swtk.commons.dict.wiktionary.generated.n.u.q;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryNUQ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("nuque", "{\"term\":\"nuque\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle french (ca. 1400-1600)\"], \"text\":\"From Middle french (ca. 1400-1600) \u0027nuque\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The nape of the neck\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1969\u0027\u0027, Vladimir Nabokov, \u0027Ada or Ardor\u0027, Penguin 2011, p. 158\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"He had buried his mouth in Ada\u0027s \u0027\u0027nuque\u0027\u0027, when she stiffened and raised a warning finger\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }