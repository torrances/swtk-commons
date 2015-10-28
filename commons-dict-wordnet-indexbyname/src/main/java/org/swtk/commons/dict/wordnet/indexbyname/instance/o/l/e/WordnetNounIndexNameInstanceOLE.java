package org.swtk.commons.dict.wordnet.indexbyname.instance.o.l.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOLE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"olea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12321142\"]}");
	add("{\"term\":\"oleaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12320505\"]}");
	add("{\"term\":\"oleaginousness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04875718\", \"05007281\"]}");
	add("{\"term\":\"oleales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12320958\"]}");
	add("{\"term\":\"oleander\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11794456\"]}");
	add("{\"term\":\"oleandra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13225000\"]}");
	add("{\"term\":\"oleandraceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13224740\"]}");
	add("{\"term\":\"olearia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12018244\"]}");
	add("{\"term\":\"oleaster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12346304\"]}");
	add("{\"term\":\"olecranon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05601409\"]}");
	add("{\"term\":\"oled\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03860026\"]}");
	add("{\"term\":\"olefin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14737281\"]}");
	add("{\"term\":\"olefine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14737281\"]}");
	add("{\"term\":\"olein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15104223\"]}");
	add("{\"term\":\"oleo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07688659\"]}");
	add("{\"term\":\"oleomargarine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07688659\"]}");
	add("{\"term\":\"oleoresin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14920592\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }