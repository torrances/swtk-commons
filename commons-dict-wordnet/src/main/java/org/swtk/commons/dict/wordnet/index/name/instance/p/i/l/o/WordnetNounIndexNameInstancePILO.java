package org.swtk.commons.dict.wordnet.index.name.instance.p.i.l.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePILO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pilocarpine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03945114\"]}");
	add("{\"term\":\"pilosella\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12023876\"]}");
	add("{\"term\":\"pilosity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04690810\"]}");
	add("{\"term\":\"pilot\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"03333146\", \"03945557\", \"05947118\", \"06633413\", \"10453216\", \"10452928\"]}");
	add("{\"term\":\"pilotage\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00610774\", \"00817462\"]}");
	add("{\"term\":\"pilotfish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02582819\"]}");
	add("{\"term\":\"pilothouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03945953\"]}");
	add("{\"term\":\"piloting\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00610774\", \"00817462\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }