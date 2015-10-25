package org.swtk.commons.dict.wiktionary.generated.l.i.o;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryLIO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("lionfish", "{\"term\":\"lionfish\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|lion|fish|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of the venomous fish of the Scorpaenidae family, notable for their long and separated spines\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }