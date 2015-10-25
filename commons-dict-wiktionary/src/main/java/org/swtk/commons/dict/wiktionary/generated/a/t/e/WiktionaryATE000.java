package org.swtk.commons.dict.wiktionary.generated.a.t.e;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryATE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("atelomixis", "{\"term\":\"atelomixis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"incomplete vertical mixing of stratified water masses, homogenizing layers\", \"priority\":1}]}, \"synonyms\":{}}");

	add("atelophobia", "{\"term\":\"atelophobia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The fear of imperfection or not being good enough\", \"priority\":1}]}, \"synonyms\":{}}");

	add("atenism", "{\"term\":\"atenism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A monotheistic religion of ancient Egypt\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }