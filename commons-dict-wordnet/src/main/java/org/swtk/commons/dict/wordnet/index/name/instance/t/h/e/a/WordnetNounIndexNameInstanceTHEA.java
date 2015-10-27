package org.swtk.commons.dict.wordnet.index.name.instance.t.h.e.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTHEA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"thea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09599342\"]}");
	add("{\"term\":\"theaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12949821\"]}");
	add("{\"term\":\"theanthropism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05775383\", \"05775577\"]}");
	add("{\"term\":\"theater\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08569203\", \"07019235\", \"04424944\"]}");
	add("{\"term\":\"theatergoer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10460291\"]}");
	add("{\"term\":\"theatre\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08569203\", \"07019235\", \"04424944\"]}");
	add("{\"term\":\"theatregoer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10460291\"]}");
	add("{\"term\":\"theatrical\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06906924\"]}");
	add("{\"term\":\"theatricality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04795921\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }