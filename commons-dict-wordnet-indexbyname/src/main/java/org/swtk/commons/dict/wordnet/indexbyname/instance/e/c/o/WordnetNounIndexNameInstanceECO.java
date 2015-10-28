package org.swtk.commons.dict.wordnet.indexbyname.instance.e.c.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceECO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ecobabble\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07083114\"]}");
	add("{\"term\":\"ecologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10062971\"]}");
	add("{\"term\":\"ecology\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06080479\", \"14536664\"]}");
	add("{\"term\":\"econometrician\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10063299\"]}");
	add("{\"term\":\"econometrics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06159919\"]}");
	add("{\"term\":\"econometrist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10063299\"]}");
	add("{\"term\":\"economics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06158935\"]}");
	add("{\"term\":\"economiser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10064278\"]}");
	add("{\"term\":\"economist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10063451\"]}");
	add("{\"term\":\"economizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10064278\"]}");
	add("{\"term\":\"economy\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00193462\", \"04900982\", \"05652572\", \"08383680\"]}");
	add("{\"term\":\"ecosoc\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08313641\"]}");
	add("{\"term\":\"ecosystem\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08385684\"]}");
	add("{\"term\":\"ecoterrorism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00765384\"]}");
	add("{\"term\":\"ecotourism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00299177\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }