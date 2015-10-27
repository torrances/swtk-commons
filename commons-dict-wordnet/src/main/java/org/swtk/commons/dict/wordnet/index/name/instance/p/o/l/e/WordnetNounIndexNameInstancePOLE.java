package org.swtk.commons.dict.wordnet.index.name.instance.p.o.l.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePOLE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pole\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"03983318\", \"03983516\", \"04420286\", \"08638456\", \"08638674\", \"13635960\", \"13672539\", \"05959426\", \"09746969\", \"03983015\"]}");
	add("{\"term\":\"poleax\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03983624\", \"03983788\"]}");
	add("{\"term\":\"poleaxe\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03983624\", \"03983788\"]}");
	add("{\"term\":\"polecat\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02445745\", \"02448346\"]}");
	add("{\"term\":\"polemic\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07198320\", \"10468244\"]}");
	add("{\"term\":\"polemicist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10468244\"]}");
	add("{\"term\":\"polemics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06195193\"]}");
	add("{\"term\":\"polemist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10468244\"]}");
	add("{\"term\":\"polemoniaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12829693\"]}");
	add("{\"term\":\"polemoniales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12828987\"]}");
	add("{\"term\":\"polemonium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12830125\"]}");
	add("{\"term\":\"polenta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07719488\"]}");
	add("{\"term\":\"poler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02390104\"]}");
	add("{\"term\":\"polestar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09419587\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }