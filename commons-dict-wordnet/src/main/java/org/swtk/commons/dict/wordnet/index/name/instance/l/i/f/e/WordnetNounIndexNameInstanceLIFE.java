package org.swtk.commons.dict.wordnet.index.name.instance.l.i.f.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLIFE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"life\", \"synsetCount\":14, \"upperType\":\"NOUN\", \"ids\":[\"15249872\", \"09201624\", \"06527818\", \"11493691\", \"00006269\", \"04639514\", \"10280403\", \"15165852\", \"15165704\", \"15165365\", \"13984978\", \"13984685\", \"05818587\", \"13986528\"]}");
	add("{\"term\":\"lifeblood\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05203064\", \"05409194\"]}");
	add("{\"term\":\"lifeboat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03667927\"]}");
	add("{\"term\":\"lifeguard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10280497\"]}");
	add("{\"term\":\"lifelessness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05013469\", \"14029664\"]}");
	add("{\"term\":\"lifeline\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03668395\", \"03668560\", \"05702492\", \"13929781\"]}");
	add("{\"term\":\"lifer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10280738\"]}");
	add("{\"term\":\"lifesaver\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03668045\", \"10280497\"]}");
	add("{\"term\":\"lifesaving\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00094694\"]}");
	add("{\"term\":\"lifespan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15165365\"]}");
	add("{\"term\":\"lifestyle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04937809\"]}");
	add("{\"term\":\"lifetime\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15165365\"]}");
	add("{\"term\":\"lifework\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00585197\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }