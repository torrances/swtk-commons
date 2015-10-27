package org.swtk.commons.dict.wordnet.index.name.instance.e.g.y.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEGYP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"egypt\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08917077\", \"08917311\"]}");
	add("{\"term\":\"egyptian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07002660\", \"09719888\"]}");
	add("{\"term\":\"egyptologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10067630\"]}");
	add("{\"term\":\"egyptology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06154306\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }