package org.swtk.commons.dict.wordnet.index.name.instance.s.c.o.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSCOL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"scold\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10581289\"]}");
	add("{\"term\":\"scolder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10581289\"]}");
	add("{\"term\":\"scolding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06725772\"]}");
	add("{\"term\":\"scolion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07067646\"]}");
	add("{\"term\":\"scoliosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14528966\"]}");
	add("{\"term\":\"scollop\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01968530\", \"07670495\", \"07813617\"]}");
	add("{\"term\":\"scolopacidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02028184\"]}");
	add("{\"term\":\"scolopax\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02033797\"]}");
	add("{\"term\":\"scolopendrium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13205292\"]}");
	add("{\"term\":\"scolymus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12030927\"]}");
	add("{\"term\":\"scolytidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02182081\"]}");
	add("{\"term\":\"scolytus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02182366\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }