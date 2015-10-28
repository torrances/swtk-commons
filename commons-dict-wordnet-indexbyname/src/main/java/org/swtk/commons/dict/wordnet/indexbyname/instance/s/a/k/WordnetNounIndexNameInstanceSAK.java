package org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSAK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sakartvelo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09041218\"]}");
	add("{\"term\":\"sake\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05992232\", \"07907408\", \"05150324\"]}");
	add("{\"term\":\"sakharov\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11298488\"]}");
	add("{\"term\":\"saki\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02495579\", \"07907408\", \"11216617\"]}");
	add("{\"term\":\"sakkara\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08920274\"]}");
	add("{\"term\":\"sakti\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09551721\"]}");
	add("{\"term\":\"saktism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06249212\", \"08114188\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }