package org.swtk.commons.dict.wiktionary.generated.p.s.o;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryPSO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("psoas", "{\"term\":\"psoas\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Either of two muscles, the psoas major and psoas minor involved in flexion of the trunk\", \"priority\":1}]}, \"synonyms\":{}}");

	add("psogos", "{\"term\":\"psogos\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027ψόγος\u0027 (blame, censure)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A rhetorical term for a speech which attempts to insult, degrade, or otherwise attack something\", \"priority\":1}]}, \"synonyms\":{}}");

	add("psomophagy", "{\"term\":\"psomophagy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From the suffix \u0027-phagy\u0027 (to feed)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The condition of not chewing food before swallowing it\", \"priority\":1}]}, \"synonyms\":{}}");

	add("psora", "{\"term\":\"psora\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"Latin from Ancient greek (to 1453) \u0027ψώρα\u0027 (itch) Compare \u0027psoriasis\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A cutaneous disease, especially the itch\", \"priority\":1}]}, \"synonyms\":{}}");

	add("psorophthalmia", "{\"term\":\"psorophthalmia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An itchy inflammation of the eyelids\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }