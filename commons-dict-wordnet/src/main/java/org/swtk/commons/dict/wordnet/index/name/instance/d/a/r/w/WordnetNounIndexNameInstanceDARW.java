package org.swtk.commons.dict.wordnet.index.name.instance.d.a.r.w;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDARW {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"darwin\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08854050\", \"10943065\"]}");
	add("{\"term\":\"darwinian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10011869\"]}");
	add("{\"term\":\"darwinism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06119698\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }