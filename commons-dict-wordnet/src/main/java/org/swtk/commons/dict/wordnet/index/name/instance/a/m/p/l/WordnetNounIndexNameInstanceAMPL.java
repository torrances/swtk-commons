package org.swtk.commons.dict.wordnet.index.name.instance.a.m.p.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAMPL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ampleness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05111556\", \"05120210\"]}");
	add("{\"term\":\"amplification\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00366155\", \"05116624\", \"00372295\"]}");
	add("{\"term\":\"amplifier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02708803\"]}");
	add("{\"term\":\"amplitude\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05105573\", \"05122718\", \"07459482\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }