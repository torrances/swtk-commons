package org.swtk.commons.dict.wiktionary.generated.b.y.l;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryBYL000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("bylaw", "{\"term\":\"bylaw\", \"etymology\":{\"influencers\":[{}], \"languages\":[], \"text\":\"Alteration of \u0027byrlaw\u0027 but folk etymology|popularly interpreted as {{prefix|by|t1\u003dtown|law|lang\u003den}} (though, to be fair, this isn\u0027t exactly false, as \u0027-by\u0027 is a derivative of Old Norse \u0027býr\u0027). Compare Danish \u0027bylov\u0027 (municipal law)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A local custom or law of a settlement or district\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A rule made by a local authority to regulate its own affairs\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A law or rule governing the internal affairs of an organization (e.g., corporation or business\", \"priority\":3}]}, \"synonyms\":{}}");

	add("bylina", "{\"term\":\"bylina\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Russian\"], \"text\":\"From Russian \u0027были́на\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"traditional East Slavic oral epic narrative poem\", \"priority\":1}]}, \"synonyms\":{}}");

	add("byline", "{\"term\":\"byline\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|by|line|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A line at the head of a newspaper or magazine article carrying the writer\u0027s name\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A touchline\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }