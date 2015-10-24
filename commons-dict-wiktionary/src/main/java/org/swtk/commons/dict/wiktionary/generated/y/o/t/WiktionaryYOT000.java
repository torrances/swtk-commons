package org.swtk.commons.dict.wiktionary.generated.y.o.t;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryYOT000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("yottasecond", "{\"term\":\"yottasecond\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|yotta|second|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A unit of time equal to 10\u0026lt;sup\u0026gt;24\u0026lt;/sup\u0026gt; (1,000,000,000,000,000,000,000,000) seconds and with symbol Ys\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Trades Descriptions Act... \u0026quot;always on\u0026quot; presumably means 100.00 % uptime for the rest of infinity with nary a \u0027\u0027yottasecond\u0027\u0027\u0026lt;nowiki\u0026gt;\u0027\u0026lt;/nowiki\u0026gt;s downtime\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Basically, I want \u0027\u0027yottaseconds\u0027\u0027 and yoctoyears calculated with the same datatype for normal time\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"12.7 furlongs per fortnight in parsecs per \u0027\u0027yottasecond\", \"priority\":4}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }