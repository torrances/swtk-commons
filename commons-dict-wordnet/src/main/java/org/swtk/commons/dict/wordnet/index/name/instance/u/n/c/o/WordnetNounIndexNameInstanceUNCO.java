package org.swtk.commons.dict.wordnet.index.name.instance.u.n.c.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceUNCO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"uncomfortableness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07522568\", \"14470118\"]}");
	add("{\"term\":\"uncommonness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04804195\", \"04804379\"]}");
	add("{\"term\":\"uncommunicativeness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04659141\"]}");
	add("{\"term\":\"unconcern\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07520777\", \"04680827\"]}");
	add("{\"term\":\"unconfessed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08494175\"]}");
	add("{\"term\":\"uncongeniality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04666043\"]}");
	add("{\"term\":\"unconnectedness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13816438\"]}");
	add("{\"term\":\"unconscientiousness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04680698\", \"04856305\"]}");
	add("{\"term\":\"unconscious\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05621057\"]}");
	add("{\"term\":\"unconsciousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05686773\"]}");
	add("{\"term\":\"unconstraint\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04892593\"]}");
	add("{\"term\":\"unconventionality\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04808134\", \"05642755\"]}");
	add("{\"term\":\"uncouthness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04825019\"]}");
	add("{\"term\":\"uncovering\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00043933\", \"00395611\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }