package org.swtk.commons.dict.wordnet.indexbyname.instance.g.a.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGAT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03432112\"]}");
	add("{\"term\":\"gate\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03432819\", \"13279168\", \"03432566\", \"03432206\"]}");
	add("{\"term\":\"gateau\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07647443\"]}");
	add("{\"term\":\"gatecrasher\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10141609\"]}");
	add("{\"term\":\"gatefold\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06269194\"]}");
	add("{\"term\":\"gatehouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03433000\"]}");
	add("{\"term\":\"gatekeeper\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10046278\", \"10141785\"]}");
	add("{\"term\":\"gatepost\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03433259\"]}");
	add("{\"term\":\"gates\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11011932\"]}");
	add("{\"term\":\"gateway\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03433387\"]}");
	add("{\"term\":\"gather\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01016932\", \"03433715\"]}");
	add("{\"term\":\"gatherer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09955820\", \"10141957\"]}");
	add("{\"term\":\"gathering\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03433715\", \"01016932\", \"01232427\", \"07991473\"]}");
	add("{\"term\":\"gathic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06986707\"]}");
	add("{\"term\":\"gatling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11012188\"]}");
	add("{\"term\":\"gator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01701075\"]}");
	add("{\"term\":\"gatt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08317350\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }