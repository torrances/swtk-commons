package org.swtk.commons.dict.wiktionary.generated.d.h.o;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryDHO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("dhow", "{\"term\":\"dhow\", \"etymology\":{\"influencers\":[], \"languages\":[\"Arabic\", \"English\"], \"text\":\"From Arabic \u0027دَاو\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A coasting sailing vessel of Arabia, East Africa, and the Indian Ocean. It has generally but one mast and a lateen sail\", \"priority\":1}]}, \"synonyms\":{}}");

	add("dhobi", "{\"term\":\"dhobi\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Hindi\"], \"text\":\"From Hindi \u0027धोबी|tr\u003ddhōbī\u0027 (washerman) lt;ref\u0026gt;Platts, John T. [http://dsal.uchicago.edu/cgi-bin/philologic/contextualize.pl?p.4.platts.849370 धोबी] from \u0027A dictionary of Urdu, Classical Hindi, and English]\u0027 Oxford. 1884.\u0026lt;/ref\u0026gt;\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A laundryman in India and Pakistan; a washerman\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"“A \u0027\u0027dhobi\u0027\u0027 is a washerman in India and Pakistan. \u0027\u0027Dhobis\u0027\u0027 usually run door to door collecting ... All the \u0027\u0027dhobis\u0027\u0027 wash their linen in the Mahalaxmi area known as \u0027\u0027Dhobi Ghat\u0027\u0027.” [http://www.mumbainet.com/travel/dhobighat.htm\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The \u0027\u0027dhobi\u0027\u0027 khana\u0027 at Fort Kochi was once throbbing with activity. ... \u0026quot;The first \u0027\u0027dhobi\u0027\u0027 khana was under the Madras Presidency...” [http://www.hinduonnet.com/thehindu/mp/2003/07/07/stories/2003070700750100.htm\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }