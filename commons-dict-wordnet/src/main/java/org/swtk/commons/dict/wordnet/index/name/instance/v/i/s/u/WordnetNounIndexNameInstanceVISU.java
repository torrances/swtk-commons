package org.swtk.commons.dict.wordnet.index.name.instance.v.i.s.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVISU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"visualisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05945099\"]}");
	add("{\"term\":\"visualiser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10777160\"]}");
	add("{\"term\":\"visualization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05945099\"]}");
	add("{\"term\":\"visualizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10777160\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }