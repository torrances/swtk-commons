package org.swtk.commons.dict.wordnet.indexbyname.instance.n.e.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNEV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"neva\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09392755\"]}");
	add("{\"term\":\"neva river\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09392755\"]}");
	add("{\"term\":\"nevada\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09133059\"]}");
	add("{\"term\":\"nevadan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09763593\"]}");
	add("{\"term\":\"nevado de colima\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09196912\"]}");
	add("{\"term\":\"neve\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09392917\"]}");
	add("{\"term\":\"nevelson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11224679\"]}");
	add("{\"term\":\"nevil shute\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11319202\"]}");
	add("{\"term\":\"nevil shute norway\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11319202\"]}");
	add("{\"term\":\"neville chamberlain\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10909441\"]}");
	add("{\"term\":\"nevirapine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03826799\"]}");
	add("{\"term\":\"nevis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09010586\"]}");
	add("{\"term\":\"nevoid elephantiasis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14391202\"]}");
	add("{\"term\":\"nevus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04699986\"]}");
	add("{\"term\":\"nevus flammeus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04703541\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }