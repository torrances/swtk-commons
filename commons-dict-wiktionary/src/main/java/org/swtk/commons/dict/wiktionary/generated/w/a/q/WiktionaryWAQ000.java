package org.swtk.commons.dict.wiktionary.generated.w.a.q;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryWAQ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("waqf", "{\"term\":\"waqf\", \"etymology\":{\"influencers\":[], \"languages\":[\"Arabic\", \"English\"], \"text\":\"From Arabic \u0027وَقْف\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An endowment of land, in certain Islamic countries, given over for religious or charitable purposes\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1958-1994\u0027\u0027, \u0026amp; CF Beckingham, in \u0027The Travels of Ibn Battutah\u0027, Folio Society 2012, p. 25\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The qadis in Egypt and Syria administer the \u0027\u0027\u0027waqfs\u0027\u0027\u0027 and alms for the benefit of travellers\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2012\u0027\u0027, \u0027The Sleepwalkers\u0027, Penguin 2013, p. 368\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A small house at the centre of the bazaar dispensed coffee free of charge to the poor at the expense of the \u0027\u0027\u0027waqf\u0027\u0027\u0027, an Ottoman charitable foundation\", \"priority\":5}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }