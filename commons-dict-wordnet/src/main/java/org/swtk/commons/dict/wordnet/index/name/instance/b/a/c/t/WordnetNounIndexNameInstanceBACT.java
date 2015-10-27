package org.swtk.commons.dict.wordnet.index.name.instance.b.a.c.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBACT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bacteremia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14133701\"]}");
	add("{\"term\":\"bacteria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01351171\"]}");
	add("{\"term\":\"bacteriacide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14796346\"]}");
	add("{\"term\":\"bacteriaemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14133701\"]}");
	add("{\"term\":\"bactericide\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02719116\", \"14796346\"]}");
	add("{\"term\":\"bacteriemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14133701\"]}");
	add("{\"term\":\"bacteriochlorophyll\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01401706\"]}");
	add("{\"term\":\"bacteriologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09850657\"]}");
	add("{\"term\":\"bacteriology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06056223\"]}");
	add("{\"term\":\"bacteriolysis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13458552\"]}");
	add("{\"term\":\"bacteriophage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01337503\"]}");
	add("{\"term\":\"bacteriostasis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13458668\"]}");
	add("{\"term\":\"bacteriostat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14803241\"]}");
	add("{\"term\":\"bacterium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01351171\"]}");
	add("{\"term\":\"bacteroid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01352376\"]}");
	add("{\"term\":\"bacteroidaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01367228\"]}");
	add("{\"term\":\"bacteroides\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01367507\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }