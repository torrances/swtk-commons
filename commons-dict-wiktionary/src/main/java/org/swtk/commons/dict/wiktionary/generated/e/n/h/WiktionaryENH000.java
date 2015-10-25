package org.swtk.commons.dict.wiktionary.generated.e.n.h;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryENH000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("enhypostasia", "{\"term\":\"enhypostasia\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From ecclesiastical Latin \u0027enhypostasia\u0027, from Ancient greek (to 1453) \u0027ἐν\u0027 (in) + \u0027ὑπόστασις\u0027 (substance, existence, essence) from \u0027ὑπό\u0027 (under, below) + \u0027στάσις\u0027 (standing)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Something which subsists in another personality or partakes of another hypostasis; used especially to describe the human nature of Christ as \u0026quot;God the Son\u0026quot\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1997\u0027\u0027, Schaff, Philip, \u0027History of the Christian Church\u0027, (Oak Harbor, WA: Logos Research Systems, Inc.), based on the 1910 edition from Charles Scribner\u0027s Sons, Volume IV, chapter 14, [http://www.ccel.org/s/schaff/history/4_ch14.htm §144]. \u0027John of Damascus\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"quot;The Logos was bound to the flesh through the Spirit, which stands between the purely divine and the materiality of the flesh. The human nature of Jesus was incorporated in the one divine personality of the Logos (\u0027\u0027Enhypostasia\u0027\u0027).\u0026quot\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }