package org.swtk.commons.dict.wordnet.index.name.instance.r.o.u.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceROUT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rout\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07491544\", \"08201518\"]}");
	add("{\"term\":\"route\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04103160\", \"08633886\"]}");
	add("{\"term\":\"routemarch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00292720\"]}");
	add("{\"term\":\"router\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04121813\", \"04121938\", \"10560429\"]}");
	add("{\"term\":\"routine\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06594579\", \"06905066\", \"01028424\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }