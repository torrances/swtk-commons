package org.swtk.commons.dict.wordnet.indexbyname.instance.c.e.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCEC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cecal appendage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05545209\"]}");
	add("{\"term\":\"cecidomyidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02191866\"]}");
	add("{\"term\":\"cecil blount demille\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10949850\"]}");
	add("{\"term\":\"cecil frank powell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11264877\"]}");
	add("{\"term\":\"cecil john rhodes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11279044\"]}");
	add("{\"term\":\"cecil rhodes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11279044\"]}");
	add("{\"term\":\"cecil scott forester\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10995400\"]}");
	add("{\"term\":\"cecity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14150142\"]}");
	add("{\"term\":\"cecropia\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02305936\", \"12424989\"]}");
	add("{\"term\":\"cecropia moth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02305936\"]}");
	add("{\"term\":\"cecropia peltata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12425234\"]}");
	add("{\"term\":\"cecropiaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12424819\"]}");
	add("{\"term\":\"cecum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05544003\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }