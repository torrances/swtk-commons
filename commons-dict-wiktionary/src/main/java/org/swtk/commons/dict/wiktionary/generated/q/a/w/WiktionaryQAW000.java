package org.swtk.commons.dict.wiktionary.generated.q.a.w;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryQAW000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("qawwali", "{\"term\":\"qawwali\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Persian\", \"Urdu\"], \"text\":\"From Urdu \u0027قوّالی\u0027 Persian \u0027قوّالی\u0027 from \u0027قوّال\u0027 (qawwal)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A style of Muslim devotional music, especially among the Sufis, accompanied by drums and harmonium\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1994\u0027\u0027, Simon Broughton, \u0027World Music: The Rough Guide\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Jameela Siddiqi listens to \u0027\u0027qawwali\u0027\u0027 and talks to its performers […\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A song in this style\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"1997\u0027\u0027, \u0027Cuckold\u0027, HarperCollins 2013, p. 223\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"They are singing not a religious \u0027\u0027qawwali\u0027\u0027 but its secular and lay cousin\", \"priority\":6}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }