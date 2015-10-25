package org.swtk.commons.dict.wiktionary.generated.p.u.g;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryPUG000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("puggree", "{\"term\":\"puggree\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From Hindi.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A strip of cloth wound around the upper portion of a hat or helmet, particularly a pith helmet, and falling down behind to act as a shade for the back of the neck\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1888\u0027\u0027: I recognised the eldest Miss Copleigh, because she had a \u0027\u0027puggree\u0027\u0027 round her helmet, and the younger had not. — Rudyard Kipling, ‘False Dawn’, \u0027Plain Tales from the Hills\u0027 (Folio Society 2007, p. 36\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Hand-wrapped \u0027\u0027puggaree\u0027\u0027 hat-band. Ideal for gardening, hiking or exploring forgotten tombs.\u0027 -- [http://secure.sieglers.com/cgi-bin/Sieglers.storefront/EN/Product/151365?wt.srch\u003d1\u0026amp;gclid\u003dCLGl_-b-8YUCFUQHOAodd3vMNw commercial site with illustration\", \"priority\":3}]}, \"synonyms\":{}}");

	add("puggry", "{\"term\":\"puggry\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From Hindi.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A strip of cloth wound around the upper portion of a hat or helmet, particularly a pith helmet, and falling down behind to act as a shade for the back of the neck\", \"priority\":1}]}, \"synonyms\":{}}");

	add("pugilist", "{\"term\":\"pugilist\", \"etymology\":{\"influencers\":[{},{},{}], \"languages\":[\"English\", \"Latin\"], \"text\":\"1790, Latin \u0027pugil\u0027 (boxer) {{suffix||ist|lang\u003den}}, related to \u0027pugnus\u0027 (fist) \u0026lt;ref\u0026gt;{{R:Online Etymology Dictionary}}\u0026lt;/ref\u0026gt; from Proto-indo-european roots. Compare contemporary \u0027pugilism\u0027 (boxing) (1791).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who fights with his fists; especially a professional prize fighter; a boxer\", \"priority\":1}]}, \"synonyms\":{}}");

	add("pugmark", "{\"term\":\"pugmark\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|pug|mark|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The print or track of an animal\", \"priority\":1}]}, \"synonyms\":{}}");

	add("pugnaciousness", "{\"term\":\"pugnaciousness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The act or quality of being pugnacious\", \"priority\":1}]}, \"synonyms\":{}}");

	add("pugnacity", "{\"term\":\"pugnacity\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The act or characteristic of being aggressive or combative\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }