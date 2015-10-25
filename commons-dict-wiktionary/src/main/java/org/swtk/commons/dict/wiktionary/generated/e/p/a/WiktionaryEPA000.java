package org.swtk.commons.dict.wiktionary.generated.e.p.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryEPA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("epagomena", "{\"term\":\"epagomena\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027επαγομεναι\u0027 (added on) used by Greek writers of antiquity to describe the five epagomenal days of the calendar of the Egyptians.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a duration of fixed length (usually 5 days) appended to each calendar year such that the calendar year is 365 days long. Epagomenal days are outside any regular month. Used in Ancient Egyptian, Zoroastrian, Maya, Coptic, Ethiopian, Bahai and French Republican calendars\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1997\u0027\u0027, Leo Depuyt, \u0027Civil Calendar and Lunar Calendar in Ancient Egypt\u0027, Peeters, p. 57\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The Ancient Egyptian calendar had] 12 months each 30 days long followed by five \u0027\u0027epagomenal\u0027\u0027 days\", \"priority\":3}]}, \"synonyms\":{}}");

	add("epanadiplosis", "{\"term\":\"epanadiplosis\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"Latin from Ancient greek (to 1453) meaning \u0026quot;to make double\u0026quot;.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A figure of speech by which the same word is used both at the beginning and at the end of a sentence\", \"priority\":1}]}, \"synonyms\":{}}");

	add("epanalepsis", "{\"term\":\"epanalepsis\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"Ancient greek (to 1453) to take up.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The repetition of the same word or clause after intervening matter\", \"priority\":1}]}, \"synonyms\":{}}");

	add("epazote", "{\"term\":\"epazote\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Spanish\", \"classical nahuatl\"], \"text\":\"From Spanish \u0027epazote\u0027 from Classical nahuatl \u0027epazōtl\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A pungent herb used in Latin-American cooking and tea making, and in folk medicine\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }