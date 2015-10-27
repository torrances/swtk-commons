package org.swtk.commons.dict.wordnet.index.name.instance.t.h.i.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTHIO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"thiobacillus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01365762\"]}");
	add("{\"term\":\"thiobacteria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01365929\"]}");
	add("{\"term\":\"thiobacteriaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01365410\"]}");
	add("{\"term\":\"thiocyanate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15094665\"]}");
	add("{\"term\":\"thiodiphenylamine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14795804\"]}");
	add("{\"term\":\"thioguanine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04431961\"]}");
	add("{\"term\":\"thiopental\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04432071\"]}");
	add("{\"term\":\"thioridazine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04432397\"]}");
	add("{\"term\":\"thiosulfil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04432580\"]}");
	add("{\"term\":\"thiotepa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04432679\"]}");
	add("{\"term\":\"thiothixene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04432791\"]}");
	add("{\"term\":\"thiouracil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15094565\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }