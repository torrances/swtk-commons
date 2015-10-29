package org.swtk.commons.dict.wordnet.indexbyname.instance.u.r.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceURB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"urban area\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08693705\"]}");
	add("{\"term\":\"urban center\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08542298\"]}");
	add("{\"term\":\"urban guerrilla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10760915\"]}");
	add("{\"term\":\"urban ii\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11376631\"]}");
	add("{\"term\":\"urban legend\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06695697\"]}");
	add("{\"term\":\"urban planning\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00930357\", \"06134316\"]}");
	add("{\"term\":\"urban renewal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00402002\"]}");
	add("{\"term\":\"urban sprawl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08557280\"]}");
	add("{\"term\":\"urban typhus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14164720\"]}");
	add("{\"term\":\"urban v\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11376817\"]}");
	add("{\"term\":\"urban vi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11377081\"]}");
	add("{\"term\":\"urban viii\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11377327\"]}");
	add("{\"term\":\"urbana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09107153\"]}");
	add("{\"term\":\"urbanisation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13592966\", \"14603879\"]}");
	add("{\"term\":\"urbanity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04823533\", \"04920389\"]}");
	add("{\"term\":\"urbanization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13592966\", \"14603879\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }