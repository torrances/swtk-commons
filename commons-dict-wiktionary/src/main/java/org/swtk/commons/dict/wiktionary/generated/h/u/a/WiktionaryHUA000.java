package org.swtk.commons.dict.wiktionary.generated.h.u.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryHUA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("huangite", "{\"term\":\"huangite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\u0027-ite\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A trigonal-hexagonal scalenohedral mineral containing aluminum, calcium, hydrogen, oxygen, and sulfur\", \"priority\":1}]}, \"synonyms\":{}}");

	add("huanglongbing", "{\"term\":\"huanglongbing\", \"etymology\":{\"influencers\":[], \"languages\":[\"mandarin chinese\", \"English\"], \"text\":\"From the Mandarin chinese \u0027lang\u003dcmn\u0027 {{gloss|Chinese: \u0027yellow dragon disease\u0027}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Abbreviated as\u0027: HLB\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A bacterial infection of citrus trees\", \"priority\":2}]}, \"synonyms\":{}}");

	add("huaqiao", "{\"term\":\"huaqiao\", \"etymology\":{\"influencers\":[], \"languages\":[\"mandarin chinese\", \"English\"], \"text\":\"From Chinese Mandarin chinese {{zh-l|華僑|tr\u003dHuáqiáo}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person or people of Chinese ethnicity, living in a non-Chinese country\", \"priority\":1}]}, \"synonyms\":{}}");

	add("huayno", "{\"term\":\"huayno\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A genre of Andean popular music most closely associated with Peru\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }