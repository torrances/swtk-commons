package org.swtk.commons.dict.wiktionary.generated.h.y.b;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryHYB000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("hybrid", "{\"term\":\"hybrid\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"Known in English since 1601, but rare before c.1850. From Latin \u0027lang\u003dla\u0027 a variant of \u0027lang\u003dla|ibrida\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Offspring resulting from cross-breeding different entities, e.g. two different species or two purebred parent strains\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Something of mixed origin or composition\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A word whose elements are derived from different languages\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Short for hybrid vehicle (especially a car), one that runs on both fuel (gasoline/diesel) and electricity (battery or energy from the sun\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A golf club that combines the characteristics of an iron and a wood\", \"priority\":5}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }