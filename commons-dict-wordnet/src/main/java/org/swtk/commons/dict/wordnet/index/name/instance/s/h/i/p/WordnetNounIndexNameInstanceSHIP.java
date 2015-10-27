package org.swtk.commons.dict.wordnet.index.name.instance.s.h.i.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSHIP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04201332\"]}");
	add("{\"term\":\"shipbuilder\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08090828\", \"10609338\", \"10610172\"]}");
	add("{\"term\":\"shipbuilding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00914653\"]}");
	add("{\"term\":\"shipload\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13797723\"]}");
	add("{\"term\":\"shipmate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10609554\"]}");
	add("{\"term\":\"shipment\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00062110\", \"02967841\"]}");
	add("{\"term\":\"shipowner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10609647\"]}");
	add("{\"term\":\"shipper\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08498726\", \"10609747\"]}");
	add("{\"term\":\"shipping\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04203545\", \"01107164\"]}");
	add("{\"term\":\"shipside\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08667966\"]}");
	add("{\"term\":\"shipway\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04203380\", \"04572325\"]}");
	add("{\"term\":\"shipworm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01969735\"]}");
	add("{\"term\":\"shipwreck\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07367675\", \"07493858\", \"04204153\"]}");
	add("{\"term\":\"shipwright\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10610172\"]}");
	add("{\"term\":\"shipyard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04204278\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }