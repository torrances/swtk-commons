package org.swtk.commons.dict.wordnet.index.name.instance.d.i.a.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDIAG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"diaghilev\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10953200\"]}");
	add("{\"term\":\"diaglyph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03581612\"]}");
	add("{\"term\":\"diagnosing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00153547\"]}");
	add("{\"term\":\"diagnosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00153547\"]}");
	add("{\"term\":\"diagnostician\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10030728\"]}");
	add("{\"term\":\"diagnostics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06062811\"]}");
	add("{\"term\":\"diagonal\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"06857953\", \"08285242\", \"08287338\", \"13927170\", \"13927331\"]}");
	add("{\"term\":\"diagonalisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05791362\"]}");
	add("{\"term\":\"diagonalization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05791362\"]}");
	add("{\"term\":\"diagram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03191083\"]}");
	add("{\"term\":\"diagramming\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00901905\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }