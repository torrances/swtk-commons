package org.swtk.commons.dict.wordnet.indexbyname.instance.s.o.w;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSOW {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02398740\"]}");
	add("{\"term\":\"sow bug\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01994916\"]}");
	add("{\"term\":\"sow thistle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12039229\"]}");
	add("{\"term\":\"sowbane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11850391\"]}");
	add("{\"term\":\"sowbelly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07687108\"]}");
	add("{\"term\":\"sowbread\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12114117\"]}");
	add("{\"term\":\"sower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10648382\"]}");
	add("{\"term\":\"soweto\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09024803\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }