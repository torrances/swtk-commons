package org.swtk.commons.dict.wordnet.index.name.instance.s.h.e.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSHEL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sheldrake\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01852107\", \"01857056\"]}");
	add("{\"term\":\"shelduck\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01852317\"]}");
	add("{\"term\":\"shelf\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09360159\", \"04197095\"]}");
	add("{\"term\":\"shelfful\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13791568\"]}");
	add("{\"term\":\"shell\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"01906823\", \"03965995\", \"04197790\", \"04198040\", \"09455187\", \"09455334\", \"11704025\", \"01906397\", \"14782715\", \"04197507\"]}");
	add("{\"term\":\"shellac\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04198193\", \"14725789\"]}");
	add("{\"term\":\"shellbark\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12342390\"]}");
	add("{\"term\":\"sheller\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10608009\"]}");
	add("{\"term\":\"shelley\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11316904\", \"11317022\"]}");
	add("{\"term\":\"shellfire\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00125356\"]}");
	add("{\"term\":\"shellfish\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01943377\", \"07799186\"]}");
	add("{\"term\":\"shellflower\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12378002\", \"12901865\"]}");
	add("{\"term\":\"shelling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00989949\"]}");
	add("{\"term\":\"shelter\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"04199281\", \"13334755\", \"14563562\", \"04198986\", \"04198638\"]}");
	add("{\"term\":\"shelterbelt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04593358\"]}");
	add("{\"term\":\"shelver\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10608132\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }