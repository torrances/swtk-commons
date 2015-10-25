package org.swtk.commons.dict.wiktionary.generated.c.u.a;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryCUA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("cuarteto", "{\"term\":\"cuarteto\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Spanish\"], \"text\":\"Spanish \u0027cuarteto|lang\u003des\u0027 () because the early dance-hall numbers were invariably four-piece bands (violin, piano, accordion, bass).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An upbeat genre of music from Argentina, descended from Italian and Spanish dance ensembles\", \"priority\":1}]}, \"synonyms\":{}}");

	add("cuauhtémoc", "{\"term\":\"cuauhtémoc\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Spanish\", \"classical nahuatl\"], \"text\":\"From Spanish \u0027Cuauhtémo. Spanish|Cuauhtémoc\u0027, from Classical nahuatl \u0027Cuauhtemo. Classical_Nahuatl|Cuauhtemoc\u0027 \u0026quot;One That Has Descended Like an Eagle\u0026quot;.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The last Aztec ruler of Tenochtitlan\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A male Mexican given name\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A borough of the Mexican Federal District.Category:English terms spelled with cuauhtemoc\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }