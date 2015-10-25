package org.swtk.commons.dict.wiktionary.generated.r.e.o;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryREO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("reoccurrence", "{\"term\":\"reoccurrence\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|re|occurrence|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Something that takes place again\", \"priority\":1}]}, \"synonyms\":{}}");

	add("reoffence", "{\"term\":\"reoffence\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|re|offence|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The act of reoffending; committing a further crime\", \"priority\":1}]}, \"synonyms\":{}}");

	add("reoffender", "{\"term\":\"reoffender\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A repeat offender - someone who reoffends, who commits a crime on more than one occasion\", \"priority\":1}]}, \"synonyms\":{}}");

	add("reorderer", "{\"term\":\"reorderer\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|reorder|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who, or that which, reorders\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }