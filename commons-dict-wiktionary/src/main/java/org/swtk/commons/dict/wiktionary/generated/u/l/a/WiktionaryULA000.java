package org.swtk.commons.dict.wiktionary.generated.u.l.a;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryULA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ulaanbaatar", "{\"term\":\"ulaanbaatar\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Mongolian\"], \"text\":\"From Mongolian \u0027улаанбаатар\u0027 from {{m|mn|улаан||red}} {{m|mn|баатар||hero}} (cognate to {{m|en|bogatyr}}). The name was adopted in 1924; before that, the city was known by a number of more prosaic names, including {{m|mn|Их Хүрээ||Great Camp}}, {{m|mn|Даа Хүрээ||Great Camp}} (whence, via Chinese, its English names {{m|en|Kulun}} and {{m|en|Kuren}}){{,}} and {{m|mn|Өргөө||Residence}} (whence {{m|en|Urga}}).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The capital of Mongolia\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }