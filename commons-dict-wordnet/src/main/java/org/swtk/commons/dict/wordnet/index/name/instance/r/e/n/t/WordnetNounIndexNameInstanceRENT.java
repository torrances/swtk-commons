package org.swtk.commons.dict.wordnet.index.name.instance.r.e.n.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRENT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rent\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00392215\", \"13317293\", \"09433806\", \"13316680\"]}");
	add("{\"term\":\"rental\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01113280\", \"13269292\"]}");
	add("{\"term\":\"rente\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13315526\"]}");
	add("{\"term\":\"renter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10540397\", \"10719850\"]}");
	add("{\"term\":\"rentier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10540557\"]}");
	add("{\"term\":\"renting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01113280\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }