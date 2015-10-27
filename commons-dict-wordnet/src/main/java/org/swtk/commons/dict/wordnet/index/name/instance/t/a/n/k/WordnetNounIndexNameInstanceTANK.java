package org.swtk.commons.dict.wordnet.index.name.instance.t.a.n.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTANK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tank\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"03107422\", \"04396608\", \"13792669\", \"04395830\", \"04396120\"]}");
	add("{\"term\":\"tanka\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04396427\", \"06393217\"]}");
	add("{\"term\":\"tankage\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00813716\", \"13347125\", \"13786110\"]}");
	add("{\"term\":\"tankard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04396517\"]}");
	add("{\"term\":\"tanker\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10710144\", \"03850710\"]}");
	add("{\"term\":\"tankful\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13792669\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }