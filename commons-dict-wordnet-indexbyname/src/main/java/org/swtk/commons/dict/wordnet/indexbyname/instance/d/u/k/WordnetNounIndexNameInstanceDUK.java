package org.swtk.commons.dict.wordnet.indexbyname.instance.d.u.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDUK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dukas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10964585\"]}");
	add("{\"term\":\"duke\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10058503\", \"10058345\"]}");
	add("{\"term\":\"duke ellington\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10978002\"]}");
	add("{\"term\":\"duke of cumberland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10936916\"]}");
	add("{\"term\":\"duke of edinburgh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11252465\"]}");
	add("{\"term\":\"duke of lancaster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11107081\"]}");
	add("{\"term\":\"duke of marlborough\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10917346\"]}");
	add("{\"term\":\"duke of wellington\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11400918\"]}");
	add("{\"term\":\"duke of windsor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10971689\"]}");
	add("{\"term\":\"duke university\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03259208\"]}");
	add("{\"term\":\"duke wayne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11397707\"]}");
	add("{\"term\":\"dukedom\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08574668\", \"14456210\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }