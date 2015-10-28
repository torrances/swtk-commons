package org.swtk.commons.dict.wordnet.indexbyname.instance.c.o.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCOG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cog\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03068939\", \"09953795\"]}");
	add("{\"term\":\"cogency\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04790831\", \"13817005\"]}");
	add("{\"term\":\"cogitation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05792247\", \"05843892\"]}");
	add("{\"term\":\"cognac\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07920081\"]}");
	add("{\"term\":\"cognate\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06299854\", \"10255811\"]}");
	add("{\"term\":\"cognation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13835803\", \"13836967\"]}");
	add("{\"term\":\"cognisance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05683749\"]}");
	add("{\"term\":\"cognition\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00023451\"]}");
	add("{\"term\":\"cognizance\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05718428\", \"05813165\", \"05683749\"]}");
	add("{\"term\":\"cognomen\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06348274\", \"06349063\"]}");
	add("{\"term\":\"cognoscente\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09975866\"]}");
	add("{\"term\":\"cogwheel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03435461\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }