package org.swtk.commons.dict.wiktionary.generated.e.u.k;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryEUK000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("eukaryote", "{\"term\":\"eukaryote\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|eu|lang\u003den}} {{confix|kary|ote|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of the single-celled or multicellular organisms, of the taxonomic domain \u0027Eukaryota\u0027, whose cells contain at least one distinct nucleus\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }