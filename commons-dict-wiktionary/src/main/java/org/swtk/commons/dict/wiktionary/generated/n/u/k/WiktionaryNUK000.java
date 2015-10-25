package org.swtk.commons.dict.wiktionary.generated.n.u.k;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryNUK000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("nuke", "{\"term\":\"nuke\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Short form of \u0027\u0027 (weapon).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"nuclear Nuclear weapon\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"quot;\u0027I can buy \u0027\u0027nukes\u0027\u0027 on the black market for $40 million each\u0027\u0026quot; - John Travolta in the movie \u0027Swordfish\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Something that negates or destroys, especially on a catastrophic scale\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A microwave ove\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"quot;\u0027Just put it in the \u0027\u0027nuke\u0027\u0027 for two minutes and then eat it.\u0027\u0026quot\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"Nuclear electrical power generation station.\u0026lt;ref\u0026gt; http://m-w.com/cgi-bin/dictionary?nuke \u0026lt;/ref\u0026gt\", \"priority\":6}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }