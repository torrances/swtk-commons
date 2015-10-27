package org.swtk.commons.dict.wordnet.index.name.instance.l.a.r.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLARG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"large\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05103453\"]}");
	add("{\"term\":\"largemouth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02567955\"]}");
	add("{\"term\":\"largeness\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04796210\", \"05111246\", \"05113617\", \"05626076\"]}");
	add("{\"term\":\"largess\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04839947\", \"13286648\"]}");
	add("{\"term\":\"largesse\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04839947\", \"13286648\"]}");
	add("{\"term\":\"larghetto\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07060795\"]}");
	add("{\"term\":\"largo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07060601\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }