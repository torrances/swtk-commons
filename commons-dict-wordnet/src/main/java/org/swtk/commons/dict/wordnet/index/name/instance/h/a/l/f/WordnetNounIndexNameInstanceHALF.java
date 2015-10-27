package org.swtk.commons.dict.wordnet.index.name.instance.h.a.l.f;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHALF {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"half\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"15282640\", \"13758939\"]}");
	add("{\"term\":\"halfback\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00728250\", \"10176688\"]}");
	add("{\"term\":\"halfbeak\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02553765\"]}");
	add("{\"term\":\"halfpenny\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13411698\"]}");
	add("{\"term\":\"halfpennyworth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13683150\"]}");
	add("{\"term\":\"halftime\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15297557\"]}");
	add("{\"term\":\"halftone\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03483344\", \"03483483\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }