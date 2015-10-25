package org.swtk.commons.dict.wiktionary.generated.k.u.d;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKUD000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("kudo", "{\"term\":\"kudo\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{back-form|kudos|nodot\u003dyes|lang\u003den}}, as if it were a plural with \u0027-s\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A compliment or praise\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1929\u0027\u0027 February 18, \u0026quot;Harkness Lampooned\u0026quot;\u0026lt;sup\u0026gt;[http://www.time.com/time/magazine/article/0,9171,737434,00.html]\u0026lt;/sup\u0026gt;, in \u0027Time\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Tycoon George Fisher Baker built Harvard\u0027s Business School in 1924, was given a \u0027\u0027kudo\u0027\u0027 Ph.D\", \"priority\":3}]}, \"synonyms\":{}}");

	add("kudriavite", "{\"term\":\"kudriavite\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Russian\"], \"text\":\"From Kudriavy (Russian {{m|ru|Кудрявый}}, the Russian volcano where it was discovered) {{suffix||ite|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A monoclinic-prismatic dark reddish gray mineral containing bismuth, cadmium, indium, iron, lead, manganese, selenium, and sulfur\", \"priority\":1}]}, \"synonyms\":{}}");

	add("kuduro", "{\"term\":\"kuduro\", \"etymology\":{\"influencers\":[], \"languages\":[\"Portuguese\"], \"text\":\"Uncertain, probably from {{m|kmb|ku}} (from {{m|kmb|mataku}}) or Portuguese {{m|pt|cu||butt}} + {{m|pt|duro||hard}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An energetic, danceable style of music originating in Angola, combining local styles like semba with influences from Caribbean music, especially zouk and soca\", \"priority\":1}]}, \"synonyms\":{}}");

	add("kudzu", "{\"term\":\"kudzu\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Japanese\"], \"text\":\"From Japanese \u0027クズ\u0027 The spelling \u0027kudzu\u0027 (instead of \u0027kuzu\u0027) is due to historical transliteration methods of Japanese into English.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An Asian vine grown as a root starch and sometimes considered a\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }