package org.swtk.commons.dict.wordnet.index.name.instance.a.b.s.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceABST {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"abstainer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09777275\", \"09777504\"]}");
	add("{\"term\":\"abstemiousness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04891137\", \"05121562\"]}");
	add("{\"term\":\"abstention\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04889817\"]}");
	add("{\"term\":\"abstinence\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01070697\", \"04889817\"]}");
	add("{\"term\":\"abstinent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09777275\"]}");
	add("{\"term\":\"abstract\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06480622\", \"05862715\"]}");
	add("{\"term\":\"abstractedness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05708590\"]}");
	add("{\"term\":\"abstracter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09774417\"]}");
	add("{\"term\":\"abstraction\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00002137\", \"05708590\", \"02671631\", \"05788101\", \"00393656\", \"05862715\"]}");
	add("{\"term\":\"abstractionism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05949587\", \"02671709\"]}");
	add("{\"term\":\"abstractionist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09777755\"]}");
	add("{\"term\":\"abstractness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04769389\"]}");
	add("{\"term\":\"abstractor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09774417\"]}");
	add("{\"term\":\"abstruseness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05934990\", \"04830647\"]}");
	add("{\"term\":\"abstrusity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05934990\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }