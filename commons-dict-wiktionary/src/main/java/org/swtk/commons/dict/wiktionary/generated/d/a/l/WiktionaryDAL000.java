package org.swtk.commons.dict.wiktionary.generated.d.a.l;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryDAL000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("daleside", "{\"term\":\"daleside\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|dale|side|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The side of a dale\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1999\u0027\u0027, C Philip Wheater, \u0027Urban habitats\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"With time, nutrients are leached from the organic material, rabbits graze the vegetation, and the species become more typical of \u0027\u0027daleside\u0027\u0027 communities\", \"priority\":3}]}, \"synonyms\":{}}");

	add("dalfampridine", "{\"term\":\"dalfampridine\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"4-aminopyridine, one of the three isomeric amines of pyridine, used in research and to manage symptoms of multiple sclerosis\", \"priority\":1}]}, \"synonyms\":{}}");

	add("dalliance", "{\"term\":\"dalliance\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle english (1100-1500)\"], \"text\":\"From Middle english (1100-1500)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Playful flirtation; amorous play\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"As in the season of rutting (an uncouth phrase, by which the vulgar denote that gentle \u0027\u0027dalliance\u0027\u0027, which in the well-wooded forest of Hampshire, passes between lovers of the ferine kind\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A wasting of time in idleness or trifles\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A sexual relationship, not serious but often illicit\", \"priority\":4}]}, \"synonyms\":{}}");

	add("dallier", "{\"term\":\"dallier\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|dally|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who dallies; a procrastinator\", \"priority\":1}]}, \"synonyms\":{}}");

	add("dalmatic", "{\"term\":\"dalmatic\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle french (ca. 1400-1600)\", \"Latin\"], \"text\":\"From Middle french (ca. 1400-1600) \u0027dalmatique\u0027 from Latin derived ultimately from the name of the province of Dalmatia.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A long wide-sleeved tunic, which serves as a liturgical vestment in the Roman Catholic and Anglican Churches and is worn by a deacon at the Eucharist or Mass and, although infrequently, by bishops as an undergarment above the alb\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1890\u0027\u0027, \u0027The Picture of Dorian Gray\u0027, ch. XI\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"He had [...] \u0027\u0027dalmatics\u0027\u0027 of white satin and pink silk damask, decorated with tulips and dolphins and \u0027fleurs-de-lis\", \"priority\":3}]}, \"synonyms\":{}}");

	add("dalton", "{\"term\":\"dalton\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the atomic mass unit\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }