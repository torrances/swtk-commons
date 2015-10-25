package org.swtk.commons.dict.wiktionary.generated.a.i.c;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryAIC000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("aichmophobia", "{\"term\":\"aichmophobia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix||alt1\u003daichmo-|phobia|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The fear of needles and other pointed or sharp objects\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1977\u0027\u0027, George W. Kisker, \u0027The disorganized personality\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"In \u0027\u0027aichmophobia\u0027\u0027 the person develops a pathological fear of sharp and pointed objects. He or she fears pieces of broken glass, scraps of metal, nails, and scissors. Fear of this kind leads to all sorts of eccentric habits\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }