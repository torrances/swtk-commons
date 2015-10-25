package org.swtk.commons.dict.wiktionary.generated.e.r.s;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryERS000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("erse", "{\"term\":\"erse\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"scots\"], \"text\":\"Early Scots form of \u0027\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Either of the Gaelic languages of Ireland or Scotland\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ersatzism", "{\"term\":\"ersatzism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|ersatz|ism|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The doctrine that only one concrete world exists, and all other possible worlds are abstract\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"of modality in connecting different levels of ontological description\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }