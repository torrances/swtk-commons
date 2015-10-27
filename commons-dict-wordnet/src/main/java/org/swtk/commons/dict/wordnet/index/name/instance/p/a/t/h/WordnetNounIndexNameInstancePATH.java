package org.swtk.commons.dict.wordnet.index.name.instance.p.a.t.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePATH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"path\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"09410115\", \"08633886\", \"03905025\", \"00416689\"]}");
	add("{\"term\":\"pathan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08501658\", \"09709135\"]}");
	add("{\"term\":\"pathfinder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10582177\"]}");
	add("{\"term\":\"pathogen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01388648\"]}");
	add("{\"term\":\"pathogenesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13554552\"]}");
	add("{\"term\":\"pathologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10030728\"]}");
	add("{\"term\":\"pathology\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14228432\", \"06070395\"]}");
	add("{\"term\":\"pathos\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07086377\", \"07569430\", \"05218522\"]}");
	add("{\"term\":\"pathway\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03905230\", \"05483530\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }