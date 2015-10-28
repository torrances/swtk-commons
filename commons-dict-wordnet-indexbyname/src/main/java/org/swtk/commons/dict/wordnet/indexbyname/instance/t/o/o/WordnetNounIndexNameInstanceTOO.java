package org.swtk.commons.dict.wordnet.indexbyname.instance.t.o.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTOO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tool\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05534354\", \"09996081\", \"00174610\", \"04459089\"]}");
	add("{\"term\":\"toolbox\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04459886\"]}");
	add("{\"term\":\"toolhouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04460028\"]}");
	add("{\"term\":\"toolmaker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10734996\"]}");
	add("{\"term\":\"toolshed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04460028\"]}");
	add("{\"term\":\"toon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06628817\"]}");
	add("{\"term\":\"toona\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12720979\"]}");
	add("{\"term\":\"tooshie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05566889\"]}");
	add("{\"term\":\"toot\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00512052\", \"07412876\"]}");
	add("{\"term\":\"tooth\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"04460308\", \"00180425\", \"02158524\", \"04460119\", \"05290245\"]}");
	add("{\"term\":\"toothache\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14347383\"]}");
	add("{\"term\":\"toothbrush\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05269921\", \"04460427\"]}");
	add("{\"term\":\"toothpaste\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04460569\"]}");
	add("{\"term\":\"toothpick\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04460661\"]}");
	add("{\"term\":\"toothpowder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04460828\"]}");
	add("{\"term\":\"toothsomeness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05002958\"]}");
	add("{\"term\":\"toothwort\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11902895\"]}");
	add("{\"term\":\"tootle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07412962\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }