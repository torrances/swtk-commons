package org.swtk.commons.dict.wordnet.index.name.instance.s.h.i.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSHIN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"shin\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05602122\", \"06852025\", \"07673049\", \"05570535\"]}");
	add("{\"term\":\"shina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06985218\"]}");
	add("{\"term\":\"shinbone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05602122\"]}");
	add("{\"term\":\"shindig\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08269966\"]}");
	add("{\"term\":\"shindy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08269966\"]}");
	add("{\"term\":\"shine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04961131\"]}");
	add("{\"term\":\"shiner\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01444066\", \"02627181\", \"09455894\", \"14312889\"]}");
	add("{\"term\":\"shingle\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04201052\", \"14723735\", \"15064012\"]}");
	add("{\"term\":\"shingler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10608974\"]}");
	add("{\"term\":\"shingles\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14156311\"]}");
	add("{\"term\":\"shingling\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00619504\", \"14724441\"]}");
	add("{\"term\":\"shingon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06252367\"]}");
	add("{\"term\":\"shininess\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04961860\"]}");
	add("{\"term\":\"shining\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00579832\"]}");
	add("{\"term\":\"shinleaf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12277225\"]}");
	add("{\"term\":\"shinney\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00469374\"]}");
	add("{\"term\":\"shinny\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00469374\"]}");
	add("{\"term\":\"shinpad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04201170\"]}");
	add("{\"term\":\"shinplaster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13406639\"]}");
	add("{\"term\":\"shinto\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06253477\", \"08117286\"]}");
	add("{\"term\":\"shintoism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06253477\"]}");
	add("{\"term\":\"shintoist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09705184\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }