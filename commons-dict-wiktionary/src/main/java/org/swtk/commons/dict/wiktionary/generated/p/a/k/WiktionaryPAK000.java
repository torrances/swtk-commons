package org.swtk.commons.dict.wiktionary.generated.p.a.k;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryPAK000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("paki", "{\"term\":\"paki\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Shortened from {{m|en|Pakistani}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A Pakistan\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Anyone whose origins are perceived to be from South Asia/the Indian subcontinent\", \"priority\":2}]}, \"synonyms\":{}}");

	add("pakis", "{\"term\":\"pakis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The Pakistan cricket team\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1999\u0027\u0027, \u0027w:Outlook Outlook\u0027, Volume 5, Issues 12-24, [http://books.google.com.au/books?id\u003dKzVWAAAAYAAJ\u0026amp;q\u003d%22Pakis%22+australia+OR+cricket+-intitle:%22painting%22+-inauthor:%22%22\u0026amp;dq\u003d%22Pakis%22+australia+OR+cricket+-intitle:%22painting%22+-inauthor:%22%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003dn3zLT7qUCayRiQfY5_mzBg\u0026amp;redir_esc\u003dy page 258\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"But I′d rather remember the batsmanship of the \u0027\u0027Pakis\", \"priority\":3}]}, \"synonyms\":{}}");

	add("pakistan", "{\"term\":\"pakistan\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Persian\"], \"text\":\"From Urdu and Persian \u0027پاکستان\u0027 (land of the pure) from \u0027پاک\u0027 (pure, holy, immaculate, chaste, undefiled) and Persian \u0027ستان\u0027 (\u0027stān\u0027, \u0026quot;-stan\u0026quot;). The word was coined by w:Choudhary Rahmat Ali|Choudhary Rahmat Ali, who published it in the pamphlet \u0027Now or Never\u0027 issued on January 28, 1933 as an acronym of the names of the \u0026quot;Muslim homelands\u0026quot; of western India — \u0027\u0027P\u0027\u0027unjab, \u0027\u0027A\u0027\u0027fghania, \u0027\u0027K\u0027\u0027ashmir, \u0027\u0027S\u0027\u0027indh, and Balochis\u0027\u0027tan\u0027\u0027. An \u0027\u0027i\u0027\u0027 was later added to the English rendition of the name to ease pronunciation.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Country in South Asia. Official name: Islamic Republic of Pakistan\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }