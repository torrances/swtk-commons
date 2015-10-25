package org.swtk.commons.dict.wiktionary.generated.u.t.o;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryUTO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("utopia", "{\"term\":\"utopia\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From {{m|en|Utopia}}, the name of a fictional island, possessing a seemingly perfect socio-politico-legal system in the book \u0027Utopia\u0027 (1516) by {{w|Sir Thomas More}}. Coined from Ancient greek (to 1453) {{m|grc|οὐ||not, no}} + {{m|grc|τόπος||place, region}} (English: {{m|en|topos}}) + Latin {{m|la|-ia}}/Ancient greek (to 1453) {{m|grc|-ία}}, {{m|grc|-εια}} (English: {{m|en|-ia}}).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A world in which everything and everyone works in perfect harmony\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"passage\u003dAs towns continue to grow, replanting vegetation has become a form of urban \u0027\u0027utopia\u0027\u0027 and green roofs are spreading fast. Last year 1m square metres of plant-covered roofing was built in France, as much as in the US, and 10 times more than in Germany, the pioneer in this field\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }