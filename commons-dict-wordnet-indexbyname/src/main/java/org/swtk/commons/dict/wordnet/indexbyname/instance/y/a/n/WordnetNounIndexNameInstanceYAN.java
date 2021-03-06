package org.swtk.commons.dict.wordnet.indexbyname.instance.y.a.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceYAN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"yana\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06936569\", \"09692295\"]}");
	add("{\"term\":\"yanan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06936357\"]}");
	add("{\"term\":\"yang\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05923950\"]}");
	add("{\"term\":\"yang chen ning\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11422116\"]}");
	add("{\"term\":\"yangon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08733610\"]}");
	add("{\"term\":\"yangtze\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09504653\"]}");
	add("{\"term\":\"yangtze kiang\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09504653\"]}");
	add("{\"term\":\"yangtze river\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09504653\"]}");
	add("{\"term\":\"yank\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09766150\", \"10821887\"]}");
	add("{\"term\":\"yankee\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09766150\", \"10375641\", \"10821887\"]}");
	add("{\"term\":\"yankee corn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12165665\"]}");
	add("{\"term\":\"yanker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10821751\"]}");
	add("{\"term\":\"yanquapin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11738046\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }