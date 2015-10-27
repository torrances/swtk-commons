package org.swtk.commons.dict.wordnet.index.name.instance.s.y.n.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSYNA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"synaeresis\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13585842\", \"13585998\"]}");
	add("{\"term\":\"synaesthesia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05728549\"]}");
	add("{\"term\":\"synagogue\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04381822\"]}");
	add("{\"term\":\"synagrops\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02569832\"]}");
	add("{\"term\":\"synanceja\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02646343\"]}");
	add("{\"term\":\"synapse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05481580\"]}");
	add("{\"term\":\"synapsid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01722044\"]}");
	add("{\"term\":\"synapsida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01721816\"]}");
	add("{\"term\":\"synapsis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13585248\"]}");
	add("{\"term\":\"synaptomys\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02348542\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }