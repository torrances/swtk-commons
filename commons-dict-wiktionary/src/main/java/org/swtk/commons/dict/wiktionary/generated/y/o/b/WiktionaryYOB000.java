package org.swtk.commons.dict.wiktionary.generated.y.o.b;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryYOB000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("yobbo", "{\"term\":\"yobbo\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From \u0027yob\u0027 + \u0027-o\u0027.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A yob\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1997:\u0027\u0027 TISM, \u0027Whatareya\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A wanker fights inequality\u0027\u0026lt;br\u0026gt;\u0027And for people’s rights;\u0027\u0026lt;br\u0026gt;\u0027A wanker fights class prejudice\u0027\u0026lt;br\u0026gt;\u0027A \u0027\u0027yobbo\u0027\u0027 just fights\", \"priority\":3}]}, \"synonyms\":{}}");

	add("yobidashi", "{\"term\":\"yobidashi\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Japanese\"], \"text\":\"Japanese\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the functionaries whose tasks include building the dohyo, making announcements, singing the shikona of each rikishi and advising them of preparation time\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }