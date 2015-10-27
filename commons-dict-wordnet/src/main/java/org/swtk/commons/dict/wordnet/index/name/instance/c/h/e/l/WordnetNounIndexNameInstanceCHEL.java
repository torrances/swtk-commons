package org.swtk.commons.dict.wordnet.index.name.instance.c.h.e.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCHEL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"chela\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02159184\", \"09704384\"]}");
	add("{\"term\":\"chelate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14643211\"]}");
	add("{\"term\":\"chelation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13467004\", \"13467145\"]}");
	add("{\"term\":\"chelicera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01771237\"]}");
	add("{\"term\":\"chelicerata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01771043\"]}");
	add("{\"term\":\"chelidonium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11923994\"]}");
	add("{\"term\":\"chelifer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01773608\"]}");
	add("{\"term\":\"cheloid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14387318\"]}");
	add("{\"term\":\"chelone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12901723\"]}");
	add("{\"term\":\"chelonethida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01773194\"]}");
	add("{\"term\":\"chelonia\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01664915\", \"01666300\"]}");
	add("{\"term\":\"chelonian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01665263\"]}");
	add("{\"term\":\"chelonidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01665810\"]}");
	add("{\"term\":\"cheloniidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01665810\"]}");
	add("{\"term\":\"chelyabinsk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09032823\"]}");
	add("{\"term\":\"chelydra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01668743\"]}");
	add("{\"term\":\"chelydridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01668402\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }