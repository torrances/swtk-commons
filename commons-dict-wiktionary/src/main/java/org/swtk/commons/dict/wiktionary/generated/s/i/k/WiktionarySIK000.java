package org.swtk.commons.dict.wiktionary.generated.s.i.k;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionarySIK000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("sikhism", "{\"term\":\"sikhism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Sikh|ism|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A revealed, monotheistic religion originating in northern India, in the 16th century, through w:Guru Guru Nanak and his successors\", \"priority\":1}]}, \"synonyms\":{}}");

	add("sikkim", "{\"term\":\"sikkim\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"State in eastern India which has Gangtok as its capital. Historically, it was a country until 1975\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }