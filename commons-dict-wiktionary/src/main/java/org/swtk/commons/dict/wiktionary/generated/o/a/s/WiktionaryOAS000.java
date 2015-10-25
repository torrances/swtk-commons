package org.swtk.commons.dict.wiktionary.generated.o.a.s;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryOAS000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("oases", "{\"term\":\"oases\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Category:English irregular plurals ending in \u0026quot;-es\u0026quot\", \"priority\":1}]}, \"synonyms\":{}}");

	add("oasis", "{\"term\":\"oasis\", \"etymology\":{\"influencers\":[], \"languages\":[\"egyptian (ancient)\", \"English\", \"ancient greek (to 1453)\"], \"text\":\"From {{m|la|Oasis}}, from Ancient greek (to 1453) {{m|grc|Ὄασις}}, from Late Egyptian (ancient) {{m|egy|wḥỉ|sc\u003dEgyd}}, earlier hieroglyphic \u0026lt;hiero\u0026gt;G43-V28-G1-X1:N25\u0026lt;/hiero\u0026gt; {{m|egy|wḥ3t}} (also meaning “cauldron”). Compare Sahidic Coptic {{m|cop|ⲟⲩⲁϩⲉ|tr\u003dwaḥe}} and Arabic {{m|ar|وَاحَة}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A spring of fresh water, surrounded by a fertile region of vegetation, in a desert\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"title\u003d[http://openlibrary.org/works/OL10504990W The Lonely passage\u003dIt was the Lost \u0027\u0027Oasis\u0027\u0027, the \u0027\u0027Oasis\u0027\u0027 of the vision in the sand. […] Deep-hidden in the hollow, beneath the cliffs, it lay; and round it the happy verdure spread for many a rood. […] Yes, the quest was ended, the Lost \u0027\u0027Oasis\u0027\u0027 was the Found\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A quiet, peaceful place or situation separated from surrounding noise or bustle\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }