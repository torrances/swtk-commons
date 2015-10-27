package org.swtk.commons.dict.wordnet.index.name.instance.p.h.y.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePHYT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"phytelephas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12614926\"]}");
	add("{\"term\":\"phytochemical\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15007702\"]}");
	add("{\"term\":\"phytochemist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10450318\"]}");
	add("{\"term\":\"phytochemistry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06099316\"]}");
	add("{\"term\":\"phytohormone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14769020\"]}");
	add("{\"term\":\"phytolacca\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11875591\"]}");
	add("{\"term\":\"phytolaccaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11875229\"]}");
	add("{\"term\":\"phytologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09887676\"]}");
	add("{\"term\":\"phytology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06076105\"]}");
	add("{\"term\":\"phytomastigina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01423296\"]}");
	add("{\"term\":\"phytonadione\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15117509\"]}");
	add("{\"term\":\"phytophthora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13003483\"]}");
	add("{\"term\":\"phytoplankton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01386537\"]}");
	add("{\"term\":\"phytotherapy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00701674\"]}");
	add("{\"term\":\"phytotoxin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15061205\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }