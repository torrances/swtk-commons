package org.swtk.commons.dict.wordnet.index.name.instance.t.i.l.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTILT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tilt\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00348834\", \"05075249\", \"06212031\", \"07197811\", \"07487600\"]}");
	add("{\"term\":\"tilter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04443004\", \"10730793\"]}");
	add("{\"term\":\"tilth\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09283813\", \"14519647\"]}");
	add("{\"term\":\"tiltyard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08702310\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }