package org.swtk.commons.dict.wordnet.indexbyname.instance.n.o.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNOO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"noodle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05547087\", \"07715329\"]}");
	add("{\"term\":\"nook\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03114532\", \"08661223\"]}");
	add("{\"term\":\"nook and cranny\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05828167\"]}");
	add("{\"term\":\"nookie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00847651\"]}");
	add("{\"term\":\"nooks and crannies\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05828167\"]}");
	add("{\"term\":\"nooky\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00847651\"]}");
	add("{\"term\":\"noon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15190537\"]}");
	add("{\"term\":\"noonday\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15190537\"]}");
	add("{\"term\":\"noontide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15190537\"]}");
	add("{\"term\":\"noose\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03835103\", \"04255961\"]}");
	add("{\"term\":\"nootka\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06927485\", \"09682656\"]}");
	add("{\"term\":\"nootka cypress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11656281\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }