package org.swtk.commons.dict.wordnet.indexbyname.instance.n.i.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNIB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"nib\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01760949\", \"03828651\"]}");
	add("{\"term\":\"nibble\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00843858\", \"13647355\"]}");
	add("{\"term\":\"nibbler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10377183\"]}");
	add("{\"term\":\"nibelung\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09522788\", \"09522986\"]}");
	add("{\"term\":\"nibelungenlied\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06393968\"]}");
	add("{\"term\":\"niblick\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03828756\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }