package org.swtk.commons.dict.wordnet.indexbyname.instance.g.i.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGIB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gib\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02125462\", \"13650222\"]}");
	add("{\"term\":\"gibber\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06621081\"]}");
	add("{\"term\":\"gibberellic acid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14769547\"]}");
	add("{\"term\":\"gibberellin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14769401\"]}");
	add("{\"term\":\"gibberish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06621081\"]}");
	add("{\"term\":\"gibbet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03418034\"]}");
	add("{\"term\":\"gibbon\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02485993\", \"11017738\"]}");
	add("{\"term\":\"gibbosity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13917127\"]}");
	add("{\"term\":\"gibbousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13917127\"]}");
	add("{\"term\":\"gibbs\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11017884\"]}");
	add("{\"term\":\"gibbsite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14701104\"]}");
	add("{\"term\":\"gibe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06780713\"]}");
	add("{\"term\":\"gibibit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13650770\"]}");
	add("{\"term\":\"gibibyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13650222\"]}");
	add("{\"term\":\"gibit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13650770\"]}");
	add("{\"term\":\"giblet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07664705\"]}");
	add("{\"term\":\"giblets\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07664705\"]}");
	add("{\"term\":\"gibraltar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09051211\"]}");
	add("{\"term\":\"gibraltar fever\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14151511\"]}");
	add("{\"term\":\"gibraltarian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09768342\"]}");
	add("{\"term\":\"gibran\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11017993\"]}");
	add("{\"term\":\"gibson\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11018113\", \"11018301\", \"11018470\"]}");
	add("{\"term\":\"gibson desert\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09192454\"]}");
	add("{\"term\":\"gibson girl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10148875\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }