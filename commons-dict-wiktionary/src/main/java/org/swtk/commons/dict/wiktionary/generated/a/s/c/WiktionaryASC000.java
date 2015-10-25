package org.swtk.commons.dict.wiktionary.generated.a.s.c;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryASC000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ascanius", "{\"term\":\"ascanius\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From Latin \u0027ascanius\u0027 from Ancient greek (to 1453) \u0027ἀσκάνιος\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the son of the Trojan hero Aeneas\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ascariasis", "{\"term\":\"ascariasis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Ascaris|osis|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A disease of humans caused by the parasitic roundworm \u0027Ascaris lumbricoides\u0027 in humans and by other species of \u0027Ascaris\u0027 in other mammals\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ascendancy", "{\"term\":\"ascendancy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|ascend|ancy|lang\u003den}} or {{suffix|ascendant|cy|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The process or period of one\u0027s ascen\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Supremacy; superiority; dominant control; the quality of being in the ascendan\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A class of Protestant landowners and professionals that dominated political and social life in Ireland up to the early 20th centur\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"W. B. Yeats] belonged not to the \u0027\u0027ascendancy\u0027\u0027 class but to the protestant bourgeoisie.\u0027 – Terry Eagleton, \u0027New Left Review\u0027, 1975\", \"priority\":4}]}, \"synonyms\":{}}");

	add("ascender", "{\"term\":\"ascender\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"to ascend + -er\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The portion of a lowercase letter that extends above the midline of a typeface\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"a mechanical device used for ascending on a rope\", \"priority\":2}]}, \"synonyms\":{}}");

	add("asceticism", "{\"term\":\"asceticism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The principles and practices of an ascetic; extreme self-denial and austerity\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ascii", "{\"term\":\"ascii\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"American Standard Code for Information Interchange\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ascience", "{\"term\":\"ascience\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"unseeing, not knowing, not sensing\", \"priority\":1}]}, \"synonyms\":{}}");

	add("asclepius", "{\"term\":\"asclepius\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From Latin \u0027asclepius\u0027 from Ancient greek (to 1453) \u0027ἀσκληπιός\u0027 (asclepius)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The god of doctors, medicine and healing. He is the son of Apollo and Coronis, and his wife is Epione. His Roman name is Aesculapius\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Short for , an\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }