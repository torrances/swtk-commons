package org.swtk.commons.dict.wiktionary.generated.f.u.m;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryFUM000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("fumaronitrile", "{\"term\":\"fumaronitrile\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The nitrile, N≡C-CH\u003dCH-C≡N, derived from fumaric acid\", \"priority\":1}]}, \"synonyms\":{}}");

	add("fumewort", "{\"term\":\"fumewort\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|fume|wort|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of various plants of the subfamily Fumarioideae or family Fumariaceae\", \"priority\":1}]}, \"synonyms\":{}}");

	add("fumigation", "{\"term\":\"fumigation\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old french (842-ca. 1400)\"], \"text\":\"From Old french (842-ca. 1400) \u0027fumigation\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The act of fumigating, or applying smoke or vapor, as for disinfection\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Vapor raised in the process of fumigating\", \"priority\":2}]}, \"synonyms\":{}}");

	add("fumitory", "{\"term\":\"fumitory\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A plant of the taxonomic genus \u0027Fumaria\u0027, which are annual herbaceous flowering plants in the family Papaveraceae, native to temperate Europe and Asia\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }