package org.swtk.commons.dict.wordnet.index.name.instance.c.a.s.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCASS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cassandra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09619360\"]}");
	add("{\"term\":\"cassareep\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07937330\"]}");
	add("{\"term\":\"cassava\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"12947240\", \"12947773\", \"14785757\"]}");
	add("{\"term\":\"casserole\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02982212\", \"07595924\"]}");
	add("{\"term\":\"cassette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02982340\"]}");
	add("{\"term\":\"cassia\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11725640\", \"12512131\", \"12512331\"]}");
	add("{\"term\":\"cassie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11778320\"]}");
	add("{\"term\":\"cassino\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00492724\"]}");
	add("{\"term\":\"cassiope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12254276\"]}");
	add("{\"term\":\"cassiopeia\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09260533\", \"09520906\"]}");
	add("{\"term\":\"cassirer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10906310\"]}");
	add("{\"term\":\"cassiri\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07948563\"]}");
	add("{\"term\":\"cassite\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09661556\", \"06981275\"]}");
	add("{\"term\":\"cassiterite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14694088\"]}");
	add("{\"term\":\"cassius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10906515\"]}");
	add("{\"term\":\"cassock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02982975\"]}");
	add("{\"term\":\"cassowary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01522204\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }