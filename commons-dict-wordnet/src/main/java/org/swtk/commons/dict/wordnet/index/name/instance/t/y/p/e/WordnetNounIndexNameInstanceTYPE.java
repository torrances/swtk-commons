package org.swtk.commons.dict.wordnet.index.name.instance.t.y.p.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTYPE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"type\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"04511781\", \"06808825\", \"06838170\", \"08128385\", \"09928518\", \"05848697\"]}");
	add("{\"term\":\"typeface\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06838449\"]}");
	add("{\"term\":\"typescript\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06400752\"]}");
	add("{\"term\":\"typesetter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09969425\"]}");
	add("{\"term\":\"typewriter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04512331\"]}");
	add("{\"term\":\"typewriting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06414208\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }