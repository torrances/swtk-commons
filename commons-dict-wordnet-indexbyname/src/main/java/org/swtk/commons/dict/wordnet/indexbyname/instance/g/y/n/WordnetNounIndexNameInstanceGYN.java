package org.swtk.commons.dict.wordnet.indexbyname.instance.g.y.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGYN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gynaecologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10173582\"]}");
	add("{\"term\":\"gynaecology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06060432\"]}");
	add("{\"term\":\"gynaeolatry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01047230\"]}");
	add("{\"term\":\"gynandromorph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10191752\"]}");
	add("{\"term\":\"gynarchy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08378744\"]}");
	add("{\"term\":\"gynecocracy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08378744\"]}");
	add("{\"term\":\"gynecologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10173582\"]}");
	add("{\"term\":\"gynecology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06060432\"]}");
	add("{\"term\":\"gynecomastia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14529622\"]}");
	add("{\"term\":\"gyneolatry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01047230\"]}");
	add("{\"term\":\"gynne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11040884\"]}");
	add("{\"term\":\"gynobase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11697194\"]}");
	add("{\"term\":\"gynoecium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13114611\"]}");
	add("{\"term\":\"gynogenesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13511690\"]}");
	add("{\"term\":\"gynophobia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14405564\"]}");
	add("{\"term\":\"gynophore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11697301\"]}");
	add("{\"term\":\"gynostegium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11695855\"]}");
	add("{\"term\":\"gynura\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11995569\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }