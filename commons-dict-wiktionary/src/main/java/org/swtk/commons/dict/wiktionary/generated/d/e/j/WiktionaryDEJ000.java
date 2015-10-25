package org.swtk.commons.dict.wiktionary.generated.d.e.j;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryDEJ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("dejargonization", "{\"term\":\"dejargonization\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The removal of obscure technical language\", \"priority\":1}]}, \"synonyms\":{}}");

	add("dejection", "{\"term\":\"dejection\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"From Old french (842-ca. 1400) \u0027dejection\u0027 from Latin \u0027dejectio\u0027 (a casting down)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a state of melancholy or depression; low spirits, the blue\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The act of humbling or abasing oneself\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Adoration implies submission and \u0027\u0027dejection\u0027\u0027.\u0027 \u0026amp;mdash; Bishop Pearson\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A low condition; weakness; inability\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A \u0027\u0027dejection\u0027\u0027 of appetite.\u0027 \u0026amp;mdash; Arbuthnot\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"Defecation or feces\", \"priority\":6}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }