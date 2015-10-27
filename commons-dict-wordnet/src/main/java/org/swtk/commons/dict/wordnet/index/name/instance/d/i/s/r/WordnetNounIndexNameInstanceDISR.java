package org.swtk.commons.dict.wordnet.index.name.instance.d.i.s.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDISR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"disraeli\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10957356\"]}");
	add("{\"term\":\"disregard\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00419628\", \"05714576\"]}");
	add("{\"term\":\"disrepair\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14584130\"]}");
	add("{\"term\":\"disreputability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04881604\"]}");
	add("{\"term\":\"disreputableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04881604\"]}");
	add("{\"term\":\"disrepute\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14463211\"]}");
	add("{\"term\":\"disrespect\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04922864\", \"06217172\", \"06727915\"]}");
	add("{\"term\":\"disruption\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00554210\", \"07381985\", \"14000813\", \"00384760\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }