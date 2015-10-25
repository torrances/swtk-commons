package org.swtk.commons.dict.wiktionary.generated.y.i.p;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryYIP000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("yips", "{\"term\":\"yips\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A nervous condition which prevents a sportsman from playing properly; especially a condition which causes a golfer to miss an easy putt, or a tennis player to serve a double fault\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2013\u0027\u0027, William Fotheringham, \u0027The Guardian\u0027, Monday 13 May 2013\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Defining precisely why a professional cyclist might lose his touch on descents is as difficult as explaining a golfer\u0027s \u0027\u0027yips\u0027\u0027 or a striker\u0027s sudden inability to find the net. It happens rarely, most famously in the early 1990s; the double world champion Gianni Bugno suffered from it and only rediscovered his \u0026quot;flow\u0026quot; after being made to listen to Mozart to calm his nerves\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }