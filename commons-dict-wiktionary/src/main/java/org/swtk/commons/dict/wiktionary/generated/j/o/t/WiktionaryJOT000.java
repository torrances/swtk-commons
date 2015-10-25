package org.swtk.commons.dict.wiktionary.generated.j.o.t;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryJOT000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("jota", "{\"term\":\"jota\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{borrowing|es|jota|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A traditional popular dance of the Iberian peninsula with regional variations\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The music to which this dance is set, normally of 3/4 or 6/8 time\", \"priority\":2}]}, \"synonyms\":{}}");

	add("jotter", "{\"term\":\"jotter\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A memorandum book\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Someone who jots\", \"priority\":2}]}, \"synonyms\":{}}");

	add("jotun", "{\"term\":\"jotun\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old norse\"], \"text\":\"From Old norse \u0027jǫtunn\u0027 from Proto-germanic {{m|gem-pro|*etunaz||giant}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A member of a race of giants who usually stand in opposition to the Æsir and especially to Thor\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }