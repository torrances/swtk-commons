package org.swtk.commons.dict.wordnet.index.name.instance.u.l.t.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceULTR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ultracef\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02992633\"]}");
	add("{\"term\":\"ultracentrifugation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13592126\"]}");
	add("{\"term\":\"ultracentrifuge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04513801\"]}");
	add("{\"term\":\"ultraconservative\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10528068\"]}");
	add("{\"term\":\"ultramarine\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04982126\", \"15107713\"]}");
	add("{\"term\":\"ultramicroscope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04513983\"]}");
	add("{\"term\":\"ultramontane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11376013\"]}");
	add("{\"term\":\"ultramontanism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05996535\"]}");
	add("{\"term\":\"ultranationalism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04885841\"]}");
	add("{\"term\":\"ultrasonography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00903487\"]}");
	add("{\"term\":\"ultrasound\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00903487\", \"11501609\"]}");
	add("{\"term\":\"ultrasuede\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04514190\"]}");
	add("{\"term\":\"ultraviolet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11542373\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }