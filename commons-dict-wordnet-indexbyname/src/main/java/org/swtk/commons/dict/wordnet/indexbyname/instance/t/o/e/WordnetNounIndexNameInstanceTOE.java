package org.swtk.commons.dict.wordnet.indexbyname.instance.t.o.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTOE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"toe\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04451479\", \"05585285\", \"04451352\", \"05585041\"]}");
	add("{\"term\":\"toe box\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04451656\"]}");
	add("{\"term\":\"toe crack\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14299062\"]}");
	add("{\"term\":\"toe dance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00529096\"]}");
	add("{\"term\":\"toe dancing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00529096\"]}");
	add("{\"term\":\"toe toe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12135900\"]}");
	add("{\"term\":\"toea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13702817\"]}");
	add("{\"term\":\"toecap\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04451883\"]}");
	add("{\"term\":\"toehold\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00816697\", \"04452087\", \"14603372\"]}");
	add("{\"term\":\"toenail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05592136\"]}");
	add("{\"term\":\"toetoe\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12129882\", \"12135900\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }