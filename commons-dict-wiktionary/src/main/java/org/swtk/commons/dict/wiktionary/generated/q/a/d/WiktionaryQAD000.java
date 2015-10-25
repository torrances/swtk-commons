package org.swtk.commons.dict.wiktionary.generated.q.a.d;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryQAD000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("qadi", "{\"term\":\"qadi\", \"etymology\":{\"influencers\":[], \"languages\":[\"Arabic\", \"English\"], \"text\":\"From Arabic \u0027قَاضِي\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A civil judge in certain Islamic countries\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1985\u0027\u0027, Yasmin Hussain, Sharon Siddique, Ahmad Ibrahim, \u0027Readings on Islam in Southeast Asia\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"legal treatises dealing with the subject usually spoke of the appointment to office of a \u0027\u0027qadi\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1990\u0027\u0027, \u0027The Great Game\u0027, Folio Society 2010, p. 74\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"The \u0027\u0027\u0027Qazi\u0027\u0027\u0027, his spiritual adviser, had recommended that the Russian be taken out into the desert and buried alive\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2011\u0027\u0027, Jill Hamilton, \u0027The Guardian\u0027, 22 Jul 2011\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"While sharia law for divorce in many Muslim countries has been modified by governments, in Israel reform was initiated by \u0027\u0027qadis\", \"priority\":7}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }