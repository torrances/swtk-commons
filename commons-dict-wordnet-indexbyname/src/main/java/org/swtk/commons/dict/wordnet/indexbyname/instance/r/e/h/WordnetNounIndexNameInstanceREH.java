package org.swtk.commons.dict.wordnet.indexbyname.instance.r.e.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceREH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rehabilitation\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00701513\", \"01244544\", \"00269862\", \"00401453\"]}");
	add("{\"term\":\"rehabilitation program\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05909190\"]}");
	add("{\"term\":\"reharmonisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07041138\"]}");
	add("{\"term\":\"reharmonization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07041138\"]}");
	add("{\"term\":\"rehash\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06648284\"]}");
	add("{\"term\":\"rehearing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00884138\"]}");
	add("{\"term\":\"rehearsal\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00898530\", \"00898724\"]}");
	add("{\"term\":\"rehnquist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11276755\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }