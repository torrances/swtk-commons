package org.swtk.commons.dict.wordnet.index.name.instance.t.o.m.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTOMB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tomb\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03459977\"]}");
	add("{\"term\":\"tombac\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15100258\"]}");
	add("{\"term\":\"tombak\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15100258\"]}");
	add("{\"term\":\"tombaugh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11365534\"]}");
	add("{\"term\":\"tombigbee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09482687\"]}");
	add("{\"term\":\"tombola\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00505855\"]}");
	add("{\"term\":\"tomboy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10734679\"]}");
	add("{\"term\":\"tomboyishness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04674615\"]}");
	add("{\"term\":\"tombstone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03460432\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }