package org.swtk.commons.dict.wordnet.indexbyname.instance.f.u.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFUE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fuego\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09197805\"]}");
	add("{\"term\":\"fuel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14899228\"]}");
	add("{\"term\":\"fuel cell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03405713\"]}");
	add("{\"term\":\"fuel consumption rate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13845499\"]}");
	add("{\"term\":\"fuel filter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03405887\"]}");
	add("{\"term\":\"fuel gauge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03406044\"]}");
	add("{\"term\":\"fuel indicator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03406044\"]}");
	add("{\"term\":\"fuel injection\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03406194\"]}");
	add("{\"term\":\"fuel injection system\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03406194\"]}");
	add("{\"term\":\"fuel level\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13390247\"]}");
	add("{\"term\":\"fuel line\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03406415\"]}");
	add("{\"term\":\"fuel oil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14710746\"]}");
	add("{\"term\":\"fuel pod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03980303\"]}");
	add("{\"term\":\"fuel system\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03406636\"]}");
	add("{\"term\":\"fueling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01061643\"]}");
	add("{\"term\":\"fuentes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11004872\"]}");
	add("{\"term\":\"fuerzas armadas revolucionarios de colombia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08058935\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }