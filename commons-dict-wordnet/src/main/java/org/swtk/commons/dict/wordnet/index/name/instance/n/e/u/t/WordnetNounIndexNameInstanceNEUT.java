package org.swtk.commons.dict.wordnet.index.name.instance.n.e.u.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNEUT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"neuter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06340306\"]}");
	add("{\"term\":\"neutering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00693759\"]}");
	add("{\"term\":\"neutral\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10374841\"]}");
	add("{\"term\":\"neutralisation\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00234253\", \"00235290\", \"00235542\", \"13542275\"]}");
	add("{\"term\":\"neutralism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06675457\"]}");
	add("{\"term\":\"neutralist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10375005\"]}");
	add("{\"term\":\"neutrality\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05046973\", \"06214753\", \"01243415\"]}");
	add("{\"term\":\"neutralization\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00234253\", \"00235542\", \"13542275\", \"00235290\"]}");
	add("{\"term\":\"neutrino\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09392309\"]}");
	add("{\"term\":\"neutron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09392431\"]}");
	add("{\"term\":\"neutropenia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14220025\"]}");
	add("{\"term\":\"neutrophil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05461233\"]}");
	add("{\"term\":\"neutrophile\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05461233\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }