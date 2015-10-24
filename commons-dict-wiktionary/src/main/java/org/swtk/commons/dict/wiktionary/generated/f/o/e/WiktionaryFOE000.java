package org.swtk.commons.dict.wiktionary.generated.f.o.e;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryFOE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("foederati", "{\"term\":\"foederati\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"DATE?]\u0027\u0027: Prys Morgan, \u0027The Invention of Tradition\u0027, pUnknow\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The third part of the vision was more conventional and it concerned lines of native princes descending from tribal leaders, or Roman \u0027\u0027foederati\u0027\u0027 like Cunedda, or from Cadwaladr the Blessed, last Welsh king to claim over-lordship of Britain, in the seventh century, right down to the death of Llywelyn II in 1282\", \"priority\":2}]}, \"synonyms\":{}}");

	add("foehn", "{\"term\":\"foehn\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\", \"Romansch\"], \"text\":\"{{borrowing|de|Föhn|lang\u003den}}, from Romansch {{m|rm|favugn}}, from Latin {{m|la|Favōnius||{{w|Favonius}}}}, a Roman wind god.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A warm dry wind blowing down the north sides of the Alps, especially in Switzerland\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1971\u0027\u0027, WW Kibler, translating Gian Fontana, ‘The Mayor of Valdei’, in Bezzola (ed.), \u0027The Curly-Horned Cow\u0027, Peter Owen 1971, p. 71\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The \u0027\u0027\u0027foehn\u0027\u0027\u0027 and the sun must have awakened the spirits of spring way up in the heights\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A similar katabatic wind developing on the lee side of a mountain\", \"priority\":4}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }