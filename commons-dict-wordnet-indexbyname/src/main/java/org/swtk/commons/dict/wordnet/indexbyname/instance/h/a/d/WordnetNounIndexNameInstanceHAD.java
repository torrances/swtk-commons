package org.swtk.commons.dict.wordnet.indexbyname.instance.h.a.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHAD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"haddock\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02526508\", \"07805517\"]}");
	add("{\"term\":\"hadean\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15154524\"]}");
	add("{\"term\":\"hades\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05637164\", \"09593427\"]}");
	add("{\"term\":\"hadith\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00417422\", \"05677025\"]}");
	add("{\"term\":\"hadj\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05923628\"]}");
	add("{\"term\":\"hadji\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10175844\"]}");
	add("{\"term\":\"hadrian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11041338\"]}");
	add("{\"term\":\"hadron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09323580\"]}");
	add("{\"term\":\"hadrosaur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01708575\"]}");
	add("{\"term\":\"hadrosauridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01708358\"]}");
	add("{\"term\":\"hadrosaurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01708575\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }