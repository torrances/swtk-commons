package org.swtk.commons.dict.wordnet.indexbyname.instance.w.i.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWIG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"wig\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06726038\", \"04591493\"]}");
	add("{\"term\":\"wig tree\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12781299\"]}");
	add("{\"term\":\"wigeon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01851289\"]}");
	add("{\"term\":\"wigging\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06726038\"]}");
	add("{\"term\":\"wiggle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00350531\"]}");
	add("{\"term\":\"wiggle nail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03116891\"]}");
	add("{\"term\":\"wiggle room\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04666924\"]}");
	add("{\"term\":\"wiggler\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01938036\", \"02203161\", \"10800912\"]}");
	add("{\"term\":\"wiggliness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04782424\"]}");
	add("{\"term\":\"wight\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09502368\", \"09995959\"]}");
	add("{\"term\":\"wigmaker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10801136\"]}");
	add("{\"term\":\"wigner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11406133\"]}");
	add("{\"term\":\"wigwam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04591659\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }