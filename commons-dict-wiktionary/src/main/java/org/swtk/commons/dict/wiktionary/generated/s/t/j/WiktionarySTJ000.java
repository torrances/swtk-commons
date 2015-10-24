package org.swtk.commons.dict.wiktionary.generated.s.t.j;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionarySTJ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("stjerne", "{\"term\":\"stjerne\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"Danish\", \"old norse\"], \"text\":\"From Old norse \u0027stjarna\u0027 (star) from Proto-germanic {{m|gem-pro|*sternǭ}}, from Proto-indo-european {{m|ine-pro|*h₂stḗr}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"star (\u0027a luminous celestial body\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"star (\u0027a stylised symbol or object representing a star\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"star (\u0027quality rating symbol\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"star (\u0027famous person, such as a film star, pop star etc\", \"priority\":4}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }