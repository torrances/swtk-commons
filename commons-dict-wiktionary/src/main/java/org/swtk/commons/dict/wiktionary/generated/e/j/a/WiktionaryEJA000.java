package org.swtk.commons.dict.wiktionary.generated.e.j.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryEJA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ejaculator", "{\"term\":\"ejaculator\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From the verb \u0027lang\u003den\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person or thing that ejaculates\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1976\u0027\u0027, Joseph W. Bird, ‎Lois F. Bird, \u0027Sexual loving: the experience of love\u0027 (page 218\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Some experts have described the premature \u0027\u0027ejaculator\u0027\u0027 as a man who cannot control his ejaculation for at least thirty seconds after penetration. Others have suggested one minute\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A device that stimulates the sex organs of a male animal with electric impulses in order to extract semen from an animal\", \"priority\":4}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }