package org.swtk.commons.dict.wordnet.index.name.instance.p.h.o.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePHOS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"phosgene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15006406\"]}");
	add("{\"term\":\"phosphatase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15006542\"]}");
	add("{\"term\":\"phosphate\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07944818\", \"15006824\"]}");
	add("{\"term\":\"phosphine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15006688\"]}");
	add("{\"term\":\"phosphocreatine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15006980\"]}");
	add("{\"term\":\"phospholipid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15007240\"]}");
	add("{\"term\":\"phosphoprotein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14759404\"]}");
	add("{\"term\":\"phosphor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14673214\"]}");
	add("{\"term\":\"phosphorescence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11511426\"]}");
	add("{\"term\":\"phosphorus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09382368\", \"14673375\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }