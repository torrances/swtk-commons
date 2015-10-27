package org.swtk.commons.dict.wordnet.index.name.instance.w.h.i.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWHIP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"whip\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00135394\", \"05030068\", \"07627976\", \"10796434\", \"04585055\"]}");
	add("{\"term\":\"whipcord\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04585398\", \"04585506\"]}");
	add("{\"term\":\"whiplash\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00135394\", \"14321922\"]}");
	add("{\"term\":\"whipper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10703629\"]}");
	add("{\"term\":\"whippersnapper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10796655\"]}");
	add("{\"term\":\"whippet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02093786\"]}");
	add("{\"term\":\"whipping\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01178709\", \"04585845\", \"07491763\", \"01165537\"]}");
	add("{\"term\":\"whippletree\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04584853\"]}");
	add("{\"term\":\"whippoorwill\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01838728\"]}");
	add("{\"term\":\"whipsaw\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04511131\"]}");
	add("{\"term\":\"whipsnake\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01734186\"]}");
	add("{\"term\":\"whipstitch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04585845\"]}");
	add("{\"term\":\"whipstitching\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04585845\"]}");
	add("{\"term\":\"whiptail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01688449\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }