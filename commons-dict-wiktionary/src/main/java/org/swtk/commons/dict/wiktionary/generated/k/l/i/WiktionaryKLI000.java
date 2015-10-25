package org.swtk.commons.dict.wiktionary.generated.k.l.i;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKLI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("klingon", "{\"term\":\"klingon\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From the \u0027w:Star Trek|Star Trek\u0027 franchise, purportedly by Gene Roddenberry, named for Lieutenant Wilbur Clingan of the Los Angeles Police Department\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Member of a fictional alien warrior race depicted as having distinctive forehead ridges and a culture based on strict observance of honour, loyalty, and combat\", \"priority\":1}]}, \"synonyms\":{}}");

	add("klismaphilia", "{\"term\":\"klismaphilia\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"from Latin \u0027cataclysmos\u0027 from Ancient greek (to 1453) \u0027κατακλυσμός\u0027 (deluge, flood) and \u0027φιλία\u0027 ((fraternal) love)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The condition of being sexually aroused by being given an enema\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }