package org.swtk.commons.dict.wordnet.indexbyname.instance.c.o.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCOI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"coif\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03069247\", \"05264345\"]}");
	add("{\"term\":\"coiffeur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09954232\"]}");
	add("{\"term\":\"coiffeuse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09954304\"]}");
	add("{\"term\":\"coiffure\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05264345\"]}");
	add("{\"term\":\"coign\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04042388\", \"04042480\"]}");
	add("{\"term\":\"coigne\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04042388\", \"04042480\"]}");
	add("{\"term\":\"coigue\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12287161\"]}");
	add("{\"term\":\"coil\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"03069712\", \"03070033\", \"03070134\", \"03070236\", \"13898609\", \"03069428\"]}");
	add("{\"term\":\"coin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13409418\"]}");
	add("{\"term\":\"coinage\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00942376\", \"06305222\", \"13409050\"]}");
	add("{\"term\":\"coincidence\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05055452\", \"05084830\", \"07331599\"]}");
	add("{\"term\":\"coiner\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09954379\", \"09954565\", \"09954691\"]}");
	add("{\"term\":\"coinsurance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13367224\"]}");
	add("{\"term\":\"coir\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12608815\"]}");
	add("{\"term\":\"coition\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00847184\"]}");
	add("{\"term\":\"coitus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00847184\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }