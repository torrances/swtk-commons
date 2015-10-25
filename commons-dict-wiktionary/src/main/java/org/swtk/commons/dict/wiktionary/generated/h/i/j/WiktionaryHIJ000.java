package org.swtk.commons.dict.wiktionary.generated.h.i.j;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryHIJ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("hijab", "{\"term\":\"hijab\", \"etymology\":{\"influencers\":[], \"languages\":[\"Arabic\", \"English\"], \"text\":\"From Arabic {{m|ar|حِجَاب||veil}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The practice, among Muslim women, of covering the body after the age of puberty in front of non-related adult males\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2010\u0027\u0027, Jawairriya Abdallah-Shahid, \u0027Veiled Voices\u0027 (ISBN 1450053025), page 13\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The belief that Muslim females observe \u0027\u0027hijab\u0027\u0027 because men force them to do so insults some Muslim females who have based their decision on their understanding of Islam\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A traditional headscarf worn by Muslim women, covering the hair and neck\", \"priority\":4}]}, \"synonyms\":{}}");

	add("hijacker", "{\"term\":\"hijacker\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|hijack|er|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Someone who hijacks\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"the \u0027\u0027hijacker\u0027\u0027 of an aeroplane\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Hijackware\", \"priority\":3}]}, \"synonyms\":{}}");

	add("hijiki", "{\"term\":\"hijiki\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Japanese\"], \"text\":\"Japanese\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a brown seaweed used in Japanese cuisine\", \"priority\":1}]}, \"synonyms\":{}}");

	add("hijinks", "{\"term\":\"hijinks\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Tricky and/or humorous behaviour\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }