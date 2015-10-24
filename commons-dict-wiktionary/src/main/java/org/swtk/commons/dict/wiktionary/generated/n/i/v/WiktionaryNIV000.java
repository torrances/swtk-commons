package org.swtk.commons.dict.wiktionary.generated.n.i.v;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryNIV000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("nivkh", "{\"term\":\"nivkh\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A member of an indigenous ethnic group inhabiting the northern half of w:Sakhalin Sakhalin Island and the region of the w:Amur Amur River estuary in Russia\u0027s w:Khabarovsk Khabarovsk Krai\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }