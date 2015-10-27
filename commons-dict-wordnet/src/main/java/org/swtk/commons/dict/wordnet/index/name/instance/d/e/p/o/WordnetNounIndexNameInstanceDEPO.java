package org.swtk.commons.dict.wordnet.index.name.instance.d.e.p.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDEPO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"depokene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04526149\"]}");
	add("{\"term\":\"depolarisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11512640\"]}");
	add("{\"term\":\"depolarization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11512640\"]}");
	add("{\"term\":\"deponent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10723554\"]}");
	add("{\"term\":\"depopulation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14542810\"]}");
	add("{\"term\":\"deportation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00208155\", \"00208610\"]}");
	add("{\"term\":\"deportee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10090946\"]}");
	add("{\"term\":\"deportment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04904939\"]}");
	add("{\"term\":\"deposer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10723554\"]}");
	add("{\"term\":\"deposit\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"00373256\", \"03182015\", \"06698605\", \"13370677\", \"13370849\", \"13402318\", \"13483394\", \"09451871\", \"11465491\"]}");
	add("{\"term\":\"depositary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03182015\"]}");
	add("{\"term\":\"deposition\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00209792\", \"00373256\", \"07209159\", \"13483394\"]}");
	add("{\"term\":\"depositor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10024668\"]}");
	add("{\"term\":\"depository\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03182015\"]}");
	add("{\"term\":\"depot\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04336328\", \"04420036\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }