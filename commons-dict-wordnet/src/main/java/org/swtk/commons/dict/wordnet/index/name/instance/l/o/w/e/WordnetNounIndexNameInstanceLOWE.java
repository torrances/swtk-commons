package org.swtk.commons.dict.wordnet.index.name.instance.l.o.w.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLOWE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lowell\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"11162358\", \"11162507\", \"11162604\", \"11162778\"]}");
	add("{\"term\":\"lower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03699299\"]}");
	add("{\"term\":\"lowercase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06837807\"]}");
	add("{\"term\":\"lowerclassman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10294512\"]}");
	add("{\"term\":\"lowering\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00328509\", \"00354295\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }