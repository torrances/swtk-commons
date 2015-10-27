package org.swtk.commons.dict.wordnet.index.name.instance.d.i.l.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDILA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dilantin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03208125\"]}");
	add("{\"term\":\"dilapidation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13487515\", \"14586133\"]}");
	add("{\"term\":\"dilatation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00366821\", \"14087115\"]}");
	add("{\"term\":\"dilater\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03202907\"]}");
	add("{\"term\":\"dilation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00366821\", \"07152658\"]}");
	add("{\"term\":\"dilator\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03202907\", \"03203067\", \"05229760\"]}");
	add("{\"term\":\"dilatoriness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05069539\"]}");
	add("{\"term\":\"dilaudid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03558888\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }