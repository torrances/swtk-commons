package org.swtk.commons.dict.wordnet.indexbyname.instance.p.o.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePOE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"poe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11260470\"]}");
	add("{\"term\":\"poeciliid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01451592\"]}");
	add("{\"term\":\"poeciliidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01451408\"]}");
	add("{\"term\":\"poecilocapsus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02240382\"]}");
	add("{\"term\":\"poecilogale\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02446314\"]}");
	add("{\"term\":\"poem\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06389065\"]}");
	add("{\"term\":\"poenology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06161930\"]}");
	add("{\"term\":\"poephila\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01546708\"]}");
	add("{\"term\":\"poesy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07107220\"]}");
	add("{\"term\":\"poet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10463768\"]}");
	add("{\"term\":\"poetess\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10466829\"]}");
	add("{\"term\":\"poetics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06179648\"]}");
	add("{\"term\":\"poetiser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10548068\"]}");
	add("{\"term\":\"poetizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10548068\"]}");
	add("{\"term\":\"poetry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07107939\", \"07107220\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }