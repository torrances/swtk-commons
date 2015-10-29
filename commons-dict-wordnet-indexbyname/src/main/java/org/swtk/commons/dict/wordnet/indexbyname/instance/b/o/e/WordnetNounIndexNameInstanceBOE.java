package org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBOE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"boehm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10873993\"]}");
	add("{\"term\":\"boehme\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10873993\"]}");
	add("{\"term\":\"boehmenism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06197881\"]}");
	add("{\"term\":\"boehmeria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12413460\"]}");
	add("{\"term\":\"boehmeria nivea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12413786\"]}");
	add("{\"term\":\"boell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10874223\"]}");
	add("{\"term\":\"boeotia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08807095\"]}");
	add("{\"term\":\"boer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09658823\"]}");
	add("{\"term\":\"boer war\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01305743\"]}");
	add("{\"term\":\"boethius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10874373\"]}");
	add("{\"term\":\"boeuf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07679337\"]}");
	add("{\"term\":\"boeuf bourguignonne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07878437\"]}");
	add("{\"term\":\"boeuf fondu bourguignon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07884021\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }