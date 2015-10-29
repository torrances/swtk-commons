package org.swtk.commons.dict.wordnet.indexbyname.instance.i.x.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceIXO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ixobrychus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02014717\"]}");
	add("{\"term\":\"ixobrychus exilis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02014839\"]}");
	add("{\"term\":\"ixodes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01779673\"]}");
	add("{\"term\":\"ixodes dammini\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01779945\"]}");
	add("{\"term\":\"ixodes dentatus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01781262\"]}");
	add("{\"term\":\"ixodes neotomae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01780108\"]}");
	add("{\"term\":\"ixodes pacificus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01780290\"]}");
	add("{\"term\":\"ixodes persulcatus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01781128\"]}");
	add("{\"term\":\"ixodes ricinus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01780858\"]}");
	add("{\"term\":\"ixodes scapularis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01780550\"]}");
	add("{\"term\":\"ixodes spinipalpis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01781442\"]}");
	add("{\"term\":\"ixodid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01779346\"]}");
	add("{\"term\":\"ixodidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01779187\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }