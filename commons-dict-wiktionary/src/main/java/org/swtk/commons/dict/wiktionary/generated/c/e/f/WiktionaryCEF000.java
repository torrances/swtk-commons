package org.swtk.commons.dict.wiktionary.generated.c.e.f;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryCEF000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("cefalexin", "{\"term\":\"cefalexin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A particular oral cephalosporin antibiotic\", \"priority\":1}]}, \"synonyms\":{}}");

	add("cefixime", "{\"term\":\"cefixime\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An oral cephalosporin antibiotic used to treat gonorrhea, tonsillitis, pharyngitis and otitis media\", \"priority\":1}]}, \"synonyms\":{}}");

	add("cefmatilen", "{\"term\":\"cefmatilen\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An orally active cephalosporin antibiotic\", \"priority\":1}]}, \"synonyms\":{}}");

	add("cefotaxime", "{\"term\":\"cefotaxime\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A wide-spectrum antibiotic with efficacy against most bacteria\", \"priority\":1}]}, \"synonyms\":{}}");

	add("cefuroxime", "{\"term\":\"cefuroxime\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A second-generation cephalosporin antibiotic\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }