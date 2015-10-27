package org.swtk.commons.dict.wordnet.index.name.instance.m.e.l.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMELI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"melia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12716521\"]}");
	add("{\"term\":\"meliaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12715468\"]}");
	add("{\"term\":\"melicocca\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12765416\"]}");
	add("{\"term\":\"melicoccus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12765416\"]}");
	add("{\"term\":\"melicytus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12411797\"]}");
	add("{\"term\":\"melilot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11771458\"]}");
	add("{\"term\":\"melilotus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11771458\"]}");
	add("{\"term\":\"melinae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02449851\"]}");
	add("{\"term\":\"melioration\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13491396\", \"14445583\", \"00261872\"]}");
	add("{\"term\":\"meliorism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05954357\"]}");
	add("{\"term\":\"meliorist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10534787\"]}");
	add("{\"term\":\"meliphagidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01529276\"]}");
	add("{\"term\":\"melissa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12875203\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }