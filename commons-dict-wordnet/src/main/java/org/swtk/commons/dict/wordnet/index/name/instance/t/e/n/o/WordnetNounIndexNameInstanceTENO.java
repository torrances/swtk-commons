package org.swtk.commons.dict.wordnet.index.name.instance.t.e.n.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTENO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tenon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04417046\"]}");
	add("{\"term\":\"tenonitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14379983\"]}");
	add("{\"term\":\"tenor\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"05931082\", \"06207238\", \"10721432\", \"04993303\", \"06885726\"]}");
	add("{\"term\":\"tenoretic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04417325\"]}");
	add("{\"term\":\"tenorist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10721611\"]}");
	add("{\"term\":\"tenormin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02754787\"]}");
	add("{\"term\":\"tenoroon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04417500\"]}");
	add("{\"term\":\"tenosynovitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14380398\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }