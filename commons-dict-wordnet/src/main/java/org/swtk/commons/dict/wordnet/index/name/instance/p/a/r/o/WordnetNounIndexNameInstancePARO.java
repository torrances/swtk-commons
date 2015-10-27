package org.swtk.commons.dict.wordnet.index.name.instance.p.a.r.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePARO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"parochetus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12576225\"]}");
	add("{\"term\":\"parochialism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06215433\"]}");
	add("{\"term\":\"parodist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10420697\"]}");
	add("{\"term\":\"parody\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00550647\", \"06793148\"]}");
	add("{\"term\":\"parole\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01260381\", \"06686933\", \"07241961\"]}");
	add("{\"term\":\"parolee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10497170\"]}");
	add("{\"term\":\"paronomasia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06794438\"]}");
	add("{\"term\":\"paronychia\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11833778\", \"14202276\"]}");
	add("{\"term\":\"paronym\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06299021\"]}");
	add("{\"term\":\"parophrys\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02667141\"]}");
	add("{\"term\":\"paroquet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01823844\"]}");
	add("{\"term\":\"parosamia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14082503\"]}");
	add("{\"term\":\"parotitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14375975\"]}");
	add("{\"term\":\"parousia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07337150\"]}");
	add("{\"term\":\"paroxetime\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03897548\"]}");
	add("{\"term\":\"paroxysm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14106270\"]}");
	add("{\"term\":\"paroxytone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06312662\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }